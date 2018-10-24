package tree_structure;

import java.io.IOException;
import java.util.ArrayList;

public class Main {
    
    public static int counter = 0;
    public static int labelCounter = 0;
    
    public static int idCounter = 0;
    public static int numCounter = 0;
    public static int relopCounter = 0;
    public static int mulopCounter = 0;
    public static int addopCounter = 0;
    public static int intObjCounter = 0;
    public static int voidObjCounter = 0;
    public static int bracketsCounter = 0;
    public static int typeSpecifierCounter = 0;
    public static int paramsCounter = 0;
    public static int varDeclarationCounter = 0;
    public static int paramCounter = 0;
    public static int factorCounter = 0;
    public static int paramListCounter = 0;
    public static int localDeclarationsCounter = 0;
    public static int termCounter = 0;
    public static int declarationCounter = 0;
    public static int additiveExpressionCounter = 0;
    public static int simpleExpressionCounter = 0;
    public static int expressionCounter = 0;
    public static int varCounter = 0;
    public static int argListCounter = 0;
    public static int argsCounter = 0;
    public static int callCounter = 0;
    
    public static void main(String[] args) throws IOException {
        
        //--------------------------------------------setup--------------------------//
        Tokenizer tokenizer = new Tokenizer();
        
        ArrayList<String> tokens = new ArrayList<String>();
        tokens  = tokenizer.populate();
        
        ArrayList<Integer> indexes = new ArrayList<Integer>(tokens.size());
        
        for(int i= 0; i< tokens.size(); i++){
            indexes.add(0);
        }
        
        
        //---------------------------------------------------------------------------//
        
        //----------------------------arrayList zone---------------------------------//
        
         ArrayList<Id> id_arr = new ArrayList<Id>();
         ArrayList<Num> num_arr = new ArrayList<Num>();
         ArrayList<Relop> relop_arr = new ArrayList<Relop>();
         ArrayList<Mulop> mulop_arr = new ArrayList<Mulop>();
         ArrayList<Addop> addop_arr = new ArrayList<Addop>();
         ArrayList<Int_obj> int_obj_arr = new ArrayList<Int_obj>();
         ArrayList<Void_obj> void_obj_arr = new ArrayList<Void_obj>();
         ArrayList<Brackets> brackets_arr = new ArrayList<Brackets>();
         ArrayList<Type_specifier> type_specifier_arr = new ArrayList<Type_specifier>();
         ArrayList<Params> params_arr = new ArrayList<Params>();
         ArrayList<Var_declaration> var_declaration_arr = new ArrayList<Var_declaration>();
         ArrayList<Param> param_arr = new ArrayList<Param>();
         ArrayList<Factor> factor_arr = new ArrayList<Factor>();
         ArrayList<Param_list> param_list_arr = new ArrayList<Param_list>();
         ArrayList<Local_declarations> local_declarations_arr = new ArrayList<Local_declarations>();
         ArrayList<Term> term_arr = new ArrayList<Term>();
         ArrayList<Declaration> declaration_arr = new ArrayList<Declaration>();
         ArrayList<Additive_expression> additive_expression_arr = new ArrayList<Additive_expression>();
         ArrayList<Simple_expression> simple_expression_arr = new ArrayList<Simple_expression>();
         ArrayList<Exp> expression_arr = new ArrayList<Exp>();
         ArrayList<Var> var_arr = new ArrayList<Var>();
         ArrayList<Arg_list> arg_list_arr = new ArrayList<Arg_list>();
         ArrayList<Args> args_arr = new ArrayList<Args>();
         ArrayList<Call> call_arr = new ArrayList<Call>();
        
        //----ID-NUM-relop-addop-mulop-int-void-brackets-----------------------------//
        for(int i= 0; i< tokens.size(); i++){
            
            String current = tokens.get(i);
            
            if(current.equals("ID")){

                Id id = new Id(tokens.get(i+1));
                indexes.set(i, idCounter);
                id_arr.add(id);
                //System.out.println(current + " is an ID with index "+idCounter);
                idCounter++;
                
                tokens.remove(i+1);
                indexes.remove(i+1);
                
            }else if(current.equals("NUM")){

                Num num = new Num(tokens.get(i+1));
                indexes.set(i, numCounter);
                num_arr.add(num);
                //System.out.println(current + " is an NUM with index "+numCounter);
                numCounter++;
                
                tokens.remove(i+1);
                indexes.remove(i+1);
                
            }else if(current.equals("relop")){
                
                Relop relop = new Relop(tokens.get(i+1));
                tokens.set(i, "RELOP");
                indexes.set(i, relopCounter);
                relop_arr.add(relop);
                //System.out.println(current + " is a relop with index "+relopCounter);
                relopCounter++;
                
                tokens.remove(i+1);
                indexes.remove(i+1);
                
            }else if(current.equals("mulop")){
                
                Mulop mulop = new Mulop(tokens.get(i+1));
                tokens.set(i, "MULOP");
                indexes.set(i, mulopCounter);
                mulop_arr.add(mulop);
                //System.out.println(current + " is a mulop with index "+mulopCounter);
                mulopCounter++;
                
                tokens.remove(i+1);
                indexes.remove(i+1);
                
            }else if(current.equals("addop")){
                
                Addop addop = new Addop(tokens.get(i+1));
                tokens.set(i, "ADDOP");
                indexes.set(i, addopCounter);
                addop_arr.add(addop);
                //System.out.println(current + " is an addop with index "+addopCounter);
                addopCounter++;
                
                tokens.remove(i+1);
                indexes.remove(i+1);
            }else if(current.equals("int")){
                
                Int_obj int_obj = new Int_obj();
                tokens.set(i, "INT");
                indexes.set(i, intObjCounter);
                int_obj_arr.add(int_obj);
                //System.out.println(current + " is an int_obj with index "+intObjCounter);
                intObjCounter++;
                
            }else if(current.equals("void")){
                
                Void_obj void_obj = new Void_obj();
                tokens.set(i, "VOID");
                indexes.set(i, voidObjCounter);
                void_obj_arr.add(void_obj);
                //System.out.println(current + " is a void_obj with index "+voidObjCounter);
                voidObjCounter++;
                
            }else if(current.equals("brackets")){
                
                Brackets brackets = new Brackets();
                tokens.set(i, "BRACKETS");
                indexes.set(i, bracketsCounter);
                brackets_arr.add(brackets);
                //System.out.println(current + " is a brackets with index "+bracketsCounter);
                bracketsCounter++;
                
            }
            
            
        }

        /*System.out.println("-----updated_list-1---");
        for(int i= 0; i< tokens.size(); i++){
        
            System.out.println(tokens.get(i)+ " " +indexes.get(i));
        
        }*/
        
        //----typeSpecifier-voidParams------------------------------------------//
        for(int i= 0; i< tokens.size(); i++){
            String current = tokens.get(i);
            
            if(current.equals("INT")){
                
                Type_specifier type_specifier = new Type_specifier("");
                type_specifier.setIntObj(int_obj_arr.get(indexes.get(i)));
                tokens.set(i, "TYPE_SPECIFIER");
                indexes.set(i, typeSpecifierCounter);
                type_specifier_arr.add(type_specifier);
                //System.out.println(current + " is a type_specifier with index "+typeSpecifierCounter);
                typeSpecifierCounter++;
                
            }else if(current.equals("VOID")){

                if( (i>0) && (i < tokens.size()-1) && (tokens.get(i-1).equals("(")) && (tokens.get(i+1).equals(")"))){
                    
                    Params params = new Params("");
                    params.setVoidObj(void_obj_arr.get(indexes.get(i)));
                    tokens.set(i, "PARAMS");
                    indexes.set(i, paramsCounter);
                    params_arr.add(params);
                    //System.out.println(current + " is a params with index "+paramsCounter);
                    paramsCounter++;
                    
                }else{
                    
                    Type_specifier type_specifier = new Type_specifier("");
                    type_specifier.setVoidObj(void_obj_arr.get(indexes.get(i)));
                    tokens.set(i, "TYPE_SPECIFIER");
                    indexes.set(i, typeSpecifierCounter);
                    type_specifier_arr.add(type_specifier);
                    //System.out.println(current + " is a type_specifier with index "+typeSpecifierCounter);
                    typeSpecifierCounter++;
                }
                
            }
            
        }
        
        /*System.out.println("-----updated_list-2---");
        for(int i= 0; i< tokens.size(); i++){
        
            System.out.println(tokens.get(i)+ " " +indexes.get(i));
        
        }*/
        
        //----varDec-Param------------------------------------------------------//
        for(int i= 0; i< tokens.size(); i++){
            String current = tokens.get(i);
            
            if(current.equals("TYPE_SPECIFIER")){
                
                if( (i < tokens.size()-2) && (tokens.get(i+1).equals("ID")) && (tokens.get(i+2).equals(";"))){
                    
                    Var_declaration var_declaration = new Var_declaration(tokens.get(i+1));
                    //set de partes
                    var_declaration.setTypeSpecifier(type_specifier_arr.get(indexes.get(i)));
                    var_declaration.setId(id_arr.get(indexes.get(i+1)));
                    //token e index set
                    tokens.set(i, "VAR_DECLARATION");
                    indexes.set(i, varDeclarationCounter);
                    //agregar al array
                    var_declaration_arr.add(var_declaration);
                    //imprimir debug
                    //System.out.println(current + " is a var_declaration with index "+varDeclarationCounter);
                    //aumentar contador
                    varDeclarationCounter++;
                    
                    //eliminar tokens deprecados
                    tokens.remove(i+2);
                    indexes.remove(i+2);
                    tokens.remove(i+1);
                    indexes.remove(i+1);
                
                }else if( (i < tokens.size()-5) && (tokens.get(i+1).equals("ID")) && (tokens.get(i+2).equals("[")) && 
                        (tokens.get(i+3).equals("NUM")) && (tokens.get(i+4).equals("]")) && (tokens.get(i+5).equals(";"))){
                    
                    Var_declaration var_declaration = new Var_declaration(tokens.get(i+1));
                    //set de partes
                    var_declaration.setTypeSpecifier(type_specifier_arr.get(indexes.get(i)));
                    var_declaration.setId(id_arr.get(indexes.get(i+1)));
                    var_declaration.setNum(num_arr.get(indexes.get(i+3)));
                    //token e index set
                    tokens.set(i, "VAR_DECLARATION");
                    indexes.set(i, varDeclarationCounter);
                    //agregar al array
                    var_declaration_arr.add(var_declaration);
                    //imprimir debug
                    //System.out.println(current + " is a var_declaration with index "+varDeclarationCounter);
                    //aumentar contador
                    varDeclarationCounter++;
                    
                    //eliminar tokens deprecados
                    tokens.remove(i+5);
                    indexes.remove(i+5);
                    tokens.remove(i+4);
                    indexes.remove(i+4);
                    tokens.remove(i+3);
                    indexes.remove(i+3);
                    tokens.remove(i+2);
                    indexes.remove(i+2);
                    tokens.remove(i+1);
                    indexes.remove(i+1);
                    
                }else if( (i < tokens.size()-2) && (tokens.get(i+1).equals("ID")) && (tokens.get(i+2).equals("BRACKETS"))){
                    
                    Param param = new Param("");
                    //set de partes
                    param.setTypeSpecifier(type_specifier_arr.get(indexes.get(i)));
                    param.setId(id_arr.get(indexes.get(i+1)));
                    param.setBrackets(brackets_arr.get(indexes.get(i+2)));
                    //token e index set
                    tokens.set(i, "PARAM");
                    indexes.set(i, paramCounter);
                    //agregar al array
                    param_arr.add(param);
                    //imprimir debug
                    System.out.println(current + " is a param with index "+paramCounter);
                    //aumentar contador
                    paramCounter++;
                    
                    //eliminar tokens deprecados
                    tokens.remove(i+2);
                    indexes.remove(i+2);
                    tokens.remove(i+1);
                    indexes.remove(i+1);
                    
                }else if( (i < tokens.size()-1) && (tokens.get(i+1).equals("ID"))){
                    
                    if( (i < tokens.size()-2) && (tokens.get(i+2).equals("(")) ){
                        //Fun_dec_missing_compound
                    }else{
                        Param param = new Param("");
                        //set de partes
                        param.setTypeSpecifier(type_specifier_arr.get(indexes.get(i)));
                        param.setId(id_arr.get(indexes.get(i+1)));
                        //token e index set
                        tokens.set(i, "PARAM");
                        indexes.set(i, paramCounter);
                        //agregar al array
                        param_arr.add(param);
                        //imprimir debug
                        System.out.println(current + " is a param with index "+paramCounter);
                        //aumentar contador
                        paramCounter++;

                        //eliminar tokens deprecados
                        tokens.remove(i+1);
                        indexes.remove(i+1);
                        
                    }
                    
                }
                
            }
            
        }
        
                
        /*System.out.println("-----updated_list-3---");
        for(int i= 0; i< tokens.size(); i++){
        
            System.out.println(tokens.get(i)+ " " +indexes.get(i));
        
        }*/
        
        //----factorNum-paramList-localDeclarations--------------------------------------//
        for(int i= 0; i< tokens.size(); i++){
            String current = tokens.get(i);
            
            if(current.equals("NUM")){
                
                Factor factor = new Factor("");
                //set de partes
                factor.setNum(num_arr.get(indexes.get(i)));
                //token e index set
                tokens.set(i, "FACTOR");
                indexes.set(i, factorCounter);
                //agregar al array
                factor_arr.add(factor);
                //imprimir debug
                System.out.println(current + " is a factor with index "+factorCounter);
                //aumentar contador
                factorCounter++;

                //eliminar tokens deprecados
                
            }else if(current.equals("PARAM")){

                Param_list param_list = new Param_list("");
                //set de partes
                param_list.addParam(param_arr.get(indexes.get(i)));

                //agregar parametros extra
                while((tokens.get(i+1).equals(",")) && (tokens.get(i+2).equals("PARAM"))){
                    
                    param_list.addParam(param_arr.get(indexes.get(i+2)));

                    //eliminar tokens deprecados
                    tokens.remove(i+2);
                    indexes.remove(i+2);
                    tokens.remove(i+1);
                    indexes.remove(i+1);
                }
                
                //token e index set
                tokens.set(i, "PARAM_LIST");
                indexes.set(i, paramListCounter);
                //agregar al array
                param_list_arr.add(param_list);
                //imprimir debug
                System.out.println(current + " is a factor with index "+paramListCounter);
                //aumentar contador
                paramListCounter++;
                    
                
                
            }else if(current.equals("VAR_DECLARATION")){
                
                if( (i>0) && (tokens.get(i-1).equals("{")) ){
                
                    Local_declarations local_declarations = new Local_declarations("");
                    //set de partes
                    local_declarations.addVarDeclaration(var_declaration_arr.get(indexes.get(i)));

                    //agregar parametros extra
                    while(tokens.get(i+1).equals("VAR_DECLARATION")){

                        local_declarations.addVarDeclaration(var_declaration_arr.get(indexes.get(i+1)));

                        //eliminar tokens deprecados
                        tokens.remove(i+1);
                        indexes.remove(i+1);
                    }
                
                    //token e index set
                    tokens.set(i, "LOCAL_DECLARATIONS");
                    indexes.set(i, localDeclarationsCounter);
                    //agregar al array
                    local_declarations_arr.add(local_declarations);
                    //imprimir debug
                    System.out.println(current + " is a local_declarations with index "+localDeclarationsCounter);
                    //aumentar contador
                    localDeclarationsCounter++;
                    
                }
                
            }
            
        }
        
                
        System.out.println("-----updated_list-4---");
        for(int i= 0; i< tokens.size(); i++){
        
            System.out.println(tokens.get(i)+ " " +indexes.get(i));
        
        }
        
        //------------termFactor-paramList-declaration--------------------------------------//
        for(int i= 0; i< tokens.size(); i++){
            String current = tokens.get(i);
            
            if(current.equals("FACTOR")){
                
                Term term = new Term("");
                //set de partes
                term.setFactor(factor_arr.get(indexes.get(i)));


                
                while((tokens.get(i+1).equals("MULOP")) && (tokens.get(i+2).equals("FACTOR"))){
                    //set de partes
                    term.addMulopFactor(mulop_arr.get(indexes.get(i+1)),factor_arr.get(indexes.get(i+2)));
                    //imprimir debug
                    System.out.println(current + " is a term with index "+termCounter);

                    //eliminar tokens deprecados
                    tokens.remove(i+2);
                    indexes.remove(i+2);
                    tokens.remove(i+1);
                    indexes.remove(i+1);
                    
                }
                //token e index set
                tokens.set(i, "TERM");
                indexes.set(i, termCounter);
                //agregar al array
                term_arr.add(term);
                //imprimir debug
                System.out.println(current + " is a term with index "+termCounter);
                //aumentar contador
                termCounter++;

                
            }else if(current.equals("PARAM_LIST")){
                
                Params params = new Params("");
                //set de partes
                params.setParamList(param_list_arr.get(indexes.get(i)));
                //token e index set
                tokens.set(i, "PARAMS");
                indexes.set(i, paramsCounter);
                //agregar al array
                params_arr.add(params);
                //imprimir debug
                System.out.println(current + " is a params with index "+paramsCounter);
                //aumentar contador
                paramsCounter++;

                //eliminar tokens deprecados
                    
                
                
            }else if(current.equals("VAR_DECLARATION")){
                
                Declaration declaration = new Declaration("");
                //set de partes
                declaration.setVarDeclaration(var_declaration_arr.get(indexes.get(i)));
                //token e index set
                tokens.set(i, "DECLARATION");
                indexes.set(i, declarationCounter);
                //agregar al array
                declaration_arr.add(declaration);
                //imprimir debug
                System.out.println(current + " is a declaration with index "+declarationCounter);
                //aumentar contador
                declarationCounter++;

                //eliminar tokens deprecados
                
            }
            
        }
        
                
        System.out.println("-----updated_list-5---");
        for(int i= 0; i< tokens.size(); i++){
        
            System.out.println(tokens.get(i)+ " " +indexes.get(i));
        
        }
        
        //-------------params-declarations, additive-expression--------------------------------------//
        for(int i= 0; i< tokens.size(); i++){
            String current = tokens.get(i);
            
            if(current.equals("PARAM_LIST")){
                
                Params params = new Params("");
                //set de partes
                params.setParamList(param_list_arr.get(indexes.get(i)));
                //token e index set
                tokens.set(i, "PARAMS");
                indexes.set(i, paramsCounter);
                //agregar al array
                params_arr.add(params);
                //imprimir debug
                System.out.println(current + " is a params with index "+paramsCounter);
                //aumentar contador
                paramsCounter++;

                //eliminar tokens deprecados
                    
                
                
            }else if(current.equals("VAR_DECLARATION")){
                
                Declaration declaration = new Declaration("");
                //set de partes
                declaration.setVarDeclaration(var_declaration_arr.get(indexes.get(i)));
                //token e index set
                tokens.set(i, "DECLARATION");
                indexes.set(i, declarationCounter);
                //agregar al array
                declaration_arr.add(declaration);
                //imprimir debug
                System.out.println(current + " is a declaration with index "+declarationCounter);
                //aumentar contador
                declarationCounter++;

                //eliminar tokens deprecados
                
            }else if(current.equals("TERM")){
                
                Additive_expression additive_expression = new Additive_expression("");
                //set de partes
                additive_expression.setTerm(term_arr.get(indexes.get(i)));
               
                while((tokens.get(i+1).equals("ADDOP")) && (tokens.get(i+2).equals("TERM"))){
                 
                    //set de partes
                    additive_expression.addAddopTerm(addop_arr.get(indexes.get(i+1)),term_arr.get(indexes.get(i+2)));
                    //imprimir debug
                    System.out.println(current + " is an additive expression with index "+ additiveExpressionCounter);

                    //eliminar tokens deprecados
                    tokens.remove(i+2);
                    indexes.remove(i+2);
                    tokens.remove(i+1);
                    indexes.remove(i+1);
                    
                }
                //token e index set
                tokens.set(i, "ADDITIVE_EXPRESSION");
                indexes.set(i, additiveExpressionCounter);
                //agregar al array
                additive_expression_arr.add(additive_expression);
                //imprimir debug
                System.out.println(current + " is an additive expression with index "+additiveExpressionCounter);
                //aumentar contador
                additiveExpressionCounter++;
         
            }
            
        }
        
                
        System.out.println("-----updated_list-6---");
        for(int i= 0; i< tokens.size(); i++){
        
            System.out.println(tokens.get(i)+ " " +indexes.get(i));
        
        }
        
        //-------------simple expression--------------------------------------//
        for(int i= 0; i< tokens.size(); i++){
            String current = tokens.get(i);
            
            if(current.equals("ADDITIVE_EXPRESSION")){
                
                Simple_expression simple_expression = new Simple_expression("");
                //set de partes
                simple_expression.setAdditiveExpression1(additive_expression_arr.get(indexes.get(i)));
                if((tokens.get(i+1).equals("RELOP")) && (tokens.get(i+2).equals("ADDITIVE_EXPRESSION"))){
                    simple_expression.setRelop(relop_arr.get(indexes.get(i+1)));
                    simple_expression.setAdditiveExpression2(additive_expression_arr.get(indexes.get(i+2)));
                    
                    //eliminar tokens deprecados
                    tokens.remove(i+2);
                    indexes.remove(i+2);
                    tokens.remove(i+1);
                    indexes.remove(i+1);
                    
                }
                
                //token e index set
                tokens.set(i, "SIMPLE_EXPRESSION");     
                indexes.set(i, simpleExpressionCounter);
                //agregar al array
                simple_expression_arr.add(simple_expression);
                //imprimir debug
                System.out.println(current + " is a simple expression with index "+simpleExpressionCounter);
                //aumentar contador
                simpleExpressionCounter++;
      
            }
            
        }
        
                
        System.out.println("-----updated_list-7---");
        for(int i= 0; i< tokens.size(); i++){
        
            System.out.println(tokens.get(i)+ " " +indexes.get(i));
        
        }
        
        //-------------sexpression--------------------------------------//
        for(int i= 0; i< tokens.size(); i++){
            String current = tokens.get(i);
            
            if(current.equals("SIMPLE_EXPRESSION")){
                
                Exp expression = new Exp("");
                //set de partes
                expression.setSimpleExpression(simple_expression_arr.get(indexes.get(i)));
                //token e index set
                tokens.set(i, "EXPRESSION");     
                indexes.set(i, expressionCounter);
                //agregar al array
                expression_arr.add(expression);
                //imprimir debug
                System.out.println(current + " is an expression with index "+expressionCounter);
                //aumentar contador
                expressionCounter++;
      
            }
            
        }
        
                
        System.out.println("-----updated_list-8---");
        for(int i= 0; i< tokens.size(); i++){
        
            System.out.println(tokens.get(i)+ " " +indexes.get(i));
        
        }
        
                //-------------var-1--------------------------------------//
        for(int i= 0; i< tokens.size(); i++){
            String current = tokens.get(i);
            
            if(current.equals("ID")){
                
                if( (i<tokens.size()-3) && (tokens.get(i+1).equals("[")) && (tokens.get(i+2).equals("EXPRESSION")) && (tokens.get(i+3).equals("]"))){
                    Var var = new Var("");
                    //set de partes
                    var.setId(id_arr.get(indexes.get(i)));
                    var.setExp(expression_arr.get(indexes.get(i+2)));
                    //token e index set
                    tokens.set(i, "VAR");     
                    indexes.set(i, varCounter);
                    //agregar al array
                    var_arr.add(var);
                    //imprimir debug
                    System.out.println(current + " is a var with index "+varCounter);
                    //aumentar contador
                    varCounter++;
                    //eliminar tokens deprecados
                    tokens.remove(i+3);
                    indexes.remove(i+3);
                    tokens.remove(i+2);
                    indexes.remove(i+2);
                    tokens.remove(i+1);
                    indexes.remove(i+1);
                
                }else if((i<tokens.size()-1) && (tokens.get(i+1).equals("("))){
                    //call or fun-dec
                }else{
                    Var var = new Var("");
                    //set de partes
                    var.setId(id_arr.get(indexes.get(i)));
                    //token e index set
                    tokens.set(i, "VAR");     
                    indexes.set(i, varCounter);
                    //agregar al array
                    var_arr.add(var);
                    //imprimir debug
                    System.out.println(current + " is a var with index "+varCounter);
                    //aumentar contador
                    varCounter++;
                    //eliminar tokens deprecados
                }
      
            }
            
        }
        
                
        System.out.println("-----updated_list-9---");
        for(int i= 0; i< tokens.size(); i++){
        
            System.out.println(tokens.get(i)+ " " +indexes.get(i));
        
        }
        
                //-------------expVar-1--------------------------------------//
        for(int i= 0; i< tokens.size(); i++){
            String current = tokens.get(i);
            
            if(current.equals("VAR")){
                
                if( (i<tokens.size()-2) && (tokens.get(i+1).equals("=")) && (tokens.get(i+2).equals("EXPRESSION"))){
                    Exp expression = new Exp("");
                    //set de partes
                    expression.setVar(var_arr.get(indexes.get(i)));
                    expression.setExp(expression_arr.get(indexes.get(i+2)));
                    //token e index set
                    tokens.set(i, "EXPRESSION");     
                    indexes.set(i, expressionCounter);
                    //agregar al array
                    expression_arr.add(expression);
                    //imprimir debug
                    System.out.println(current + " is an expression with index "+expressionCounter);
                    //aumentar contador
                    expressionCounter++;
                    //eliminar tokens deprecados
                    tokens.remove(i+2);
                    indexes.remove(i+2);
                    tokens.remove(i+1);
                    indexes.remove(i+1);
                
                }
      
            }
            
        }
        
                
        System.out.println("-----updated_list-10---");
        for(int i= 0; i< tokens.size(); i++){
        
            System.out.println(tokens.get(i)+ " " +indexes.get(i));
        
        }
        
                //-------------var-2--------------------------------------//
        for(int i= 0; i< tokens.size(); i++){
            String current = tokens.get(i);
            
            if(current.equals("ID")){
                
                if( (i<tokens.size()-3) && (tokens.get(i+1).equals("[")) && (tokens.get(i+2).equals("EXPRESSION")) && (tokens.get(i+3).equals("]"))){
                    Var var = new Var("");
                    //set de partes
                    var.setId(id_arr.get(indexes.get(i)));
                    var.setExp(expression_arr.get(indexes.get(i+2)));
                    //token e index set
                    tokens.set(i, "VAR");     
                    indexes.set(i, varCounter);
                    //agregar al array
                    var_arr.add(var);
                    //imprimir debug
                    System.out.println(current + " is a var with index "+varCounter);
                    //aumentar contador
                    varCounter++;
                    //eliminar tokens deprecados
                    tokens.remove(i+3);
                    indexes.remove(i+3);
                    tokens.remove(i+2);
                    indexes.remove(i+2);
                    tokens.remove(i+1);
                    indexes.remove(i+1);
                
                }else if((i<tokens.size()-1) && (tokens.get(i+1).equals("("))){
                    //call or fun-dec
                }else{
                    Var var = new Var("");
                    //set de partes
                    var.setId(id_arr.get(indexes.get(i)));
                    //token e index set
                    tokens.set(i, "VAR");     
                    indexes.set(i, varCounter);
                    //agregar al array
                    var_arr.add(var);
                    //imprimir debug
                    System.out.println(current + " is a var with index "+varCounter);
                    //aumentar contador
                    varCounter++;
                    //eliminar tokens deprecados
                }
      
            }
            
        }
        
                
        System.out.println("-----updated_list-11---");
        for(int i= 0; i< tokens.size(); i++){
        
            System.out.println(tokens.get(i)+ " " +indexes.get(i));
        
        }
        
                //-------------expVar-2--------------------------------------//
        for(int i= 0; i< tokens.size(); i++){
            String current = tokens.get(i);
            
            if(current.equals("VAR")){
                
                if( (i<tokens.size()-2) && (tokens.get(i+1).equals("=")) && (tokens.get(i+2).equals("EXPRESSION"))){
                    Exp expression = new Exp("");
                    //set de partes
                    expression.setVar(var_arr.get(indexes.get(i)));
                    expression.setExp(expression_arr.get(indexes.get(i+2)));
                    //token e index set
                    tokens.set(i, "EXPRESSION");     
                    indexes.set(i, expressionCounter);
                    //agregar al array
                    expression_arr.add(expression);
                    //imprimir debug
                    System.out.println(current + " is an expression with index "+expressionCounter);
                    //aumentar contador
                    expressionCounter++;
                    //eliminar tokens deprecados
                    tokens.remove(i+2);
                    indexes.remove(i+2);
                    tokens.remove(i+1);
                    indexes.remove(i+1);
                
                }
      
            }
            
        }
        
                
        System.out.println("-----updated_list-12---");
        for(int i= 0; i< tokens.size(); i++){
        
            System.out.println(tokens.get(i)+ " " +indexes.get(i));
        
        }
        
        //-------------arg-list--------------------------------------//
        
        for(int i= 0; i< tokens.size(); i++){
            String current = tokens.get(i);
            
            if(current.equals("EXPRESSION")){
                
                if( (i>1) && (tokens.get(i-1).equals("(")) && (tokens.get(i-2).equals("ID"))){
                    Arg_list arg_list = new Arg_list("");
                    //set de partes
                    arg_list.addExp(expression_arr.get(indexes.get(i)));
                    
                    while((i+2<tokens.size())&&(tokens.get(i+1).equals(",")) && (tokens.get(i+2).equals("EXPRESSION"))){
                        arg_list.addExp(expression_arr.get(indexes.get(i+2)));
                        
                        //eliminar tokens deprecados
                        tokens.remove(i+2);
                        indexes.remove(i+2);
                        tokens.remove(i+1);
                        indexes.remove(i+1);
                    
                    }
                    //token e index set
                    tokens.set(i, "ARG_LIST");     
                    indexes.set(i, argListCounter);
                    //agregar al array
                    arg_list_arr.add(arg_list);
                    //imprimir debug
                    System.out.println(current + " is an arg_list with index "+argListCounter);
                    //aumentar contador
                    argListCounter++;
                    
                
                }
      
            }
            
        }
        
                
        System.out.println("-----updated_list-13---");
        for(int i= 0; i< tokens.size(); i++){
        
            System.out.println(tokens.get(i)+ " " +indexes.get(i));
        
        }
        
        //-------------args--------------------------------------//
        
        for(int i= 0; i< tokens.size(); i++){
            String current = tokens.get(i);
            
            if(current.equals("ARG_LIST")){
                
                Args args1 = new Args("");
                //set de partes
                args1.setArgList(arg_list_arr.get(indexes.get(i)));
                //token e index set
                tokens.set(i, "ARGS");     
                indexes.set(i, argsCounter);
                //agregar al array
                args_arr.add(args1);
                //imprimir debug
                System.out.println(current + " is an args with index "+argsCounter);
                //aumentar contador
                argsCounter++;
                //eliminar tokens deprecados
      
            }
            
        }
        
                
        System.out.println("-----updated_list-14---");
        for(int i= 0; i< tokens.size(); i++){
        
            System.out.println(tokens.get(i)+ " " +indexes.get(i));
        
        }
        
        //-------------call--------------------------------------//
        
        for(int i= 0; i< tokens.size(); i++){
            String current = tokens.get(i);
            
            if(current.equals("ARGS")){
                
                Call call = new Call("");
                //set de partes
                call.setArgs(args_arr.get(indexes.get(i)));
                call.setId(id_arr.get(indexes.get(i-2)));
                //token e index set
                tokens.set(i, "CALL");     
                indexes.set(i, callCounter);
                //agregar al array
                call_arr.add(call);
                //imprimir debug
                System.out.println(current + " is an call with index "+callCounter);
                //aumentar contador
                callCounter++;
                //eliminar tokens deprecados
                tokens.remove(i+1);
                indexes.remove(i+1);
                tokens.remove(i-1);
                indexes.remove(i-1);
                tokens.remove(i-2);
                indexes.remove(i-2);
                
      
            }
            
        }
        
                
        System.out.println("-----updated_list-15---");
        for(int i= 0; i< tokens.size(); i++){
        
            System.out.println(tokens.get(i)+ " " +indexes.get(i));
        
        }
    }
    
}
