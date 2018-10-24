package tree_structure;

import static tree_structure.Main.counter;
import static tree_structure.Main.labelCounter;

public class Iteration_statement {
    
    private Exp expression = null;
    private Statement_list statement_list = null;
    private String content = "";
    
    public Iteration_statement(String content){
        this.content = content;
    }
    
    public void setExp(Exp expression){
        this.expression = expression;
    }
    
    public void setStatementList(Statement_list statement_list){
        this.statement_list = statement_list;
    }
    
    @Override
    public String toString(){
        int bufferLabelCounter = labelCounter;
        labelCounter += 2;
        
        this.content += this.expression.toString();
        this.content += "label L" + bufferLabelCounter  + "\n";
        
        this.content += "t" + counter  + " = " + this.expression.getTParam() +"\n";       
        this.content += "if false t" + counter  + " goto label L" + (bufferLabelCounter+1) + "\n";
        counter++;
        
        this.content += this.statement_list.toString()+"\n";
        this.content += "goto label L" + bufferLabelCounter + "\n";
        this.content += "label L" + (bufferLabelCounter+1)  + "\n";
        return this.content;
    }
}
