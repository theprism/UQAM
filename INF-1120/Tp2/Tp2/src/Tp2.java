public class Tp2 {

    public static String appliquerCoup(String combinaison, String coup) {
        String result = "";
        int math;
        if (combinaison != null && coup != null) {
            if (coup.length() == combinaison.length() && !coup.isEmpty()) {
                for (int i = 0; i <= coup.length() - 1; i++) {
                    math = (combinaison.charAt(i) - coup.charAt(i));
                    if (math < 0) {
                        math = 0;
                    }
                    result = result + math;
                }
            }
        }
        return result;
    }

    public static boolean auMoinsUnCaracValide(String s, char min, char max) {
        boolean valide = false;
        int i = 0;
        if (s != null) {
            while (i < s.length() && !valide) {
                valide = (s.charAt(i) <= max) && (s.charAt(i) >= min);
                i++;
            }
        }
        return valide;
    }

    public static boolean tousLesCaracValides(String s, char min, char max) {
        boolean valide = false;
        int i = 0;
        if (s != null && !s.equals("")) {
            valide = true;
            while ((i < s.length()) && valide) {
                valide = !((s.charAt(i) > max) || (s.charAt(i) < min));
                i++;
            }
        }
        return valide;
    }

    public static boolean coupEstValide(String combinaison, String coup) {
        boolean resultat = false;
        boolean vlength;
        boolean vcoup = tousLesCaracValides(coup, '0', '3');
        String calcul = appliquerCoup(combinaison, coup);
        if (combinaison != null && coup != null) {
            vlength = combinaison.length() == coup.length();
            resultat = vcoup && vlength && !calcul.equals(combinaison);
        }
        return resultat;
    }

    public static void main(String[] args) {
        String init = "";
        String coup = "";
        boolean joueur = true;
        boolean val = true;
        String player = "";
        String winner = "";
        while (val) {
            System.out.println(MessagesTp2.COMBINAISON_INITIALE);
            init = Clavier.lireString();
            if (tousLesCaracValides(init, '2', '9') && init.length() == 3) {
                val = false;
            } else {
                System.out.println(MessagesTp2.COMBINAISON_INVALIDE);
            }
        }
        val = true;
        while (!init.equals("000")) {
            while (val) {
                if (joueur) {
                    player = MessagesTp2.COUP_DU_JOUEUR1;
                    winner = MessagesTp2.GAGNANT_JOUEUR2;
                } else {
                    player = MessagesTp2.COUP_DU_JOUEUR2;
                    winner = MessagesTp2.GAGNANT_JOUEUR1;
                }
                System.out.println(player);
                coup = Clavier.lireString();
                if (coupEstValide(init, coup)) {
                    init = appliquerCoup(init, coup);
                    val = !val;
                } else {
                    System.out.println(MessagesTp2.COUP_INVALIDE);
                }
            }
            System.out.println("=> " + init);
            val = !val;
            joueur = !joueur;
        }
        System.out.println(winner);
    }
}
