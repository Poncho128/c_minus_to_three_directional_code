package tree_structure;

import static tree_structure.Main.counter;

public class Return_statement {
    
    private Exp expression = null;
    private String content = "";
    
    public Return_statement(String content){
        this.content = content;
    }
    
    public void setExp(Exp expression){
        this.expression = expression;
    }
    
    public String toString(){
        
        if(this.expression != null){
            this.content += this.expression.toString();
            this.content += "return " + this.expression.getTParam(); 
        }else{
            this.content += "return";
        }
        return this.content;
    }
}
