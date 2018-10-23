package tree_structure;

import static tree_structure.Main.counter;

public class Iteration_statement {
    
    private Exp expression = null;
    private Statement_obj statement_obj = null;
    private String content = "";
    
    public Iteration_statement(String content){
        this.content = content;
    }
    
    public void setExp(Exp expression){
        this.expression = expression;
    }
    
    public void setStatementList(Statement_obj statement_obj){
        this.statement_obj = statement_obj;
    }
}
