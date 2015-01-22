public class labot1 {

    public static void main(String[] args) {
        int [] tab = new int[10];
        for (int i = 0; i < tab.length; i++) {
                tab [ i ] = i * i;
                System.out.println(tab[i]);
            }
        
        String[] tab7 = new String[3];
        tab7[0] = "Bonjour";
        tab7[1] = "Allo";
        for (int i = 0; i < tab7.length; i++) {
            System.out.println(tab7[i]);
        }
        
        String[] tab8 = new String[6];
        tab8[0] = "Bonjour";
        tab8[1] = "Allo";
        tab8[3] = "";
        tab8[4] = "\ntable\n";
        for (int i = 0; i < tab8.length ; i++) {
            if (tab8[i]!= null)
                System.out.println("ligne " + (i+1) + " : " + tab8[i].length());
        }
        
        String[] tab9 = new String[4];
        tab9[0]= "Bonjour";
        tab9[1]= "Allo";
        tab9[3]= tab9[1] + " " + tab9[0];
        for (int i = 0; i < tab9.length; i++) {
            System.out.println(tab9[i]);
        }
        
    }
}
