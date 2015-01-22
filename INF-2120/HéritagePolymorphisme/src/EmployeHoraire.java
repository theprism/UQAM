/**
 * Exemple inspire de Savitch, Absolute Java, chap. 7.
 * 
 * @author Louise Laforest (laforest.louise@uqam.ca)
 * @version 4 janvier 2005 - 8 janvier 2011
 */
public class EmployeHoraire extends Employe {

  private double tauxHoraire; // salaire horaire
  private double heures;      // nombre d'heures travaillees

  /*****************************
   * CONSTRUCTEURS
   *****************************/

  public EmployeHoraire () {
    // Appel implicite du constructeur sans argument de la superclasse

    tauxHoraire = 0; // facultatif (init par defaut)
    heures = 0;      // facultatif (init par defaut)
  } 

  public EmployeHoraire( String leNom, Date laDate, double leTauxHoraire, double lesHeures ) {
    //Appel explicite du constructeur de la superclasse
    super ( leNom, laDate );

    if (leTauxHoraire >= 0) {
      tauxHoraire = leTauxHoraire;
    } else {
      tauxHoraire = 0;
    }
    if (lesHeures >= 0) {
      heures = lesHeures;
    } else {
      heures = 0;
    }
  } 

  public EmployeHoraire ( EmployeHoraire autreEmploye ) {
    //Appel explicite du constructeur de la superclasse
    super ( autreEmploye );

    tauxHoraire = autreEmploye.tauxHoraire;
    heures = autreEmploye.heures;
  } 

  /*****************************
   * GETTERS ET SETTERS
   *****************************/

  public double getTauxHoraire () {
    return tauxHoraire;
  } 

  public double getHeures () {
    return heures;
  } 

  public void setHeures ( double heuresTravaillees ) {
    if (heuresTravaillees >= 0) {
      heures = heuresTravaillees;
    } else {
      heures = 0;
    }
  } 

  public void setTauxHoraire ( double heuresTravaillees ) {
    if ( heuresTravaillees >= 0 ) {
      tauxHoraire = heuresTravaillees;
    } else {
      tauxHoraire = 0;
    }
  } 

  /*****************************
   * AUTRES METHODES
   *****************************/

  public double donnerLaPaye () {
    return tauxHoraire * heures;
  } 

  // Redefinition de la methode toString de la classe Employe
  public String toString () {
    return ( getNom( ) + " " + getDateDembauche( ) 
      + "\n$" + tauxHoraire + " de l'heure pour " + heures + " heures");
  } 
}

