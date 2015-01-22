public class TesterAnimal {

    public static void main(String[] args) {
        Animal Animal1 = new Animal("choupette",1,"domestique","Louise");
        Animal Animal2;
        Animal2 = Animal1;
        Animal2.setNom("chouchou");
        afficherAnimal(Animal1);
        afficherAnimal(Animal2);
    }

    public static void afficherAnimal(Animal a) {
        if (a != null) {
            System.out.println(a.getNom());
            System.out.println(a.getSorte());
            System.out.println(a.getRace());
            System.out.println(a.getPropriétaire());
        }
    }
}
