package tree_structure;

public class Args {
    
    private Arg_list arg_list = null;
    private String content = "";
    
    public Args(String content){
        this.content = content;
    }
    
    public void setArgList(Arg_list arg_list){
        this.arg_list = arg_list;
    }
    
}
