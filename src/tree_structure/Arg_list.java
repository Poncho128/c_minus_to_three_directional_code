package tree_structure;

import java.util.ArrayList;

public class Arg_list {
     
    private ArrayList<Exp> expressions;
    private String content = "";
    private int args_amount = 0;
  
    public Arg_list(String content){
        this.expressions = new ArrayList<Exp>();
        this.content = content;   
    }
    
    public void addExp(Exp expression){
        this.expressions.add(expression);
    }
    
    public int getArgsAmount(){
        return this.args_amount;
    }
    
    public String toString(){
        if(!this.expressions.isEmpty()){
            for(int i=0; i<expressions.size(); i++){
                this.content += expressions.get(i).toString();
            }
            for(int i=0; i<expressions.size(); i++){
                this.content += "PushParam "+expressions.get(i).getTParam()+";\n";
            }
            this.args_amount = expressions.size();
        }
        
        return this.content;
    }
    
}
