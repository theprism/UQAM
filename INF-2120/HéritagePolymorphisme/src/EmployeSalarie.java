
/**
 * Exemple inspire de Savitch, Absolute Java, chap. 7.
 * 
 * @author Louise Laforest (laforest.louise@uqam.ca)
 * @version 4 janvier 2005 - 6 janvier 2011
 */

public class EmployeSalarie extends Employe {

  private double salaire; // salaire annuel

  /*****************************
   * CONSTRUCTEURS
   *****************************/

  public EmployeSalarie () {
		// Appel implicite du constructeur sans argument de la classe superieure
    salaire = 0;
  } 

  public EmployeSalarie ( String leNom, Date laDate, double leSalaire ) {
		// Appel explicite du constructeur de la classe superieure
    super ( leNom, laDate ); 
    
		if ( leSalaire >= 0 ) {
      salaire = leSalaire;
    } else {
      salaire = 0;
    }
  } 

  public EmployeSalarie ( EmployeSalarie employe ) {
		// Appel explicite du constructeur de la classe superieure
		super ( employe );

    salaire = employe.salaire;
  } 

  /*****************************
   * GETTERS ET SETTERS
   *****************************/

  public double getSalaire ( ) {
    return salaire;
  } 

  public void setSalaire ( double nouveauSalaire ) {
    if ( nouveauSalaire >= 0 ) {
      salaire = nouveauSalaire;
    } else {
      salaire = 0;
    }
  } 

  /*****************************
   * AUTRES METHODES
   *****************************/

  public double leSalaireParMois ( ) {
    return salaire / 12;
  } 

  //redefinition de la methode toString de la classe Employe
  public String toString ( ) {
    return super.toString () + "\n$" + salaire + " par annee";
  } 

}


