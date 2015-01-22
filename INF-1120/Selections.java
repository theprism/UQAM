public class Selections {
    public static void main(String args[]){
        int choix;
        int c1=0;
        int c2=1;
        int c3=2;
        int a1=0;
        int a2=1;
        int a3=2;
        boolean choixI = true;
        boolean coteF = false;
        System.out.println(MessagesSelections.MENU);
        System.out.println(MessagesSelections.CHOIX_C);
        System.out.println(MessagesSelections.CHOIX_A);
        System.out.println(MessagesSelections.VOTRE_CHOIX);
        choix = Clavier.lireCharLn();
        switch (choix){
            case 99:
            case 67:
                System.out.println(MessagesSelections.PREMIER_COTE);
                c1 = Clavier.lireInt();
                if (c1 <= 0){
                    coteF = true;
                    break;
                }
                System.out.println(MessagesSelections.DEUXIEME_COTE);
                c2 = Clavier.lireInt();
                if (c2 <= 0){
                    coteF = true;
                    break;
                }
                System.out.println(MessagesSelections.TROISIEME_COTE);
                c3 = Clavier.lireInt();
                if (c3 <= 0){
                    coteF = true;
                    break;
                }
                if (!(c1<(c2+c3))||!(c2<(c1+c3))||!(c3<(c2+c1))){
                    System.out.println(MessagesSelections.ERREUR);
                    choixI = false;
                }
                break;
            case 97:
            case 65:
                System.out.println(MessagesSelections.PREMIER_ANGLE);
                a1 = Clavier.lireInt();
                System.out.println(MessagesSelections.DEUXIEME_ANGLE);
                a2 = Clavier.lireInt();
                System.out.println(MessagesSelections.TROISIEME_ANGLE);
                a3 = Clavier.lireInt();
                if(a1+a2+a3!=180||a1<=0||a2<=0||a3<=0){
                    System.out.println(MessagesSelections.MESURE_INVALIDE);
                    choixI = false;
                }
                break;
            default:
                System.out.println(MessagesSelections.CHOIX_INVALIDE);
                choixI = false;
        }
        if (coteF){
            System.out.println(MessagesSelections.LONGUEUR_INVALIDE);
            choixI = false;
        }
        if (choixI){
            if((c1==c2&&c2==c3)||(a1==a2&&a2==a3)){
                System.out.println(MessagesSelections.EQUILATERAL);
            }else if((c1==c2||c2==c3||c1==c3)||(a1==a2||a2==a3||a1==a3)){
                System.out.println(MessagesSelections.ISOCELE);
            }else{
                System.out.println(MessagesSelections.SCALENE);
            }
        }
        System.out.println(MessagesSelections.FIN_DU_PROGRAMME);
    }
}
