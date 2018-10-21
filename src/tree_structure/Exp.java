package tree_structure;

public class Exp {
	
	private Var var = null;
        private Exp expression = null;
        private Simple_expression simple_expression = null;
        private String content = "";
	
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
        
        @Override
        public String toString(){
            
            if(this.var==null && this.expression == null){
                this.content = this.simple_expression.toString();
            }else{
                this.content = this.var.toString() + " = " + this.expression.toString();
            }
            
            return this.content;
        }
}
