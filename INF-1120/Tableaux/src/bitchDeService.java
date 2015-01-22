public class bitchDeService {
    
    public static void main(String[] args) {
//        int [] t = {2};
//        int [] p = {1289371897};
//        System.out.println(t[0]);
//        System.out.println(p[0]);
//        p = t;
//        t[0] = 5;
//        System.out.println(t[0]);
//        System.out.println(p[0]);
        
        Voiture v = new Voiture(2);
        v.portes[0] = new Porte("rouge");
        v.portes[1] = new Porte("verte");
        
        Voiture[] tv = new Voiture[5];
        for (int i = 0; i < tv.length; i++) {
            tv[i] = new Voiture(2);
        }
        
    }
}
