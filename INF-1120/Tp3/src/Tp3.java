import java.io.*;

public class Tp3 {

    public static void main(String[] args) throws IOException {
        int choix = 1;
        String forme;
        int cForme;
        int mem;
        int id;
        CarteMere[] liste = null;
        try {
            liste = chargerEnMemoire("liste.txt");
        } catch (IOException e) {
            System.out.println(MessagesTp3.FICHIER_EXISTE_PAS);
        }
        while (choix != 9) {
            System.out.println(MessagesTp3.AJOUTER_CARTE);
            System.out.println(MessagesTp3.SUPPRIMER_CARTE);
            System.out.println(MessagesTp3.AFFICHER_CARTES);
            System.out.println(MessagesTp3.QUITTER);
            System.out.println(MessagesTp3.VOTRE_CHOIX);
            try {
                choix = Clavier.lireInt();
            } catch (Throwable e) {
                choix = 1;
            }
            switch (choix) {
                case 0:
                    System.out.println(MessagesTp3.SAISIR_FORME);
                    forme = Clavier.lireString();
                    cForme = CarteMere.chaineFormeVersCode(forme);
                    System.out.println(MessagesTp3.SAISIR_MEMOIRE);
                    mem = Clavier.lireInt();
                    CarteMere cm = new CarteMere(cForme, mem);
                    liste = ajouterCarteMere(cm, liste);
                    break;
                case 2:
                    System.out.println(MessagesTp3.SAISIR_IDENTIFIANT);
                    id = Clavier.lireInt();
                    liste = supprimerCarteMere(id, liste);
                    break;
                case 4:
                    if (liste.length == 0) {
                        System.out.println(MessagesTp3.LISTE_VIDE);
                    } else {
                        afficherCarteMere(liste);
                    }
                    break;
                case 9:
                    break;
                default:
                    System.out.println(MessagesTp3.CHOIX_NONVALIDE);
            }
        }
        sauvegarder("liste.txt", liste);
        System.out.println(MessagesTp3.FIN_PROGRAMME);

    }

    public static CarteMere[] ajouterCarteMere
        (CarteMere carte, CarteMere[] liste) {
        CarteMere[] out = new CarteMere[(liste.length + 1)];
        for (int i = 0; i < liste.length; i++) {
            out[i] = liste[i];
        }
        out[(liste.length)] = carte;

        return out;
    }

    public static void sauvegarder(String nomFichier, CarteMere[] liste) 
            throws IOException {
        FileWriter fw = new FileWriter(nomFichier);
        PrintWriter pw = new PrintWriter(fw);
        for (int i = 0; i < liste.length; i++) {
            pw.println(liste[i].obtenirForme());
            pw.println(liste[i].obtenirCapaciteMaxMemoire());
            pw.println(liste[i].obtenirMemoireInstallee());
        }
        pw.close();
    }

    public static void afficherCarteMere(CarteMere[] liste) {
        System.out.println(MessagesTp3.LISTE_CARTES);
        for (int i = 0; i < liste.length; i++) {
            System.out.println(liste[i].toString());
            System.out.println(MessagesTp3.SEPARATEUR);
        }
    }

    public static CarteMere[] chargerEnMemoire(String nomFichier)
            throws IOException {
        CarteMere[] liste = new CarteMere[0];
        int type;
        int maxMem;
        int mem;
        CarteMere obj;
        FileReader reader;
        BufferedReader buffer;
        try {
            reader = new FileReader(nomFichier);
            buffer = new BufferedReader(reader);
            while (buffer.ready()) {
                type = CarteMere.chaineFormeVersCode(buffer.readLine());
                maxMem = Integer.parseInt(buffer.readLine());
                mem = Integer.parseInt(buffer.readLine());
                obj = new CarteMere(type, maxMem, mem);
                liste = ajouterCarteMere(obj, liste);
            }
            buffer.close();
        } catch (IOException e) {
            throw e;
        }
        return liste;
    }

    public static CarteMere[] supprimerCarteMere
        (int identifiant, CarteMere[] liste) {
        CarteMere[] out = new CarteMere[(liste.length - 1)];
        for (int i = 0; i < liste.length; i++) {
            if (liste[i].obtenirIdentifiant() != identifiant
                    && i < (liste.length - 1)) {
                out[i] = liste[i];
            } else if (liste[i].obtenirIdentifiant() != identifiant){
                out[(i-1)] = liste[i];
            }
        }
        return out;
    }
}
