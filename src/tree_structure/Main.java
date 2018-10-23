package tree_structure;

public class Main {
    
    public static int counter = 0;
    public static int labelCounter = 0;
    
    public static void main(String[] args) {
       
        
        //__________________________________________________Expression Template_____________________________________________
        
        Num num = new Num("1");
        Factor factor = new Factor("");
        factor.setNum(num);
        Term term = new Term("");
        term.setFactor(factor);
        Additive_expression additive_expression = new Additive_expression("");
        additive_expression.setTerm(term);
        Simple_expression simple_expression = new Simple_expression("");
        simple_expression.setAdditiveExpression1(additive_expression);
        Exp expression = new Exp("");
        expression.setSimpleExpression(simple_expression);
        
        //____________________________________________________________________________________________________________________
        
        Num num1 = new Num("2");
        Factor factor1 = new Factor("");
        factor1.setNum(num1);
        Term term1 = new Term("");
        term1.setFactor(factor1);
        Additive_expression additive_expression1 = new Additive_expression("");
        additive_expression1.setTerm(term1);
        Simple_expression simple_expression1 = new Simple_expression("");
        simple_expression1.setAdditiveExpression1(additive_expression1);
        Exp expression1 = new Exp("");
        expression1.setSimpleExpression(simple_expression1);
        
        //____________________________________________________________________________________________________________________
        
       
        Num num2 = new Num("3");
        Factor factor2 = new Factor("");
        factor2.setNum(num2);
        Term term2 = new Term("");
        term2.setFactor(factor2);
        Additive_expression additive_expression2 = new Additive_expression("");
        additive_expression2.setTerm(term2);
        Simple_expression simple_expression2 = new Simple_expression("");
        simple_expression2.setAdditiveExpression1(additive_expression2);
        Exp expression2 = new Exp("");
        expression2.setSimpleExpression(simple_expression2);
        
        //____________________________________________________________________________________________________________________
        
        
        Return_statement return_statement1 = new Return_statement("");
        return_statement1.setExp(expression1);
        Statement_obj statement_obj1 = new Statement_obj("");
        statement_obj1.setReturnStatement(return_statement1);
        
        Return_statement return_statement2 = new Return_statement("");
        return_statement2.setExp(expression2);
        Statement_obj statement_obj2 = new Statement_obj("");
        statement_obj2.setReturnStatement(return_statement2);
        
        
        
        //__________Simple Selection_________________________________________________________________________________________
        
        
        //Simple_selection_statement simple_selection_statement = new Simple_selection_statement("");
        //simple_selection_statement.setExpression(expression);
        //simple_selection_statement.setStatementList1(statement_obj1);
        
        //____________________________________________________________________________________________________________________
        
        //__________Complex Selection_________________________________________________________________________________________
        
        
        Complex_selection_statement complex_selection_statement = new Complex_selection_statement("");
        complex_selection_statement.setExpression(expression);
        complex_selection_statement.setStatementObj1(statement_obj1);
        complex_selection_statement.setStatementObj2(statement_obj2);
        
        //____________________________________________________________________________________________________________________
        
        
        System.out.println(complex_selection_statement);
        
        
        
    }
    
}
