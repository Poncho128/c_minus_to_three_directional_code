package tree_structure;

import java.util.ArrayList;

public class Local_declarations {
    
    private ArrayList<Var_declaration> var_declarations;
    private String content = "";
    
    public Local_declarations (String content){
        this.var_declarations = new ArrayList<Var_declaration>();
        this.content = content;
    }
    
    public void addVarDeclaration(Var_declaration var_declaration){
        this.var_declarations.add(var_declaration);

    }
}
