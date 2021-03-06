package tree_structure;

class Type_specifier {
    
    private Int_obj int_obj = null;
    private Void_obj void_obj = null;
    private String content = "";
    
    public Type_specifier(String content){
        this.content = content;
    }
    
    public void setIntObj(Int_obj int_obj){
        this.int_obj = int_obj;
    }
    
    public void setVoidObj(Void_obj void_obj){
        this.void_obj = void_obj;
    }
    
    public String toString(){
        if(this.int_obj!=null){
            this.content = this.int_obj.toString();
        }else{
            this.content = this.void_obj.toString();
        }
        
        return this.content;
    }
}
