package ex3;

public enum AnimalDiet {
	HERBIVORE("herbivore"),
	CARNIVORE("Carnivore");
	
	
	private String libelle;
	
	private AnimalDiet(String libelle) {
		this.libelle = libelle;
	}
}
