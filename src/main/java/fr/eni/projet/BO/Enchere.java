/**
 * 
 */
package fr.eni.projet.BO;

import java.time.LocalDateTime;

/**
 * @author junisaru69
 *
 */
public class Enchere {

	private int noUtilisateur;
	private int noArticles;
	private int montant_enchere;
	private LocalDateTime date_enchere;

	////////////////////////////////////////////////////////////////
	//											Construct
	//______________________________________________________________

	/**
	 * @param no_utilisateur
	 * @param no_articles
	 * @param montant_enchere
	 * @param date_enchere
	 */
	public Enchere(int no_utilisateur, int no_articles, int montant_enchere,
				LocalDateTime date_enchere) {
		this(no_articles,montant_enchere,date_enchere);
		this.noUtilisateur = no_utilisateur;
	}

	/**
	 * @param no_utilisateur
	 * @param no_articles
	 * @param montant_enchere
	 * @param date_enchere
	 */
	public Enchere(int no_articles, int montant_enchere, LocalDateTime date_enchere) {
		this.noArticles = no_articles;
		this.montant_enchere = montant_enchere;
		this.date_enchere = date_enchere;
	}
	
	////////////////////////////////////////////////////////////////
	//											Get/Set
	//______________________________________________________________

	/**
	 * @return the no_utilisateur
	 */
	public int getNo_utilisateur() {
		return noUtilisateur;
	}

	/**
	 * @param no_utilisateur the no_utilisateur to set
	 */
	public void setNo_utilisateur(int no_utilisateur) {
		this.noUtilisateur = no_utilisateur;
	}

	/**
	 * @return the no_articles
	 */
	public int getNo_articles() {
		return noArticles;
	}

	/**
	 * @param no_articles the no_articles to set
	 */
	public void setNo_articles(int no_articles) {
		this.noArticles = no_articles;
	}

	/**
	 * @return the montant_enchere
	 */
	public int getMontant_enchere() {
		return montant_enchere;
	}

	/**
	 * @param montant_enchere the montant_enchere to set
	 */
	public void setMontant_enchere(int montant_enchere) {
		this.montant_enchere = montant_enchere;
	}

	/**
	 * @return the date_enchere
	 */
	public LocalDateTime getDate_enchere() {
		return date_enchere;
	}

	/**
	 * @param date_enchere the date_enchere to set
	 */
	public void setDate_enchere(LocalDateTime date_enchere) {
		this.date_enchere = date_enchere;
	}

	@Override
	public String toString() {
		return ":Enchere: No Util:" + getNo_utilisateur()
						+ ", Art:" + getNo_articles()
						+ " à " + getMontant_enchere()
						+" £ le " + getDate_enchere()+ "-";
	}
	
	
}