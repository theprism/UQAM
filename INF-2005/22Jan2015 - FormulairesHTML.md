### Programation Web
---

Architecture client-serveur  
SGML  
|  |  
XML - HTML  
|  
Vigueur  
syntaxe  

#### Formulaires HTML

Utilité : Saisir des données, interaction avec l'utilisateur. Les données seront envoyées au serveur ou manipulés pas le client avec du javascript.  

**Champ de texte**  

    <input type="text" id="prenom" name="fname" size="40">
    Champ de saisie de texte.  
    
**Mot de passe**  

    <input type="password" id="motdepasse" name="password" size="30">
    
**Boite de texte**  

    <textarea cols="60" rows="5">Un long texte.</textarea>
    Texte sur plusieur lignes
    
**Boutons**  
2 types de bouton avec 2 balises.  

Une forme de bouton pour les formulaires (input)  
Une forme de bouton plus flexible (button)  

**Bouton de formulaire**  

    <input type="reset" value="Vider">
    <input type="submit" value="Envoyer">
    <input type="button" value="Cliquez ici">
    
*Type reset* : Vider le formulaire.  
*Type sumbmit* : Envoyer le formulaire.  
*Type button* : Bouton cliquable.  

**Boutons plus flexibles**  
Utilise la balise button  
Permet les images  

    <button type="button" value="calculate">Calculer le remboursement</button>
    <button type="button" value="follow">
	    <img src="img/twitter168.jpg" alt="Twitter">
    </button>

**Case à cocher**  
Uniquement le contrôle, n'inclut pas la description.  

    <input type="checkbox" checked="checked" name="publicity" value="1">
    <span>Cochez cette case pour recevoir des offres promotionnelles</span>

**Bouton radio**  
Choix à cocher  
Un seul bouton radio peut être sélectionné à la fois.  

    <span>Votre salaire annuel :</span><br> 
    <input type="radio" name="salary" value="1" checked="checked">
    <span>Moins	de 20 000$</span><br>
    <input type="radio" name="salary" value="2">
    <span>20 000$ à 29 999$</span><br>
    <input type="radio" name="salary" value="3">
    <span>30 000$ à 39 999$</span><br>
    <input type="radio" name="salary" value="4">
    <span>Plus de 40 000$</span><br>

Pour afficher un bouton radio ou une case à cocher comme étant coché, on utilise l'attribut checked  

**Liste déroulante**
Combo Box  
Choisir une valeur parmi une liste  
Liste : élément select  
Élément dans la liste : élément option  

    <select id="province" name="province">
        <option value="qc">Québec</option>
        <option value="on">Ontario</option>
    </select>

*Possible de regrouper des options avec optgroup*

    <select name="language">
        <optgroup label="Web">
            <option value="html4">HTML 4.01</option>
            <option value="html5">HTML 5</option>
            <option value="css2">CSS 2.1</option>
            <option value="css3">CSS 3</option>
        </optgroup>
        <optgroup label="Dynamique">
            <option value="ruby">Ruby</option>
            <option value="groovy">Groovy</option>
        </optgroup>
    </select>
    
Liste déroulante avec contenu réutilisable.

    <input list="progweb">

    <datalist id="progweb">
        <option value="PHP">
        <option value="Perl">
        <option value="Python">
    </datalist>

**Lablel**  
Texte ascocié à un champ  
Cliquer sur le label active le champ associé  
La liaison est faite avec l'attribut for.  

    <label for="nom">Nom :</label>
    <input type="text" id="nom" name="name" size="40">

**Champ caché**  
hidden  
Envoyer de l'information au serveur que l'utilisateur n'a pas besoin de voir ou de connaître.  

    color
    date
    datetime
    datetime-local
    email
    month
    number
    range
    search
    tel
    time
    url
    week

**Champ de texte en lecture seule**  

    <textarea cols="60" rows="5" readonly="readonly">Celui-ci est en lecture seule.</textarea>
    
**Champ desactivé**

    <button type="button" value="off" disabled="disabled">Désactivé</button>
    
#### Formulaire

Le formulaire HTML permet d'envoyer les valeurs des différents contrôles au serveur web de façon automatique.  
On crée un formulaire avec la balise form.  

    <form action="get_address.php" method="get">
        <div>
            <p>Entrez votre adresse</p>
            <label for="adresse">Adresse : </label> 
            <input type="text" id="adresse" name="adresse" size="50"><br> 
            <label for="ville">Ville : </label> 
            <input type="text" id="ville" name="ville" size="35"><br> 
            <label for="province">Province : </label> 
            <select id="province" name="province">
                <option value="qc">Québec</option>
                <option value="on">Ontario</option>
            </select><br>
            <label for="cp">Code postal : </label>
            <input type="text" size="6" id="cp" name="cp"><br>
            <button type="reset">Vider</button>
            <button type="submit">Soumettre</button>
        </div>
    </form>

Si les contrôles ne sont pas dans un formulaire (form), il faut gérer leur contenu et la requête au serveur nous-même (ex. avec Javascript)  

