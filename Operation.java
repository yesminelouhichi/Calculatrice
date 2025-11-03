public class Operation {
    
    /**
     * Méthode statique qui multiplie x par y
     * @param x premier nombre
     * @param y deuxième nombre  
     * @return le produit de x et y
     */
    public static int multiplier(int x, int y) {
        return x * y;
    }
    
    // Méthode main pour tester
    public static void main(String[] args) {
        int resultat = multiplier(5, 3);
        System.out.println("5 * 3 = " + resultat);
    }
public static int soustraire(int x, int y) {
    return x - y;
}

public static int additionner(int x, int y) {
    return x + y;
}}

