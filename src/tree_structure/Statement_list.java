package tree_structure;

import java.util.ArrayList;

public class Statement_list {
    
    private ArrayList<Statement_obj> statement_objs;
    private String content = "";
    
    public Statement_list (String content){
        this.statement_objs = new ArrayList<Statement_obj>();
        this.content = content;
    }
    
    public void addStatementObj(Statement_obj statement_obj){
        this.statement_objs.add(statement_obj);

    }

}
