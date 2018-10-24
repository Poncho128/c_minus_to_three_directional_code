package tree_structure;

import static tree_structure.Main.counter;

public class Statement_obj {
    
    private Expression_statement expression_statement = null;
    private Compound_statement compound_statement = null;
    private Selection_statement selection_statement = null;
    private Iteration_statement iteration_statement = null;
    private Return_statement return_statement = null;
    private String content = "";
    
    public Statement_obj(String content){
        this.content = content;
    }
    
    public void setExpressionStatement(Expression_statement expression_statement){
        this.expression_statement = expression_statement;
    }
    public void setCompundStatement(Compound_statement compound_statement){
        this.compound_statement = compound_statement;
    }
    public void setSelectionStatement(Selection_statement selection_statement){
        this.selection_statement = selection_statement;
    }
    public void setIterationStatement(Iteration_statement iteration_statement){
        this.iteration_statement = iteration_statement;
    }
    public void setReturnStatement(Return_statement return_statement){
        this.return_statement = return_statement;
    }
    
    public String toString(){
        if(this.return_statement != null){
            this.content += this.return_statement.toString();      
        }else if (this.iteration_statement!=null){
            this.content += this.iteration_statement.toString();
        }else if (this.selection_statement!=null){
            this.content += this.selection_statement.toString();
        }else if (this.compound_statement!=null){ //pending
            this.content += this.compound_statement.toString();
        }else{
            this.content += this.expression_statement.toString();
        }
        
        return this.content;
    }
    
}
