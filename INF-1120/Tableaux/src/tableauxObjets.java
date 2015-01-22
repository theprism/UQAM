public class tableauxObjets {

    public static int[] suite(int n) {
        int[] res = new int[n];

        for (int i = 0; i < n; i++) {
            res[i] = i;
        }
        return res;
    }

    public static void main(String[] args) {
        Bouteille [] bs = new Bouteille[3];

        bs[0] = new Bouteille("rouge", 2);
        bs[1] = new Bouteille("vert", 3);
        bs[2] = new Bouteille("jaune", 1);

        for (int i = 0; i < bs.length; i++) {
            bs[i].capacite = i + 1;
        }
    }
}
