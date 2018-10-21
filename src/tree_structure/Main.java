package tree_structure;

public class Main {
    
    public static void main(String[] args) {
        Var var = new Var("perro");
        Id id = new Id("wololo");
        var.setId(id);
        
        System.out.println(var);
    }
    
}
