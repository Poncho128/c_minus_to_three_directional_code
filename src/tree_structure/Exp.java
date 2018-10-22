package tree_structure;

public class Exp {
	
	private Var var = null;
        private Exp expression = null;
        private Simple_expression simple_expression = null;
        private String content = "";
        private String t_param = "";
	
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
        
        public String getTParam(){
            return this.t_param;
        }
        
        @Override
        public String toString(){
            
            if(this.var==null && this.expression == null){
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
