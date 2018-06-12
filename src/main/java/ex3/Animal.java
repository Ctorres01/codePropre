package ex3;

public class Animal {

	private String name;
	private AnimalType type;
	private AnimalDiet diet;
	
	public Animal(String name, AnimalType type, AnimalDiet diet) {
		this.name = name;
		this.type = type;
		this.diet = diet;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public AnimalType getType() {
		return type;
	}

	public void setType(AnimalType type) {
		this.type = type;
	}

	public AnimalDiet getDiet() {
		return diet;
	}

	public void setDiet(AnimalDiet diet) {
		this.diet = diet;
	}

}
