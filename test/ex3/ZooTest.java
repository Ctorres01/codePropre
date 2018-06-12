package ex3;

import static org.junit.Assert.fail;

import org.junit.*;
import ex3.Zoo;

public class ZooTest {
	
	Zoo zoo;
	Zone fermeReptile;
	Zone savaneAfricaine;
	Zone zoneCarnivore;
	Zone aquarium;
	
	@Before
	public final void setUp() {
		this.zoo = new Zoo("La flèche");
		this.fermeReptile = new FermeReptile("Ferme Aux Reptiles");
		this.savaneAfricaine = new SavaneAfricaine("Savane Africaine");
		this.zoneCarnivore = new ZoneCarnivore("Zone Carnivores");
		this.aquarium = new Aquarium("Aquarium");
	}
	
	
	@Test
	public void testGetAnimalZone() {
		Zone affectedZone;
		
		try {
			affectedZone = zoo.getAnimalZone(new Animal("Vache", AnimalType.MAMMIFERE, AnimalDiet.HERBIVORE));
			Assert.assertEquals(affectedZone, savaneAfricaine);
			
			affectedZone = zoo.getAnimalZone(new Animal("Tortue", AnimalType.REPTILE, AnimalDiet.HERBIVORE));
			Assert.assertEquals(affectedZone, fermeReptile);
			
			affectedZone = zoo.getAnimalZone(new Animal("Léopard", AnimalType.MAMMIFERE, AnimalDiet.CARNIVORE));
			Assert.assertEquals(affectedZone, zoneCarnivore);
			
			affectedZone = zoo.getAnimalZone(new Animal("Carpe", AnimalType.POISSON, AnimalDiet.HERBIVORE));
			Assert.assertEquals(affectedZone, aquarium);
		} catch (NoZoneFoundException e) {
			Assert.fail();
		}
		

	}
}
