package tree_structure;

public class Declaration {
    
    private Var_declaration var_declaration = null;
    private Fun_declaration fun_declaration = null;
    private String content = "";
    
    public Declaration(String content){
        this.content = content;
    }
    
    public void setVarDeclaration(Var_declaration var_declaration){
        this.var_declaration = var_declaration;
    }
    
    public void setFunDeclaration(Fun_declaration fun_declaration){
        this.fun_declaration = fun_declaration;
    }
}
