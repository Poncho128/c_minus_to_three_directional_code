package tree_structure;

public class Statement_obj {
    
    private Expression_statement expression_statement = null;
    private Compound_statement compound_statement = null;
    private Selection_statement selection_statement = null;
    private Iteration_statement iteration_statement = null;
    private Return_statement return_statement = null;
    private String content = "";
    
    public Statement_obj(String content){
        this.content = content;
    }
    
    private void SetExpressionStatement(Expression_statement expression_statement){
        this.expression_statement = expression_statement;
    }
    private void SetCompundStatement(Compound_statement compound_statement){
        this.compound_statement = compound_statement;
    }
    private void SetSelectionStatement(Selection_statement selection_statement){
        this.selection_statement = selection_statement;
    }
    private void setIterationStatement(Iteration_statement iteration_statement){
        this.iteration_statement = iteration_statement;
    }
    private void setReturnStatement(Return_statement return_statement){
        this.return_statement = return_statement;
    }
    
}
