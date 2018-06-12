package ex3;

import org.junit.*;

import ex3.Animal;
import ex3.AnimalDiet;
import ex3.AnimalType;
import ex3.Zone;
import ex3.Zoo;

public class ZoneTest {

	Zone zone;

	@Before
	public void setUp() {
		this.zone = new Zone("Mamelles Land", AnimalType.MAMMIFERE);
	}
		
	@Test
	public void testAccept() {
		boolean isAccepted;
		isAccepted = zone.accept(new Animal("Vache", AnimalType.MAMMIFERE, AnimalDiet.HERBIVORE));
		Assert.assertTrue(isAccepted);
		
		isAccepted = zone.accept(new Animal("Tortue", AnimalType.REPTILE, AnimalDiet.HERBIVORE));
		Assert.assertTrue(!isAccepted);
	}
	
}