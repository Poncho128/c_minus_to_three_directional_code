package tree_structure;

public class Program {
    
    private Declaration_list declaration_list = null;
    private String content = "";
    
    public Program(String content){
        this.content = content;
    }
    
    public void setDeclarationList(Declaration_list declaration_list){
        this.declaration_list = declaration_list;
    }
}
