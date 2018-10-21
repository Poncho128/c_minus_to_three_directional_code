package tree_structure;

import java.util.ArrayList;
import static tree_structure.Main.counter;

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
            this.content = this.term.toString() + "\n";
            counter++;
        }else{
            for(int i=0; i<this.addops.size(); i++){
                if( i == 0){
                    this.content +=  this.term.toString() +  terms.get(i).toString() + "\n";
                    this.content += "t"+counter+" = t"+this.term.getOperationCount()+" "+ addops.get(i).toString() +" t" + terms.get(i).getOperationCount()+"\n";
                }else{
                    this.content +=  this.terms.get(i).toString() + "\n";
                    this.content += "t"+counter+" = t"+(this.terms.get(i).getOperationCount()-1)+" "+ addops.get(i).toString() +" t" + terms.get(i).getOperationCount()+"\n";
                }
                counter++;
            }
        }
        return this.content;
    }
    
}
