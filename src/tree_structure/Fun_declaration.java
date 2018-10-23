package tree_structure;

public class Fun_declaration {
    
    private Type_specifier type_specifier = null;
    private Id id = null;
    private Params params = null;
    private Compound_statement compound_statement = null;
    private String content = "";
    
    public Fun_declaration(String content){
        this.content = content;
    }
    
    public void setTypeSpecifier(Type_specifier type_specifier){
        this.type_specifier = type_specifier;
    }
    
    public void setId(Id id){
        this.id = id;
    }
    
    public void setParams(Params params){
        this.params = params;
    }
    
    public void setCompoundStatement(Compound_statement compound_statement){
        this.compound_statement = compound_statement;
    }
    
    @Override
    public String toString(){
        this.content += this.id.toString()+":\n";
        this.content += "BeginFunction\n";
        this.content += this.compound_statement.toString();
        this.content += "\nEndFunction";
        return this.content;
    }
}
