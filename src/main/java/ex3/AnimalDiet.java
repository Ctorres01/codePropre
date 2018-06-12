package ex3;

/**Enumération des régimes alimentaires des animaux
 * @author Corentin Torres
 *
 */
public enum AnimalDiet {
	
	HERBIVORE("herbivore"),
	CARNIVORE("Carnivore");
	
	
	private String diet;
	
	private AnimalDiet(String diet) {
		this.diet = diet;
	}
}
