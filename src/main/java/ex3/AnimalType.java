package ex3;

public enum AnimalType {
	
	MAMMIFERE("Mammifère"),
	POISSON("Poisson"),
	REPTILE("Reptile");
	
	
	private String libelle;
	
	private AnimalType(String libelle) {
		this.libelle = libelle;
	}
}
