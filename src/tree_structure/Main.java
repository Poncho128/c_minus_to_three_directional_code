package tree_structure;

public class Main {
    
    public static int counter = 0;
    
    public static void main(String[] args) {
        
        Mulop mulop = new Mulop("*");
        Mulop mulop1 = new Mulop("/");
        Factor factor1 = new Factor("1");
        Factor factor2 = new Factor("2");
        Factor factor3 = new Factor("3");
        Factor factor4 = new Factor("4");
        Factor factor5 = new Factor("5");
        Factor factor6 = new Factor("6");
        
        Factor factor7 = new Factor("7");
        
     
        Term term = new Term ("");
        term.setFactor(factor1);
        term.addMulopFactor(mulop, factor2);
        term.addMulopFactor(mulop1, factor3);
        
        Term term2 = new Term ("");
        term2.setFactor(factor4);
        term2.addMulopFactor(mulop, factor5);
        term2.addMulopFactor(mulop1, factor6);
        
        Term term3 = new Term ("");
        term3.setFactor(factor7);
        
        Additive_expression additive_expression = new Additive_expression("");
        additive_expression.setTerm(term);
        
        Addop addop = new Addop("+");
        Addop addop2 = new Addop("-");
        additive_expression.addAddopTerm(addop, term2);
        additive_expression.addAddopTerm(addop2, term3);
        additive_expression.addAddopTerm(addop2, term3);
        
        
        Additive_expression additive_expression1 = new Additive_expression("");
        Term term4 = new Term("");
        Factor factor8 = new Factor("8");
        term4.setFactor(factor8);
        additive_expression1.setTerm(term4);
        
        Simple_expression simple_expression = new Simple_expression("");
        Relop relop = new Relop("<");
        
        simple_expression.setAdditiveExpression1(additive_expression);
        simple_expression.setRelop(relop);
        simple_expression.setAdditiveExpression2(additive_expression1);
        
        Exp expression = new Exp("");
        expression.setSimpleExpression(simple_expression);
        
        Id id = new Id("popo");
        Var var = new Var("");
        var.setId(id);
        var.setExp(expression);
        
        System.out.println(var);
    }
    
}
