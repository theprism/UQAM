
/**
 * Classe permettant de construire une date formatee d'une annee, d'un mois et d'un jour.
 * Les mois seront representes par les nombres 1, 2, ..., 12 correspondant respectivementa janvier, 
 * fevrier, mars, ..., decembre.
 * 
 * @author Louise Laforest, <A HREF="mailto:laforest.louise@uqam.ca">laforest.louise@uqam.ca</A>
 * @version Automne 2004
 */

public class Date {

  private int annee;
  private int mois;
  private int jour;

  /**
   * Construit une <code>Date</code> avec l'annee 0, le mois 1 et le jour 1.
   */
  public Date () { 
    annee = 0;
    mois = 1;
    jour = 1;
  } 

  /**
   * Construit une <code>Date</code> avec annee, mois et jour.
   * Si (annee, mois, jour) ne constitue pas une date valide, l'exception ErrConstDate sera levee.
   * @param annee l'annee
   * @param mois le mois
   * @param jour le jour
   * @throws ErrConstDate si construction d'une date invalide.
   */
  public Date ( int annee, int mois, int jour ) throws ErrConstDate { 
    if ( mois < 1 || mois > 12 ) {
      throw new ErrConstDate( "mois invalide" ); 
    } else if (jour < 1 || jour > nbJoursMois ( mois, annee ) ) {
      throw new ErrConstDate( "jour invalide" );
    } else {
      this.annee = annee;
      this.mois = mois;
      this.jour = jour;
    }
  } 

  /**
   * Retourne <code>true</code> ou <code>false</code> selon que l'annee, le mois et le jour constituent une date valide, <code>false</code> sinon.
   * @param annee l'annee
   * @param mois le mois
   * @param jour le jour
   * @return <code>true</code> si et seulement si l'annee, le mois et le jour constituent une date valide, <code>false</code> sinon.
   */
  public static boolean estValide ( int annee, int mois, int jour ) {
    return mois >= 1 && mois <= 12 && jour > 0 && jour <= nbJoursMois ( mois, annee );
  }

  /**
   * Retourne une copie de la <code>Date</code>.
   * @return une copie de la <code>Date</code>.
   */
  public Date copie () {
    Date copie = null;
    try {
      copie = new Date ( this.annee, this.mois, this.jour );
    } catch (ErrConstDate e) {
    }
    return copie;
  } 

  /**
   * Retourne la chaine de caractere correspondant a la <code>Date</code> sous la forme aaaa/mm/jj.
   * @return la chaine de caractere correspondant a la <code>Date</code> sous la forme aaaa/mm/jj.
   */
  public String toString () {
    String s = this.annee + "/";
    if ( mois < 10 ) {
      s = s + '0';
    }
    s = s + this.mois + '/';
    if ( jour < 10 ) {
      s = s + '0';
    }
    s = s + this.jour;
    return s;
  } 

  /**
   * Retourne <code>true</code> si et seulement si cette <code>Date</code> est la meme annee, 
	 * le meme mois et le me;me jour que l'argument, <code>false</code> sinon.
   * @param d la <code>Date</code> a comparer avec cette <code>Date</code>
   * @return <code>true</code> si et seulement si cette <code>Date</code> est la meme annee, 
   * le meme mois et le meme jour que l'argument, <code>false</code> sinon.
   */
  public boolean equals ( Date d ) {
    return annee == d.annee && mois == d.mois && jour == d.jour;
  } 

  /**
   * Retourne <code>true</code> si et seulement si cette <code>Date</code> est anterieure a 
   * l'argument, <code>false</code> sinon.
   * @param d la <code>Date</code> a comparer avec cette <code>Date</code>
   * @return <code>true</code> si et seulement si cette <code>Date</code> est anterieure a l'argument, 
   * <code>false</code> sinon.
   */
  public boolean plusPetite ( Date d ) {
    boolean reponse;
    if ( this.annee != d.annee ) {
      reponse = this.annee < d.annee;
    } else if ( this.mois != d.mois ) {
      reponse = this.mois < d.mois;
    } else {
      reponse = this.jour < d.jour;
    }
    return reponse;
  } 

  /**
   * Retourne le nom du mois sous forme de chaine de caracteres. Si le mois est invalide, 
   * retourne la chaine "inconnu".
   * @param mois le mois
   * @return le nom du mois sous forme de chaine de caracteres. Si le mois est invalide, 
   * retourne la chaine "inconnu".
   */
  public static String nomDuMois ( int mois ) {
    final String[] noms = 
        { "janvier", "fevrier", "mars", "avril", "mai", "juin", "juillet", "aout", "septembre", 
        "octobre", "novembre", "decembre" };
    return noms[ mois - 1 ];
  } 

  /**
   * Retourne <code>true</code> si et seulement si l'argument represente une annee bissextile, 
    * <code>false</code> sinon.
   * @param annee l'annee a verifier
   * @return <code>true</code> si et seulement si l'argument represente une annee bissextile, 
   * <code>false</code> sinon.
   */
  public static boolean estBissextile ( int annee ) {
    return annee % 4 == 0 && annee % 100 != 0 ||
    annee % 400 == 0;
  } 

  /**
   * Retourne le nombre de jours du mois, en fonction de l'annee pour prendre en compte les annees 
   * bissextile pour le mois de fevrier.
   * @param mois le mois
   * @param annee l'annee 
   * @return le nombre de jours du mois, en fonction de l'annee pour prendre en compte 
   * les annees bissextile pour le mois de fevrier.
   */
  public static int nbJoursMois ( int mois, int annee ) {

    int reponse = 0;

    if ( mois == 1 || mois == 3 || mois == 5 || mois == 7 || mois == 8 ||
    mois == 10 || mois == 12 ) {
      reponse = 31;
    } else if ( mois == 4 || mois == 6 || mois == 9 || mois == 11 ) {
      reponse = 30;
    } else if ( mois == 2 ) {
      if ( estBissextile ( annee ) ) {
        reponse = 29;
      } else {
        reponse = 28;
      }
    }

    return reponse;

  }
} // Date

class ErrConstDate extends Exception {
  ErrConstDate ( String s ) { 
    super ( s );
  }
} // ErrConstDate
