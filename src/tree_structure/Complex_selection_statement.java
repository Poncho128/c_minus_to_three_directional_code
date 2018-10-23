package tree_structure;

import static tree_structure.Main.labelCounter;

public class Complex_selection_statement {
    
    private Exp expression = null;
    private Statement_obj statement_obj1 = null;
    private Statement_obj statement_obj2 = null;
    private String content = "";
    
    public Complex_selection_statement(String content){
        this.content = content;
    }
    
    public void setExpression(Exp expression){
        this.expression = expression;
    }
    public void setStatementObj1(Statement_obj statement_obj){
        this.statement_obj1 = statement_obj;
    }
    public void setStatementObj2(Statement_obj statement_obj){
        this.statement_obj2 = statement_obj;
    }
    
    public String toString(){
        int bufferLabelCounter = labelCounter;
        labelCounter += 2;
        this.content += this.expression.toString();
        this.content += "if false " + this.expression.getTParam() + " goto label L" + (bufferLabelCounter) + "\n";
        this.content += this.statement_obj1.toString()+"\n";
        this.content += "goto L" + (bufferLabelCounter+1)+ "\n";
        this.content += "label L" + bufferLabelCounter  + "\n";
        this.content += this.statement_obj2.toString()+"\n";
        this.content += "label L" + (bufferLabelCounter+1)  + "\n";
        return this.content;
    }
    
}
