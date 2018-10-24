package tree_structure;

import static tree_structure.Main.labelCounter;

public class Simple_selection_statement {
    
    private Exp expression = null;
    private Statement_obj statement_obj = null;
    private String content = "";
    
    public Simple_selection_statement(String content){
        this.content = content;
    }
    
    public void setExpression(Exp expression){
        this.expression = expression;
    }
    
    public void setStatementObj(Statement_obj statement_obj){
        this.statement_obj = statement_obj;
    }
    
    public String toString(){
        int bufferLabelCounter = labelCounter;
        labelCounter++;
        this.content += this.expression.toString();
        this.content += "if false " + this.expression.getTParam() + " goto label L" + bufferLabelCounter + "\n";
        this.content += this.statement_obj.toString()+"\n";
        this.content += "label L" + bufferLabelCounter  + "\n";
        return this.content;
    }
    
}
