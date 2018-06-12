package ex3;

public class ZoneCarnivore extends DietRestrictiveZone{
	
	public ZoneCarnivore(String name) {
		super(name, AnimalType.MAMMIFERE, AnimalDiet.CARNIVORE);
		this.foodCoeff = 10;
	}
}
