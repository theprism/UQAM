public class Animal {

    private String nom;
    private int sorte;
    private String race;
    private String propriétaire;

    public void afficher() {
        System.out.println(this.nom);
        System.out.println(this.sorte);
        System.out.println(this.race);
        System.out.println(this.propriétaire);
    }

    public Animal() {
        this("",0,"","");
    }

    public Animal(String x, int y, String z, String t) {
        this.nom = x;
        this.sorte = y;
        this.race = z;
        this.propriétaire = t;
    }

    public Animal(String x, int y, String z) {
        this(x,y,z,"");
    }
    
    public String getNom(){
        return this.nom;
    }
    
    public int getSorte(){
        return this.sorte;
    }
    
    public String getRace(){
        return this.race;
    }
    
    public String getPropriétaire(){
        return this.propriétaire;
    }
    
    public void setNom (String nom){
        this.nom = nom;
    }
}
