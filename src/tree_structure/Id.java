package tree_structure;

public class Id {
    
    private String content = "";
    
    Id (String content){
        this.content = content;
    }
    
    @Override
    public String toString(){
        return this.content;
    }
    
}
