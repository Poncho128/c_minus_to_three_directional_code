package tree_structure;

import java.util.ArrayList;

public class Declaration_list {
    
    private ArrayList<Declaration> declarations;
    private String content = "";
    
    public Declaration_list(String content){
        this.declarations = new ArrayList<Declaration>();
        this.content = content;
    }
    
    public void addDeclaration(Declaration declaration){
        this.declarations.add(declaration);
    }
    
    public String toString(){
        if(!this.declarations.isEmpty()){
                for(int i=0; i<declarations.size(); i++){
                    this.content += declarations.get(i).toString();
                }
               
        }

        return this.content;
    }
}
