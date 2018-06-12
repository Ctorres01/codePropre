package ex3;

public class ZooApplication {

	public static void main(String[] args) {
		Zoo zoo = new Zoo("Thoiry");
		
		Animal gazelle = new Animal("Gazelle", AnimalType.MAMMIFERE, AnimalDiet.HERBIVORE);
		zoo.addAnimal(gazelle);
		
		Animal zebre = new Animal("Zèbre", AnimalType.MAMMIFERE, AnimalDiet.HERBIVORE);
		zoo.addAnimal(zebre);
		
		Animal lion = new Animal("Lion", AnimalType.MAMMIFERE, AnimalDiet.CARNIVORE);
		zoo.addAnimal(lion);
		
		Animal panthere = new Animal("Panthère", AnimalType.MAMMIFERE, AnimalDiet.CARNIVORE);
		zoo.addAnimal(panthere);
		
		Animal requinBlanc = new Animal("Requin Blanc", AnimalType.POISSON, AnimalDiet.CARNIVORE);
		zoo.addAnimal(requinBlanc);
		
		Animal truiteDoree = new Animal("Truite Dorée", AnimalType.POISSON, AnimalDiet.HERBIVORE);
		zoo.addAnimal(truiteDoree);
		
		Animal boaConstrictor = new Animal("Boa Constrictor", AnimalType.REPTILE, AnimalDiet.CARNIVORE);
		zoo.addAnimal(boaConstrictor);
		
		Animal python = new Animal("Python", AnimalType.REPTILE, AnimalDiet.CARNIVORE);
		zoo.addAnimal(python);
	}

}
