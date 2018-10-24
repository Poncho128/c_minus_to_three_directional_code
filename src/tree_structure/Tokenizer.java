package tree_structure;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Tokenizer {
    
    public Tokenizer(){
    
    }
    
    public boolean isNumeric(String str){  
        try{  
            double d = Double.parseDouble(str);  
        } catch(NumberFormatException e){  
            return false;  
        }  
        return true;  
    }
    
    public ArrayList<String> populate() throws IOException{
        File file = new File("C:\\Users\\ponch\\Documents\\NetBeansProjects\\C_minus\\c_minus_to_three_directional_code\\src\\tree_structure\\input.txt");
        Scanner input = new Scanner(file); 
        
        ArrayList<String> tokens = new ArrayList<>();
        
        while (input.hasNext()){
            String word  = input.next();
            
      
            if(isNumeric(word)){
                tokens.add("NUM");
                tokens.add(word);
            }
            
            else if(word.equals("[]")){
                tokens.add("brackets");
            }
        
            else if(word.equals("<=") || word.equals("<") || word.equals(">") || word.equals(">=") || word.equals("==") || word.equals("!=")){
                tokens.add("relop");
                tokens.add(word);
            }
            
            else if(word.equals("+") || word.equals("-")){
                tokens.add("addop");
                tokens.add(word);
            }
            
            else if(word.equals("*") || word.equals("/")){
                tokens.add("mulop");
                tokens.add(word);
            }
            
            else if(word.equals("int") || word.equals("void")){
                tokens.add(word);
            }
            
            else if(word.equals("if") || word.equals("else")){
                tokens.add(word);
            }
            
            else if(word.equals("while")){
                tokens.add(word);
            }
            
            else if(word.equals("return")){
                tokens.add(word);
            }
            
            else if(word.equals(",") || word.equals(";")){
                tokens.add(word);
            }
            
            else if(word.equals("(") || word.equals(")") || word.equals("[") || word.equals("]") || word.equals("{") || word.equals("}")){
                tokens.add(word);
            }
            
            else if(word.equals("=") || word.equals("equals")){
                tokens.add(word);
            }
            
            else{
                tokens.add("ID");
                tokens.add(word);
            }
        }
        
        return tokens;
    } 
}
