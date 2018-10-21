package tree_structure;

import java.util.ArrayList;

public class Arg_list {
     
    private ArrayList<Exp> expressions;
    private String content = "";
  
    public Arg_list(String content){
        this.expressions = new ArrayList<Exp>();
        this.content = content;   
    }
    
    public void addExp(Exp expression){
        this.expressions.add(expression);
    }
    
}