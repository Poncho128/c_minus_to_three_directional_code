package tree_structure;

import static tree_structure.Main.counter;

public class Exp {
	
	private Var var = null;
        private Exp expression = null;
        private Simple_expression simple_expression = null;
        private String content = "";
        private String t_param = "";
        
        private Exp extra_expression1 = null;
        private Exp extra_expression2 = null;
        private Mulop mulop = null;
        private Addop addop = null;
        private Relop relop = null;
        
        private Call call = null;
        
	
	public Exp(String content){
            this.content = content;
	}
        
        public void setVar(Var var){
            this.var = var;
        }
        
        public void setExp(Exp expression){
            this.expression = expression;
        }
        
        public void setSimpleExpression(Simple_expression simple_expression){
            this.simple_expression = simple_expression;
        }
        
        public void setExtraExpression1(Exp expression){
            this.extra_expression1 = expression;
        }
        
        public void setExtraExpression2(Exp expression){
            this.extra_expression2 = expression;
        }
        
        public void setMulop(Mulop mulop){
            this.mulop = mulop;
        }
        
        public void setAddop(Addop addop){
            this.addop = addop;
        }
        
        public void setRelop(Relop relop){
            this.relop = relop;
        }
        
        public void setCall(Call call){
            this.call = call;
        }
        
        public String getTParam(){
            return this.t_param;
        }
        
        @Override
        public String toString(){
            if (this.call != null){//pending
                this.content = this.call.toString();
            }else if(this.extra_expression1!=null && this.extra_expression2 != null){
                if(this.mulop != null){
                    this.content += this.extra_expression1.toString();
                    this.content += this.extra_expression2.toString();
                    this.content += "t"+counter+ " = " + this.extra_expression1.getTParam() + this.mulop.toString() + this.extra_expression2.getTParam();
                    this.t_param = "t"+counter;
                    counter++;
                }else if(this.addop != null){
                    this.content += this.extra_expression1.toString();
                    this.content += this.extra_expression2.toString();
                    this.content += "t"+counter+ " = " + this.extra_expression1.getTParam() + this.addop.toString() + this.extra_expression2.getTParam();
                    this.t_param = "t"+counter;
                    counter++;
                }else if (this.relop != null){
                    this.content += this.extra_expression1.toString();
                    this.content += this.extra_expression2.toString();
                    this.content += "t"+counter+ " = " + this.extra_expression1.getTParam() + this.relop.toString() + this.extra_expression2.getTParam();
                    this.t_param = "t"+counter;
                    counter++;
                }
                this.content = this.simple_expression.toString();
                this.t_param = this.simple_expression.getTParam();//Setting t_param for future use
                
            }else if(this.var==null && this.expression == null){
                this.content = this.simple_expression.toString();
                this.t_param = this.simple_expression.getTParam();//Setting t_param for future use
            }else{
                this.content += this.expression.toString();
                this.content += this.var.toString() + " = " + this.expression.getTParam()+"\n";
                this.t_param = this.var.getTParam();//Setting t_param for future use
            }
            
            return this.content;
        }
}
