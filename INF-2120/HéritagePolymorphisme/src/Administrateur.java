public class Administrateur extends EmployeSalarie {

    private String titre;
    private String expertise;
    private String superviseur;

    public Administrateur() {
        titre = "sans titre";
        expertise = "sans domaine";
        superviseur = "sans superviseur";
    }

    public Administrateur(String leNom, Date laDate, double leSalaire,
            String titre, String expertise, String superviseur) {
        super(leNom, laDate, leSalaire);
        this.titre = titre;
        this.expertise = expertise;
        this.superviseur = superviseur;
    }

    @Override
    public String toString() {
        return super.toString();
    }

}
