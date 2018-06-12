package ex3;

import org.junit.*;

import ex3.Animal;
import ex3.AnimalDiet;
import ex3.AnimalType;

public class DietRestrictiveZoneTest {

	DietRestrictiveZone zone;

	@Before
	public void setUp() {
		this.zone = new DietRestrictiveZone("Mamelles Végétariennes Land", AnimalType.MAMMIFERE, AnimalDiet.HERBIVORE);
	}
		
	@Test
	public void testAccept() {
		boolean isAccepted;
		isAccepted = zone.accept(new Animal("Vache", AnimalType.MAMMIFERE, AnimalDiet.HERBIVORE));
		Assert.assertTrue(isAccepted);
		
		isAccepted = zone.accept(new Animal("Tortue", AnimalType.REPTILE, AnimalDiet.HERBIVORE));
		Assert.assertTrue(!isAccepted);
		
		isAccepted = zone.accept(new Animal("Léopard", AnimalType.MAMMIFERE, AnimalDiet.CARNIVORE));
		Assert.assertTrue(!isAccepted);
		
		isAccepted = zone.accept(new Animal("Requin", AnimalType.POISSON, AnimalDiet.CARNIVORE));
		Assert.assertTrue(!isAccepted);
	}
	
}