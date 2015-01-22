public class exercice3 {

    public static void main(String[] asdgfh) {
        int[] t1 = new int[3];

        for (int i = 0; i < 3; i++) {
            t1[i] = i;
        }

        int[] t2 = new int[2];

        for (int i = 0; i < 2; i++) {
            t2[i] = 10 + i;
        }

        t1[1] = 5;

        for (int i = 0; i < 3; i++) {
            System.out.println(t1[i]);
        }

        for (int i = 0; i < 2; i++) {
            System.out.println(t2[i]);
        }

    }
}
