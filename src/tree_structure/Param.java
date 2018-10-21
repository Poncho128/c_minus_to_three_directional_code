package tree_structure;

class Param {
    
    private Type_specifier type_specifier = null;
    private Id id = null;
    private Brackets brackets = null;
    private String content = "";
    
    public Param(String content){
        this.content = content;
    }
    
    public void setTypeSpecifier(Type_specifier type_specifier){
        this.type_specifier = type_specifier;
    }
    
    public void setId(Id id){
        this.id = id;
    }
    
    public void setBrackets(Brackets brackets){
        this.brackets = brackets;
    }
    
}
