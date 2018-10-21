package tree_structure;

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
    
    public void setStatementList1(Statement_obj statement_obj){
        this.statement_obj = statement_obj;
    }
    
}
