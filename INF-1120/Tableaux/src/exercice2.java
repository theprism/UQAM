public class exercice2 {

    public static void methode(int[] t) {
        t = new int[5];
    }

    public static void main(String[] args) {
        int[] t = new int[2];
        System.out.println(t.length);
        methode(t);
        System.out.println(t.length);
    }
}
