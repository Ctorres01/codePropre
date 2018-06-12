package ex3;

public class SavaneAfricaine extends DietRestrictiveZone{
	
	public SavaneAfricaine(String name) {
		super(name, AnimalType.MAMMIFERE, AnimalDiet.HERBIVORE);
		this.foodCoeff = 10;
	}

}
