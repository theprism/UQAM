### Assembleur - 12 Janvier 2015
---

L'assembleur est la base de la programation afin de simplifier l'exécution et compresser le temps d'utilisation.  

Simulateur d'utilisation, Pep8  

L'assembleur n'effectue pas de vérification lors de l'exécution. Ce qui veut donc dire que le temps d'exécution est très rapide, mais des erreurs de calculs peuvent s'introduire.

#### Travaux

Possibilité d'être en équipe de 2 ou seul.  
Les travaux peuvent être remis en retard de max 3 jours.
-10 points / jour de retard

### 1. Base Binaire
---

      123 | 2
     -122   61 | 2
       1   -60   30 | 2
             1  -30   15 | 2
                  0  -14   7 | 2
                       1  -6   3 | 2
                           1  -2   1
                               1
    Resultat
      1111011
    Afin d'obtenir 8 bits on rajoute un 0

      01111011

#### Addition

     229    11100101
    + 50   +00110010
            00010111   Retenue |1|
Avec 8 bits il est impossible de repésenter un chiffre de 255  
Le témoin de retenue sait que le montant a dépassé la valeur des 8 bits.

Avec un système évolué, il vérifie le témoin de retenue si Temoin de retenue = 1, Alors Erreur

Si il n'est pas vérifié, le programme peut s'exécuter sans problème avec des petites valeurs jusqu'à ce qu'une valeur plus grade soint utilisée.

    1111 1111  1111 1111 : 65535  16bits (WORD) 2^16 - 1

    32 bits : 2^32 - 1 ~ 4 000 000 000
    64 bits : 2^64 - 2 ~ 1,84E19

     17124 | 16
     -16      1070 | 16
      112    -96    66 | 16
     -112     110  -64    4
       04     -96    2
               14


      42E4  |  4096  |
     +27F7  |     5  |
      6ADB  | 20480  |  20480
     -1418  |        | + 1280
      56C3  |   256  | +  192
     -00FF  |     5  | +    4
      55C4  |  1280  |  21956
            |
            |    16
            |    12
            |   192
