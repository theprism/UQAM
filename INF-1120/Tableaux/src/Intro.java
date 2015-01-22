public class Intro {
    public static void main (String [] args){
//        Initialisation du tableau
        int [] nomDuTableau = { 35, 8, 3, 9 };
//        Chaine "string" est un tableau de caractères
//        On ne peut pas initialiser le tableau puis atribuer des valeurs entre
//        acolades par la suite. 
        
//        int [] err;
//        err = {1, 5, 3, 2, 12};
        
//        Ont peut ce pendant utiliser des expressions.
        int n = 5;
        int p = 3;
        
        int [] t = { 1, n, n+p, 2*p, 12};
        
//        On peut fixer la taille du tableau à sont initialisation
        int [] table2 = new int[5];     // taille 5
        String [] table3;
        table3 = new String[0];     // taille 0
        
        int [] table4 = null;   // reference nulle
//        Les éléments du tableau sont initialisé aux valeurs par défaut comme
//        pour les attributs de classe.
        
//        On peut déterminer la taille à l'exécution
        System.out.print("taille voulue ?");
        int dude = Clavier.lireIntLn();
        int [] table5 = new int[dude];
//        Une taille negative entraine une erreur à l'execution
        
    }
}
