package ex3;

/**Enumération des types d'animaux
 * @author Corentin Torres
 *
 */
public enum AnimalType {
	
	MAMMIFERE("Mammifère"),
	POISSON("Poisson"),
	REPTILE("Reptile");
	
	
	private String libelle;
	
	private AnimalType(String libelle) {
		this.libelle = libelle;
	}
}
