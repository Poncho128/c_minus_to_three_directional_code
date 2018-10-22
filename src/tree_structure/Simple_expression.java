package tree_structure;

import static tree_structure.Main.counter;

class Simple_expression {
    
    private Additive_expression additive_expression_1 = null;
    private Relop relop = null;
    private Additive_expression additive_expression_2 = null;
    private String content = "";
    private String t_param = "";
    
    public Simple_expression(String content){
        this.content = content;
    }
    
    public void setAdditiveExpression1(Additive_expression additive_expression_1){
        this.additive_expression_1 = additive_expression_1;
    }
    
    public void setRelop(Relop relop){
        this.relop = relop;
    }
        
    public void setAdditiveExpression2(Additive_expression additive_expression_2){
        this.additive_expression_2 = additive_expression_2;
    }
    
    public String getTParam(){
        return this.t_param;
    }
    
    @Override
    public String toString(){
        if(additive_expression_2 == null){
            this.content = this.additive_expression_1.toString() + "\n";
        }else{
            this.content +=  this.additive_expression_1.toString() +  this.additive_expression_2.toString() + "\n";
            counter++;
            this.content += "t"+counter+" = t"+this.additive_expression_1.getOperationCount()+" "+ relop.toString() +" t" + this.additive_expression_2.getOperationCount()+"\n";
        }
        this.t_param = "t"+counter;
        counter++;
        
        return this.content;
    }
    
}
