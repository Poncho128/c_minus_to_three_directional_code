package tree_structure;

public class Call {
    
    private Id id = null;
    private Args args = null;
    private String content = "";
    
    public Call(String content){
        this.content = content;
    }
    
    public void setId(Id id){
        this.id = id;
    }
    public void setArgs(Args args){
        this.args = args;
    }
    
}
