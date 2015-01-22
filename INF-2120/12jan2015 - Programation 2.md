### Programation 2
---

50% / 50% Pour passer le cours  
1 jour de retard Max -10 %

#### Revision d'INF-1120

Pointeurs, objets, tablaux string

Variables d'instance, appartiennes aux instances.  
Variables statiques, appartienne à la classe

Getters, permettent d'obtenir la valeur d'une variable d'instance private  
Constructeurs, permettent de générer une objet de la classe.  
Setters, permettent de modifier une variable de l'instance.

Attributs constants, (final)  
Pas d'initialisation par défaut (implicite)

**Contrat**  
Services offerts par cette classe, ce qui peut être utilisé à l'utilisation. (public)

**Implémentation**  
Services de la classe qui sont utilisé par celle-ci (private)
> L'utilisateur n'a pas à connaitre l'implémentation d'une classe pour utiliser cette classe, seulment son contrat

*Encapsulation*  
Permet de cacher les données d'une classe aux autres.  
On doit donc passer par des méthode pour modifier les donnés


#### Paquetage
===

Regroupement logique de classe.  
Paquetage fait par hiérarchie.

**Assignation d'une classe dans un package**

    // package par défaut
    public class A {
    
    }

-

    package p1;

    public class B {

    }

-

    package p2;

    public class C {

    }

-

    package p2.p3;

    public class D {

    }

**Importation des classes**

    //paquetatge par defaut
    import p1.B;
    import p2.C;
    import p2.p3.D;

    public class Test {
        public static void main (String[] mgdlm){

        }
    }

**Import**

Pour importer toutes les classe d'un package : 

    import package.*;

Package standards :

    String | java.lang | automatique
    Math | java.lang | automatique
    ArrayList | java.lang | import java.util.ArrayList;
    DecimalFormat | java.text | import java.text.DecimalFormat;
    File           |         |
    IOException    | java.io | import java.io.*;
    BufferedReader |         |
    PrintWriter    |         |
