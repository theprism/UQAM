public class acces {

    public static void main(String[] args) {
//    Comment accèder aux éléments du tableau
        int[] t = new int[5];
        
        t[0] = 15;  // donne la valeur 15 au premier élément du tableau
        
        t[2] = t[2] + 1;    // incrément de 1 la valeur du 3e element
                            // t[2]++ est une opération équivalente
        t[1] = t[0] - t[2];
        
        t[5] = 4; // Déclenche un exception
        
        System.out.println( t[4] ); //afiche la dernière valeur
        
        System.out.println( t[5] ); // Exception
    }
    
}
