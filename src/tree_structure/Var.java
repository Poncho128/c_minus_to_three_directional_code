package tree_structure;

class Var {
    
    private Id id = null;
    private Exp expression = null;
    private String content = "";
    
    public Var(String content){
        this.content = content;
    }
    
    public void setId(Id id){
        this.id = id;
    }
    
    public void setExp(Exp expression){
        this.expression = expression;
    }
}
