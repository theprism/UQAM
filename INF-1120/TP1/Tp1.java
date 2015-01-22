public class Tp1 {
    public static void main (String [] args) {
        int pile1=2;
        int pile2=2;
        int pile3=2;
        int multiply1=0;
        int multiply2=0;
        int multiply3=0;
        boolean player = false;
        int compteurPile = 1;
        int selectPile;
        int selectCarte = 1;
        boolean validate = true;
        do {
            switch (compteurPile){
                case 1:
                    System.out.println(MessagesTp1.NOMBRE_DE_CARTES_PILE1);
                    pile1 = Clavier.lireInt();
                    compteurPile++;
                    break;
                case 2:
                    System.out.println(MessagesTp1.NOMBRE_DE_CARTES_PILE2);
                    pile2 = Clavier.lireInt();
                    compteurPile++;
                    break;
                case 3:
                    System.out.println(MessagesTp1.NOMBRE_DE_CARTES_PILE3);
                    pile3 = Clavier.lireInt();
                    compteurPile++;
                    break;
            }
            if (pile1 <= 1 || pile2 <= 1 || pile3 <= 1) {
                System.out.println(MessagesTp1.AU_MOINS_DEUX_CARTES);
                compteurPile--;
            }
        } while (compteurPile !=4);
        do {
            System.out.println(MessagesTp1.ETAT_DES_PILES);
            System.out.println(pile1 +":"+ pile2 +":"+ pile3);
            if (player) {
                System.out.println(MessagesTp1.COUP_DU_JOUEUR2);
            } else {
                System.out.println(MessagesTp1.COUP_DU_JOUEUR1);
            }
            do {
                System.out.println(MessagesTp1.PILE_CIBLE);
                selectPile = Clavier.lireInt();
                switch (selectPile){
                    case 1:
                        validate=!validate;
                        multiply1 = 1;
                        if (pile1 == 0){
                            System.out.println(MessagesTp1.PILE_VIDE);
                            validate=!validate;
                            multiply1=0;
                        }
                        break;
                    case 2:
                        validate=!validate;
                        multiply2 = 1;
                        if (pile2 == 0){
                            System.out.println(MessagesTp1.PILE_VIDE);
                            validate=!validate;
                            multiply2=0;
                        }
                        break;
                    case 3:
                        validate=!validate;
                        multiply3 = 1;
                        if (pile3 == 0){
                            System.out.println(MessagesTp1.PILE_VIDE);
                            validate=!validate;
                            multiply3=0;
                        }
                        break;
                    default:
                        System.out.println(MessagesTp1.NUM_PILE_INEXISTANT);
                }
            } while (validate);
            validate=!validate;
            do {
                System.out.println(MessagesTp1.NOMBRE_CARTES_A_RETIRER);
                selectCarte = Clavier.lireInt();
                if( selectCarte < 1 || selectCarte > 3)
                    System.out.println(MessagesTp1.AU_MOINS_1_AU_PLUS_3);
            }while( selectCarte < 1 || selectCarte > 3);
            pile1 = pile1 - (selectCarte*multiply1);
            pile2 = pile2 - (selectCarte*multiply2);
            pile3 = pile3 - (selectCarte*multiply3);
            multiply1=0;
            multiply2=0;
            multiply3=0;
            if (pile1 < 0){
                pile1 = 0;
            }else if (pile2 < 0){
                pile2 = 0;
            }else if (pile3 < 0){
                pile3 = 0;
            }
            player = !player;
        }while (pile1 != 0 || pile2 != 0 || pile3 != 0);
        if (player){
            System.out.println(MessagesTp1.JOUEUR2_GAGNANT);
        }else{
            System.out.println(MessagesTp1.JOUEUR1_GAGNANT);
        }
    }
}
