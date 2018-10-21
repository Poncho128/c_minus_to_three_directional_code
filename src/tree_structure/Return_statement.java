package tree_structure;

public class Return_statement {
    
    private Exp expression = null;
    private String content = "";
    
    public Return_statement(String content){
        this.content = content;
    }
    
    public void setExp(Exp expression){
        this.expression = expression;
    }
}
