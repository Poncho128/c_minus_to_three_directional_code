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
}
