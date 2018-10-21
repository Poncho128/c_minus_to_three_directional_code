package tree_structure;

public class Main {
    
    
    public static void main(String[] args) {
        
        Mulop mulop = new Mulop("*");
        Mulop mulop1 = new Mulop("/");
        Factor factor1 = new Factor("5");
        Factor factor2 = new Factor("4");
        Factor factor3 = new Factor("10");
        Term term = new Term ("");
        term.setFactor(factor1);
        term.addMulopFactor(mulop, factor2);
        term.addMulopFactor(mulop1, factor3);
        
        Additive_expression additive_expression = new Additive_expression("");
        additive_expression.setTerm(term);
        
        Addop addop = new Addop("+");
        additive_expression.addAddopTerm(addop, term);
        
        Simple_expression simple_expression = new Simple_expression("");
        Relop relop = new Relop("<");
        
        simple_expression.setAdditiveExpression1(additive_expression);
        simple_expression.setRelop(relop);
        simple_expression.setAdditiveExpression2(additive_expression);
        
        
        System.out.println(simple_expression);
    }
    
}
