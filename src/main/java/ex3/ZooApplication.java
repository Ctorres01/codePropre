package ex3;

public class ZooApplication {

	public static void main(String[] args) {
		Zoo zoo = new Zoo("Thoiry");
		
		zoo.addAnimal(new Animal("Gazelle", AnimalType.MAMMIFERE, AnimalDiet.HERBIVORE));
		zoo.addAnimal(new Animal("Zèbre", AnimalType.MAMMIFERE, AnimalDiet.HERBIVORE));
		zoo.addAnimal(new Animal("Lion", AnimalType.MAMMIFERE, AnimalDiet.CARNIVORE));
		zoo.addAnimal(new Animal("Panthère", AnimalType.MAMMIFERE, AnimalDiet.CARNIVORE));
		zoo.addAnimal(new Animal("Requin Blanc", AnimalType.POISSON, AnimalDiet.CARNIVORE));
		zoo.addAnimal(new Animal("Truite Dorée", AnimalType.POISSON, AnimalDiet.HERBIVORE));
		zoo.addAnimal(new Animal("Boa Constrictor", AnimalType.REPTILE, AnimalDiet.CARNIVORE));
		zoo.addAnimal(new Animal("Python", AnimalType.REPTILE, AnimalDiet.CARNIVORE));
		zoo.displayAllAnimals();
		
	}
}
