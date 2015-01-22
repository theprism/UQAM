public class Intro {

    public static void main(String[] args) {
        String s;
        System.out.println(s); // Variable non initialisée
        String s = null;
        System.out.println(s.length()); // Null pointer

        String s = null;
        if (s != null) {
            System.out.println(s.length());
        }else{
            System.out.println("null");
        }
        System.out.println("Fin du programme");
    }

    public static void main(String[] args) {
        String s = null;
        try {
            System.out.println(s.length());
        } catch (NullPointerException){
            System.out.println("null");
        }
        System.out.println("Fin du programme");
    }
}
