package tree_structure;

public class Var_declaration {
    
    private Type_specifier type_specifier = null;
    private Id id = null;
    private Num num = null;
    private String content = "";
    
    public Var_declaration(String content){
        this.content = content;
    }
    
    public void setTypeSpecifier(Type_specifier type_specifier){
        this.type_specifier = type_specifier;
    }
    
    public void setId(Id id){
        this.id = id;
    }
    
    public void setNum(Num num){
        this.num = num;
    }
    
    public String toString(){
        if(this.num==null){
            this.content = this.type_specifier.toString() + " " + this.id.toString();
        }else{
            this.content = this.type_specifier.toString() + " " + this.id.toString() + "["+ this.num.toString() +"]";
        }
        
        return this.content;
    }
}
