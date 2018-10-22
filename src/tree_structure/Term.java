package tree_structure;

import java.util.ArrayList;
import static tree_structure.Main.counter;

public class Term {
    
    private int operation_count = 0;
    
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
    
    public int getOperationCount(){
        return this.operation_count;
    }
    
    @Override
    public String toString(){
        if(this.mulops.isEmpty() && this.factors.isEmpty()){
            this.content = "t"+counter + " = " + this.factor.toString() + "\n";
            this.operation_count = counter;
        }else{
            
            for(int i=0; i<this.mulops.size(); i++){
                if( i == 0){
                    this.content += "t"+counter + " = " + this.factor.toString() + mulops.get(i).toString() + factors.get(i).toString() + "\n";
                }else{
                    this.content += "t"+counter + " = " + "t" + (counter-1) + mulops.get(i).toString() + factors.get(i).toString() + "\n";
                }
                this.operation_count = counter;
                counter++;
            }
        }
        return this.content;
    }

}
