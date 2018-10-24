package tree_structure;

import static tree_structure.Main.labelCounter;

public class Complex_selection_statement {
    
    private Exp expression = null;
    private Statement_list statement_list1 = null;
    private Statement_list statement_list2 = null;
    private String content = "";
    
    public Complex_selection_statement(String content){
        this.content = content;
    }
    
    public void setExpression(Exp expression){
        this.expression = expression;
    }
    public void setStatementList1(Statement_list statement_list){
        this.statement_list1 = statement_list;
    }
    public void setStatementList2(Statement_list statement_list){
        this.statement_list2 = statement_list;
    }
    
    public String toString(){
        int bufferLabelCounter = labelCounter;
        labelCounter += 2;
        this.content += this.expression.toString();
        this.content += "if false " + this.expression.getTParam() + " goto label L" + (bufferLabelCounter) + "\n";
        this.content += this.statement_list1.toString()+"\n";
        this.content += "goto L" + (bufferLabelCounter+1)+ "\n";
        this.content += "label L" + bufferLabelCounter  + "\n";
        this.content += this.statement_list2.toString()+"\n";
        this.content += "label L" + (bufferLabelCounter+1)  + "\n";
        return this.content;
    }
    
}
