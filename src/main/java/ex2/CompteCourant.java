package ex2;

public class CompteCourant extends CompteBancaire {
	
	/** Découvert autorisé par la banque */
	protected double decouvertAutorise;

	public CompteCourant(String type, double solde, double decouvert) {
		super(solde);
		this.decouvertAutorise = decouvert;
	}
	
	@Override
	public void debiterMontant(double montant) {
		if (this.solde - montant > decouvertAutorise){
			this.solde = solde - montant;
		}	
	}	
}
