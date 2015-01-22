
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TesterFileReader {
    public static void main(String[] args) throws IOException {
        FileReader lecteur;
        int codeLu;
        char caractereLu;
        
        try {
            lecteur = new FileReader ( "nom_du_fichier.txt" );
            do{
                codeLu = lecteur.read(); // IOException
                if (codeLu !=-1){
                    // bla bla bla
                }
            }while (codeLu != -1);
            // Lire dans le fichier
            
            lecteur.close(); // IOExecption
        } catch ( FileNotFoundException e ) {
            System.out.println("Le fichier n'existe pas!");
        } catch (IOException e) {
            System.out.println("Erreur d'entrée/sortie");
        }
    }
}
