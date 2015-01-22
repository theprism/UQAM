### 15 Jan 2015 - Programmation Web
----

DNS : Domain name service, tranforme une adresse sous forme textuelle vers la vrai adresse ip du serveur.  

#### Encodage
Compatibilité : encodage utf-8  

*UTF-8*  
1 octet -> ASCII  
2 octets -> BMP  
3 octets -> BMP...  
4 octets -> autre  

### Document HTML
---

    <html>
        <head>
	        <title>Titre du document</title>
	    </head>
	    <body>
	        <!-- Le corps du document -->
	    </body>
	</html>

Les identifiants ne sont pas sensibles à la casse, 

    <body><body>
    
est valide.

**Caractères réservés**

    " &quot;
    ' &apos;
    & &amp;
    < &lt;
    > &gt;

**Manipulation de texte**
**p** : Paragraphe

    <p> ceci est un paragraphe</p>

**pre** : texte préformaté, le contenu ne sera pas modifié par le fureteur

    <pre>
        Le texte ici ne
            sera
        pas
                 formatté
    </pre>
    
On peut forcer plusieurs espaces cpnsécutifs, on peut utiliser 

    &nbsp; 

    <p> Ainsi on peut forcer, &nbsp;&nbsp;&nbsp; 3 espaces consécutifs.
    
**Liste**

    <ul> liste non ordonnée
        <li> element de la liste
    <ol> liste ordonnée
        <li> element de la liste ordonnée

**Tableaux**

table : crée un tableau  
thead : en-tête du tableau  
tbody : contenu du tableau  
tfoot : bas du tableau  

tr : rangé du tableau  
th : case d'entête  
td : case du tableau  

**Images**

img : Insertion d'une image  

    <img src="img/UnderTheFall.jpg" alt="Album">
    
L'attribut alt sert à indiquer ce que le fureteur affichera s'il n'est pas capable de charger l'image  
Il sert également pour l'accessibilité du web (ex. non voyant).  

**Lien**

**a** : Le contenu de la balise sera un hyperlien.  

    <a href="http://www.jberger.org/">Cliquez ici</a>
    
    <a href="http://www.uqam.ca/">
        <img src="adresse de l'image" alt="dude t'est aveugle">
    </a>
    
