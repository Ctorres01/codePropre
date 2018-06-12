package ex1;

import java.util.Date;

public class Entreprise {

	public int siret;
	public String nom;
	public String adresse;
	public Date dateCreation;
	
	public static final int capitalMax = 3_000_000;
	
	/**
	 * Méthode qui affiche, dans la sortie standard, les attributs de la classe ainsi que leurs valeurs
	 * 
	 */
	public void afficherStatut(){
		System.out.println("Siret: "+this.siret+"\nNom: "+this.nom+"\nAdresse: "+this.adresse+"\nDate de création: "+this.dateCreation);
	}
	
}
