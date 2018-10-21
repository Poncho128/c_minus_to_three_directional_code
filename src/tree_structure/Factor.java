package tree_structure;

public class Factor {
    
    private Exp expression = null;
    private Call call = null;
    private Var var = null;
    private Num num = null;
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
    
    public void setNum(Num num){
        this.num = num;
    }
    
    public String toString(){
        if(this.expression!= null){
            this.content = "(" + this.expression.toString() +")";
        }else if (this.call != null){
            this.content = this.call.toString();
        }else if (this.var!=null){
            this.content = this.var.toString();
        }else if (this.num!=null){
            this.content = this.num.toString();
        }
        
        return this.content;
    }
 
}
