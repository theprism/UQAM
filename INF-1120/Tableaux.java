public class Tableaux {

    public static int[] filtrerTableau(int[] tab, int min) {
        int lng = tab.length;
        for (int i = 0; i < tab.length; i++) {
            if (tab[i] < min) {
                lng--;
            }
        }
        int[] result = new int[lng];
        int decal = 0;
        for (int j = 0; j < tab.length; j++) {
            if (tab[j] < min) {
                decal++;
            } else {
                result[(j - decal)] = tab[j];
            }
        }
        return result;
    }

    public static int nombreBaisses(int[] tab) {
        int result = 0;
        for (int i = 1; i < tab.length; i++) {
            if (tab[i] < tab[(i - 1)]) {
                result++;
            }
        }
        return result;
    }

    public static int[] compterOccurences(String chaine) {
        int[] result = new int[chaine.length()];
        int amount;
        for (int i = 0; i < chaine.length(); i++) {
            amount = 0;
            for (int j = 0; j < chaine.length(); j++) {
                if (chaine.charAt(i) == chaine.charAt(j)) {
                    amount++;
                }
            }
            result[i] = amount;
        }
        return result;
    }
}
