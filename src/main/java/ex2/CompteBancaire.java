package ex2;

/** ReprÃ©sente un compte bancaire de type compte courante (type=CC) ou livret A (type=LA)
 * @author DIGINAMIC
 */
public abstract class CompteBancaire {

	/** solde : solde du compte */
	protected double solde;
	
		/** Le type vaut soit CC=Compte courant, ou soit LA=Livret A 
		private String type; */
							
							
	/** Ce constructeur est utilisÃ© pour crÃ©er un compte de type Livret A
	 * @param type = LA
	 * @param solde reprÃ©sente le solde du compte
	 * @param decouvert  reprÃ©sente le dÃ©couvert autorisÃ©
	 * @param tauxRemuneration  reprÃ©sente le taux de rÃ©munÃ©ration du livret A
	 */
	
	public CompteBancaire() {
		this.solde = 0;
	}
	
	public CompteBancaire(double solde) {
		super();
		this.solde = solde;
	}
	
	/** Ajoute un montant au solde
	 * @param montant
	 */
	public void ajouterMontant(double montant){
		this.solde += montant;
	}
	
	/** Ajoute un montant au solde
	 * @param montant
	 */
	public abstract void debiterMontant(double montant);
	
	
	/** Getter for solde
	 * @return the solde
	 */
	public double getSolde() {
		return solde;
	}
	
	/** Setter
	 * @param solde the solde to set
	 */
	public void setSolde(double solde) {
		this.solde = solde;
	}

}
