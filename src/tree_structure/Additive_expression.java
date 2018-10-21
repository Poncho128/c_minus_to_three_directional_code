package tree_structure;

import java.util.ArrayList;

class Additive_expression {
    
    private Term term = null;
    private ArrayList <Addop> addops;
    private ArrayList <Term> terms;
    private String content = "";
    
    public Additive_expression(String content){
        this.addops = new ArrayList<Addop>();
        this.terms = new ArrayList<Term>();
        this.content = content;
    }
    
    public void setTerm(Term term){
        this.term = term;
    }
            
    public void addAddopTerm(Addop addop, Term term){
        this.addops.add(addop);
        this.terms.add(term);
    }
    
    @Override
    public String toString(){
        if(this.addops.isEmpty() && this.terms.isEmpty()){
            this.content = this.term.toString();
        }else{
            this.content = this.term.toString();
            
            for(int i=0; i<this.addops.size(); i++){
                this.content += addops.get(i).toString() + terms.get(i).toString();
            }
        }
        return this.content;
    }
    
}
