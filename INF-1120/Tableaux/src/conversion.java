public class conversion {

    public static void main(String[] args) {
//        Les primitives peuvent être convertis par conversion implicite
        int i = 5;
        float f = i;    // correct: coversion implicite

        int[] i2 = new int[5];
        float[] f2 = new float[5];
        
//        f2 = i2   // erreur de compilation
    }

    public static float[] coversionfloat(int[] t) {
        float[] f = null;
        if (t != null) {
            f = new float[t.length];
            for(int i=0;i<f.length;i++){
                f[i] = t[i];
            }
        }
        return f;
    }

}
