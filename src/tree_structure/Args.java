package tree_structure;

public class Args {
    
    private Arg_list arg_list = null;
    private String content = "";
    private int args_amount = 0;
    
    public Args(String content){
        this.content = content;
    }
    
    public void setArgList(Arg_list arg_list){
        this.arg_list = arg_list;
    }
        
    public int getArgsAmount(){
        return this.args_amount;
    }
    
    public String toString(){
        if(this.arg_list != null){
            this.content = arg_list.toString();
            this.args_amount = arg_list.getArgsAmount();
        }
        
        return this.content;
    }
}
