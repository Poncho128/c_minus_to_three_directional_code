package tree_structure;

class Simple_expression {
    
    private Additive_expression additive_expression_1 = null;
    private Relop relop = null;
    private Additive_expression additive_expression_2 = null;
    private String content = "";
    
    public Simple_expression(String content){
        this.content = content;
    }
    
    public void setAdditiveExpression1(Additive_expression additive_expression_1){
        this.additive_expression_1 = additive_expression_1;
    }
    
    public void setRelop(Relop relop){
        this.relop = relop;
    }
        
    public void setAdditiveExpression2(Additive_expression additive_expression_2){
        this.additive_expression_2 = additive_expression_2;
    }
}
