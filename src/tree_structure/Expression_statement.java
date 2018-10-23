package tree_structure;

public class Expression_statement {
	
	private Exp expression = null;
        private String content = ";";
	
	public Expression_statement(String content){
            this.content = content;
	}
        
        public void setExp(Exp expression){
            this.expression = expression;
        }
        
        @Override
        public String toString(){
            if (this.expression != null){
                this.content = this.expression.toString()+";";
            }

            return this.content;
        }
}

