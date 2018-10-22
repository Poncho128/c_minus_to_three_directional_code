package tree_structure;

import static tree_structure.Main.counter;

class Var {
    
    private Id id = null;
    private Exp expression = null;
    private String content = "";
    private String t_param = "";
    
    public Var(String content){
        this.content = content;
    }
    
    public void setId(Id id){
        this.id = id;
    }
    
    public void setExp(Exp expression){
        this.expression = expression;
    }
    
    public String getTParam(){
        return this.t_param;
    }
    
    @Override
    public String toString(){
        if(this.expression == null){
            this.content += this.id.toString();
            this.t_param = this.id.toString();
        }else{
            this.content += this.expression.toString(); 
            this.content += "t"+counter+" = t"+ (counter-1)+" * element_size("+this.id.toString()+")\n";
            counter++;
            this.content += "t"+counter+" = &"+this.id.toString() + " + t"+ (counter-1);
            this.t_param = "t"+counter;
        }
        return this.content;
    }
}
