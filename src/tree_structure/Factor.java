package tree_structure;

public class Factor {
    
    private Exp expression = null;
    private Call call = null;
    private Var var = null;
    private String content = "";
    
    public Factor(String content){
        this.content = content;
    }
    
    public void setExp(Exp expression){
        this.expression = expression;
    }
    public void setCall(Call call){
        this.call = call;
    }
    public void setVar(Var var){
        this.var = var;
    }
    
    
 
}
