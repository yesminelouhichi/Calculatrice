public class Main {
    public static void main(String[] args) {
        int a = 2;
        int b = 3;
        
        // Test multiplication
        int resultatMult = Operation.multiplier(a, b);
        System.out.println(a + " * " + b + " = " + resultatMult);
        
        // Test soustraction
        int resultatSous = Operation.soustraire(a, b);
        System.out.println(a + " - " + b + " = " + resultatSous);
        
        // Test addition
        int resultatAdd = Operation.additionner(a, b);
        System.out.println(a + " + " + b + " = " + resultatAdd);
    }
}
