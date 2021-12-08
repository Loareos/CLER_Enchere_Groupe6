/**
 * 
 */
package fr.eni.projet.BO;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Calendar;

import fr.eni.projet.BLL.BLLException;

/**
 * @author junisaru69
 *
 */
public class ArticleVendu {

	private int noUtilisateur;
	private int noArticle;
	private String nomArticle;
	private String description;
	private LocalDateTime dateDebutEncheres;
	private LocalDateTime dateFinEncheres;
	private int miseAPrix;
	private int prixVente;
	private int noCategorie;

	////////////////////////////////////////////////////////////////
	//											Construct
	//______________________________________________________________


	/**
	 * 
	 * Constructeur 
	 * 
	 * @param nomArticle description dateDebutEncheres 
	 * 			dateFinEncheres noUtilisateur noCategorie
	 */
	public ArticleVendu(String nomArticle, String description, LocalDateTime dateDebutEncheres,
			LocalDateTime dateFinEncheres,int noUtilisateur, int noCategorie) {
		super();
		this.nomArticle = nomArticle;
		this.description = description;
		this.dateDebutEncheres = dateDebutEncheres;
		this.dateFinEncheres = dateFinEncheres;
		this.noUtilisateur = noUtilisateur;
		this.noCategorie = noCategorie;
	}
	/**
	 * Constructeur + noArticle
	 * 
	 * @param nomArticle description dateDebutEncheres 
	 * 			dateFinEncheres noUtilisateur noCategorie
	 * 
	 */
	public ArticleVendu(int noArticle, String nomArticle, String description,
			LocalDateTime dateDebutEncheres,LocalDateTime dateFinEncheres, int noUtilisateur,
			int noCategorie) {
		this(nomArticle, description, dateDebutEncheres,
				dateFinEncheres, noUtilisateur, noCategorie);
		this.noArticle = noArticle;
	}

	////////////////////////////////////////////////////////////////
	//											Get/Set
	//______________________________________________________________

	/**
	 * @return the noArticle
	 */
	public int getNoArticle() {
		return noArticle;
	}
	/**
	 * @param noArticle the noArticle to set
	 */
	public void setNoArticle(int noArticle) {
		this.noArticle = noArticle;
	}
	/**
	 * @return the nomArticle
	 */
	public String getNomArticle() {
		return nomArticle;
	}
	/**
	 * @param nomArticle the nomArticle to set
	 * @throws BOException si il y a plus de 30 caractères.
	 */
	public void setNomArticle(String nomArticle) {
		this.nomArticle = nomArticle;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}
	/**
	 * @param description the description to set
	 * @throws BOException si il y a plus de 300 caractères.
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	/**
	 * @return the dateDebutEncheres
	 */
	public LocalDateTime getdateDebutEncheres() {
		return dateDebutEncheres;
	}
	/**
	 * @param dateDebutEncheres the dateDebutEncheres to set
	 * @throws BOException verifi que la date soit postérieur à aujourd'hui
	 */
	public void setdateDebutEncheres(LocalDateTime dateDebutEncheres) {
				this.dateDebutEncheres = dateDebutEncheres;
	}
	/**
	 * @return the dateFinEncheres
	 */
	public LocalDateTime getdateFinEncheres() {
		return dateFinEncheres;
	}
	/**
	 * @param dateFinEncheres the dateFinEncheres to set
	 */
	public void setdateFinEncheres(LocalDateTime dateFinEncheres) {
		this.dateFinEncheres = dateFinEncheres;
	}
	/**
	 * @return the miseAPrix
	 */
	public int getMiseAPrix() {
		return miseAPrix;
	}
	/**
	 * @param miseAPrix the miseAPrix to set
	 * @throws BOException 
	 */
	public void setMiseAPrix(int miseAPrix){
		this.miseAPrix = miseAPrix;
	}
	/**
	 * @return the prixVente
	 */
	public int getPrixVente() {
		return prixVente;
	}
	/**
	 * @param prixVente the prixVente to set
	 * @throws BOException 
	 */
	public void setPrixVente(int prixVente){
		this.prixVente = prixVente;
	}
	/**
	 * @return the noUtilisateur
	 */
	public int getNoUtilisateur() {
		return noUtilisateur;
	}
	/**
	 * @param noUtilisateur the noUtilisateur to set
	 */
	public void setNoUtilisateur(int noUtilisateur) {
		this.noUtilisateur = noUtilisateur;
	}
	/**
	 * @return the noCategorie
	 */
	public int getNoCategorie() {
		return noCategorie;
	}
	/**
	 * @param noCategorie the noCategorie to set
	 */
	public void setNoCategorie(int noCategorie) {
		this.noCategorie = noCategorie;
	}
	
	@Override
	public String toString() {
		return "Article vendu: No " + getNoArticle()
		+ ", "+ getNomArticle()
		+ ",desc: "+ getDescription()
		+ ", debut enchère: " + getdateDebutEncheres() 
		+ "/fin: " + getdateFinEncheres()
		+ ", Prix départ: " +(getMiseAPrix() != 0 ? getMiseAPrix() + ", " : "")
		+ "/Prix vente: " + (getPrixVente() != 0 ? getMiseAPrix() + ", " : "")
		+ ", No Util: "+ getNoUtilisateur()
		+ ", Caté: " + getNoCategorie() + "-";
	}

}
