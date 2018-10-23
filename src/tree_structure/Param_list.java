package tree_structure;

import java.util.ArrayList;

class Param_list {
    
    private ArrayList<Param> params;
    private String content = "";
    
    public Param_list(String content){
        this.params = new ArrayList<Param>();
        this.content = content;
    }
    
    public void addParam(Param param){
        this.params.add(param);
    }
    
    public String toString(){
        if(!this.params.isEmpty()){
                for(int i=0; i<params.size(); i++){
                    this.content += params.get(i).toString()+"\n";
                }
               
        }

        return this.content;
    }
}
