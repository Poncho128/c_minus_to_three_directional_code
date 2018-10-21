package tree_structure;

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
    
}
