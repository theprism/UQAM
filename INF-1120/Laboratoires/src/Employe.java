public class Employe {

    private String nomdeFamille;
    private String prenom;
    private int numero;
    private int nbdAnnees;
    private double salaire;
    private static int dernierNumero = 0;

    public Employe(String nomdeFamille, String prenom,
            int nbdAnnees, double salaire) {
        this.nomdeFamille = nomdeFamille;
        this.prenom = prenom;
        this.nbdAnnees = nbdAnnees;
        this.salaire = salaire;
        dernierNumero = dernierNumero + 1;
        numero = dernierNumero;
    }

    public String nomEmploye() {
        return nomdeFamille;
    }

    public String prenomEmploye() {
        return prenom;
    }

    public int numeroEmploye() {
        return numero;
    }

    public int nbdAnneesEmploye() {
        return nbdAnnees;
    }

    public double salaireEmploye() {
        return salaire;
    }

    public void modifierSalaire(double salaire) {
        this.salaire = salaire;
    }
}
