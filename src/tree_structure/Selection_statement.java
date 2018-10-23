package tree_structure;

public class Selection_statement {
    
    private Simple_selection_statement simple_selection_statement = null;
    private Complex_selection_statement complex_selection_statement = null;
    private String content = "";
    
    public Selection_statement(String content){
        this.content = content;
    }
    
    public void setSimpleSelectionStatement(Simple_selection_statement simple_selection_statement){
        this.simple_selection_statement = simple_selection_statement;
    }
    
    public void setComplexSelectionStatement(Complex_selection_statement complex_selection_statement){
        this.complex_selection_statement = complex_selection_statement;
    }
    
    public String toString(){
        
        if(this.simple_selection_statement !=null){    
            this.content = this.simple_selection_statement.toString();
        }else{
            this.content = this.complex_selection_statement.toString();
        }
        
        return this.content;
    }
    
}
