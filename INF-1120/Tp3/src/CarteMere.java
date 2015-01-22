public class CarteMere {

    public static final int CAPACITE_MEMOIRE = 8;
    public static final String[] formes = {
        "Inconnue",
        "ATX",
        "microATX",
        "flexATX",
        "miniATX",
        "miniITX",
        "nanoITX",
        "BTX",
        "microBTX",
        "picoBTX"
    };

    private String marque;
    private int idForme;
    private int maxMem;
    private int memInstall;
    private int idCarte;

    private static int idGlobal = 1;

    public CarteMere(String marque,
            int codeForme,
            int capaciteMaxMemoire,
            int memoireInstallee) {
        if (marque != null) {
            this.marque = marque;
        } else {
            this.marque = "";
        }
        if (capaciteMaxMemoire > 0) {
            maxMem = capaciteMaxMemoire;
        } else {
            maxMem = CAPACITE_MEMOIRE;
        }
        if (memoireInstallee < 0) {
            memInstall = 0;
        } else if (memoireInstallee > maxMem) {
            memInstall = maxMem;
        } else {
            memInstall = memoireInstallee;
        }
        if (codeForme > 9 || codeForme < 0) {
            idForme = 0;
        } else {
            idForme = codeForme;
        }
        idCarte = idGlobal;
        idGlobal++;
    }

    public CarteMere(int forme, int capaciteMax, int memoireInstallee) {
        this("ASUS", forme, capaciteMax, memoireInstallee);
    }

    public CarteMere(int codeForme, int memoireInstallee) {
        this(codeForme, 0, memoireInstallee);
    }

    public int obtenirIdentifiant() {
        return idCarte;
    }

    public String obtenirForme() {
        return formes[idForme];
    }

    public int obtenirCapaciteMaxMemoire() {
        return maxMem;
    }

    public int obtenirMemoireInstallee() {
        return memInstall;
    }

    public void modifierForme(int nouvelleForme) {
        if (nouvelleForme >= 0 && nouvelleForme <= 9) {
            idForme = nouvelleForme;
        }
    }

    public void modifierMarque(String nouvelleMarque) {
        if (nouvelleMarque != null) {
            marque = nouvelleMarque;
        }
    }

    public void modifierMemoireInstallee(int nouvelleTailleMemoire) {
        if (nouvelleTailleMemoire < 0) {
            nouvelleTailleMemoire = memInstall;
        } else if (nouvelleTailleMemoire > maxMem) {
            nouvelleTailleMemoire = maxMem;
        }
        memInstall = nouvelleTailleMemoire;
    }

    public int viderMemoire() {
        int mem = memInstall;
        memInstall = 0;
        return mem;
    }

    public int installerMaxMemoire() {
        int add = 0;
        if (memInstall < maxMem) {
            add = maxMem - memInstall;
            memInstall = maxMem;
        }
        return add;
    }

    public int ajouterMemoire(int memoireAdditionnelle) {
        int output = 0;
        if (memoireAdditionnelle < 0) {
            output = memoireAdditionnelle;
        } else if (memInstall + memoireAdditionnelle > maxMem) {
            output = memInstall + memoireAdditionnelle - maxMem;
            memInstall = maxMem;
        }else {
            memInstall = memoireAdditionnelle;
        }
        return output;
    }

    public String toString() {
        String output = "";
        output = output + idCarte + ',' + this.obtenirForme() + ',' + memInstall;
        return output;
    }

    public static int chaineFormeVersCode(String chaineForme) {
        int format = 0;
        for(int i = 1; i < formes.length ; i++){
            if (chaineForme.equalsIgnoreCase(formes[i])){
                format = i; 
            }
        }
        return format;

    }
}
