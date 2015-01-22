public class LabEmploye {

    public static void main(String[] args) {
        String c1= "";
        try {
            c1 = nomDeFamille();
        } catch (ErrChaineNom ex) {
            System.out.println("Erreur, minuscule detecté.");
        }
        String c2 = "";
        try {
            c2 = prenom();
        } catch (ErrChaineNom ex) {
            System.out.println("Erreur, minuscule detecté.");
        }
        int c3 = anneeDeService();
        double c4 = lireSalaire();
        Employe e1 = new Employe(c1, c2, c3, c4);
        afficherEmp(e1);
    }

    public static String nomDeFamille() throws ErrChaineNom {
        System.out.print("Nom de famille : ");
        String ndf = Clavier.lireString();
        String sub1 = "";
        String sub2 = "";
        boolean v = false;
        for (int i = 0; i < ndf.length(); i++) {
            sub1 = ndf.substring(i, i + 1);
            sub2 = sub1.toLowerCase();
            if (sub1.equals(sub2)) {
                v = !v;
                break;
            }
        }
        if (v){
            throw new ErrChaineNom();
        } else {
        return ndf;
        }
    }

    public static String prenom() throws ErrChaineNom {
        System.out.print("Prénom : ");
        String ndf = Clavier.lireString();
                String sub1 = "";
        String sub2 = "";
        boolean v = false;
        for (int i = 0; i < ndf.length(); i++) {
            sub1 = ndf.substring(i, i + 1);
            sub2 = sub1.toLowerCase();
            if (sub1.equals(sub2)) {
                v = !v;
                break;
            }
        }
        if (v){
            throw new ErrChaineNom();
        } else {
        return ndf;
        }
    }

    public static int anneeDeService() {
        int ndf = 0;
        boolean v = true;
        while (v) {
            System.out.print("Nombre d'années : ");
            try {
                ndf = Clavier.lireIntLn();
                v = !v;
            } catch (NumberFormatException e) {
                System.out.println("Le nombre fourni n'est pas de type "
                        + "int. ");
            }

        }
        return ndf;

    }

    public static double lireSalaire() {
        double ndf = 0.0;
        boolean v = true;
        while (v) {
            System.out.print("Salaire : ");
            try {
                ndf = Clavier.lireDoubleLn();
                v = !v;
            } catch (NumberFormatException e) {
                System.out.println("Le nombre fourni n'est pas de type "
                        + "double. ");
            }
        }
        return ndf;
    }

    public static void afficherEmp(Employe e) {
        System.out.println("Numéro : " + e.numeroEmploye());
        System.out.println("Prénom : " + e.prenomEmploye());
        System.out.println("Nom : " + e.nomEmploye());
        System.out.println("Nombre d'années : " + e.nbdAnneesEmploye());
        System.out.println("Salaire : " + e.salaireEmploye() + " $");
    }

    private static class ErrChaineNom extends Exception {
        
    }
}
