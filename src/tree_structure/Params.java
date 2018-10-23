package tree_structure;

class Params {
    
    private Param_list param_list = null;
    private Void_obj void_obj = null;
    private String content = "";
    
    public Params(String content){
        this.content = content;
    }
    
    public void setParamList(Param_list param_list){
        this.param_list = param_list;
    }
    
    public void setVoidObj(Void_obj void_obj){
        this.void_obj = void_obj;
    }
    
    public String toString(){
        
        if(this.param_list!= null){
            this.content = this.param_list.toString();
        }else{
            this.content = this.void_obj.toString();
        }
        return this.content;
    }
}
