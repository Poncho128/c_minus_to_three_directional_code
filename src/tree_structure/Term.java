package tree_structure;

import java.util.ArrayList;

public class Term {
    
    private ArrayList<Mulop> mulops;
    private ArrayList<Factor> factors;
    private Factor factor = null;
    private String content = "";
    
    public Term(String content){
        this.mulops = new ArrayList<Mulop>();
        this.factors = new ArrayList<Factor>();
        this.content = content;
    }
    
    public void setFactor(Factor factor){
        this.factor = factor;
    }
    
    public void addMulopFactor(Mulop mulop, Factor factor){
        this.mulops.add(mulop);
        this.factors.add(factor);
    }

}
