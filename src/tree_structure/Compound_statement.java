package tree_structure;

public class Compound_statement {
    
    private Local_declarations local_declarations = null;
    private Statement_list statement_list = null;
    private String content = "";
    
    public Compound_statement(String content){
        this.content = content;
    }
    
    public void setStatementList(Statement_list statement_list){
        this.statement_list = statement_list;
    }
    
    public void setLocalDeclarations(Local_declarations local_declarations){
        this.local_declarations = local_declarations;
    }
        
    
}
