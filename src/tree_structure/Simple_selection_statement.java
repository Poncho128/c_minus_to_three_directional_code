package tree_structure;

import static tree_structure.Main.labelCounter;

public class Simple_selection_statement {
    
    private Exp expression = null;
    private Statement_list statement_list = null;
    private String content = "";
    
    public Simple_selection_statement(String content){
        this.content = content;
    }
    
    public void setExpression(Exp expression){
        this.expression = expression;
    }
    
    public void setStatementList(Statement_list statement_list){
        this.statement_list = statement_list;
    }
    
    public String toString(){
        int bufferLabelCounter = labelCounter;
        labelCounter++;
        this.content += this.expression.toString();
        this.content += "if false " + this.expression.getTParam() + " goto label L" + bufferLabelCounter + "\n";
        this.content += this.statement_list.toString()+"\n";
        this.content += "label L" + bufferLabelCounter  + "\n";
        return this.content;
    }
    
}
