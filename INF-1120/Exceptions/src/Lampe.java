public class Lampe {

    boolean allumee;
    int niveauLum;

    public void augmenterLuminosite() throws MaxLumExcep {
        if (niveauLum >= 5) 
            throw new MaxLumExep();
        niveauLum++;
    }

    public void reduireLuminosite() throws MinLumExcep {

    }
}
