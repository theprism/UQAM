public class Tableaux {

    public static void afficher(int[] input) {
        if (input == null) {
            System.out.println("tableau null");

        } else if (input.length == 0) {
            System.out.println("tableau vide");
        } else {
            for (int i = 0; i < input.length; i++) {
                System.out.println(input[i]);
            }
        }
    }

    public static void afficher(String[] input) {
        if (input == null) {
            System.out.println("tableau null");

        } else if (input.length == 0) {
            System.out.println("tableau vide");
        } else {
            for (int i = 0; i < input.length; i++) {
                System.out.println(input[i]);
            }
        }
    }

    public static int somme(int[] input) {
        int somme = 0;
        if (input != null) {
            if (input.length > 0) {
                for (int i = 0; i < input.length; i++) {
                    somme = somme + input[i];
                }
            }
        } else {
            somme = Integer.MIN_VALUE;
        }
        return somme;
    }

    public static boolean suppZero(int[] input) {
        boolean output = false;
        boolean excep = true;
        if (input == null || input.length == 0) {
            output = true;
        } else {
            for (int i = 0; i < input.length && excep; i++) {
                if (input[i] < 0) {
                    excep = false;
                    output = false;
                } else {
                    output = true;
                }
            }
        }
        return output;
    }

    public static int maximum(int[] input) {
        int max = Integer.MIN_VALUE;
        if (input != null && input.length > 0) {
            max = input[0];
            for (int i = 1; i < 10; i++) {
                if (input[i] > max) {
                    max = input[i];
                }
            }
        }
        return max;
    }

    public static int[] copie(int[] input) {
        int[] output = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            output[i] = input[i];
        }
        return output;
    }

    public static int[] inverse(int[] input) {
        int[] output = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            output[i] = input[input.length - 1 - i];
        }
        return output;
    }

    public static int[] epure(int[] input) {
        int[] output;
        int compteur0 = 0;
        int j = 0;
        for (int i = 0; i < input.length; i++) {
            if (input[i] == 0) {
                compteur0++;
            }
        }
        System.out.println(compteur0);
        output = new int[(input.length - compteur0)];
        System.out.println(output.length);
        for (int i = 0; i < input.length; i++) {
            if (input[i] != 0) {
                output[j] = input[i];
                j++;
            }
        }
        return output;
    }

    public static int[] suite(int a, int b) {
        int[] output = new int[(b - a)];
        for (int i = 0; i < output.length; i++) {
            output[i] = a + i;
        }
        return output;
    }

    public static String[] prefixe(String input) {
        String[] output = null;
        if (input != null) {
            output = new String[input.length() + 1];
            for (int i = 0; i < output.length; i++) {
                output[i] = "" + input.substring(0, i);
            }
        }
        return output;
    }

    public static void bars(int[] input) {
        if (input != null) {
            for (int i = 0; i < input.length; i++) {
                for (int j = 0; j < (input[i]); j++) {
                    System.out.print("*");
                }
                if (input[i] <= maximum(input) && input[i] >= 0){
                    for (int j = 0; j < (maximum(input) - input[i]); j++) {
                        System.out.print(" ");
                    }
                } else {
                    for (int j = 0; j < (maximum(input)); j++) {
                        System.out.print(" ");
                    }
                }
                System.out.print(" ");
                System.out.println("(" + input[i] + ")");
            }
        } else {
            System.out.println("Null err");
        }
    }
    public static void barsvert(int[] input){
        for (int i = maximum(input); i > 0; i--) {
            for (int j = 0; j < input.length; j++) {
                if (i > input [j]){
                    System.out.print(" ");
                }else{
                    System.out.print("*");
                }
            }
            System.out.println("");
        }
    }
}
