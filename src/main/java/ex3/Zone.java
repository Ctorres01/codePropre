package ex3;

import java.util.ArrayList;
import java.util.List;

public class Zone {
	
	/**
	 * Coefficient de calcul de la quantité de nourriture consommée par jour
	 */
	protected double foodCoeff;
	
	protected String name;
	protected List<Animal> animals;
	protected AnimalType acceptedType;
	
	
	public Zone(String name, AnimalType acceptedType) {
		this.animals = new ArrayList<Animal>();
		this.acceptedType = acceptedType;
		this.name = name;
	}
	
	/**Permet d'ajouter un animal à la zone
	 * @param animal: animal à ajouter à la zone
	 */
	public void addAnimal(Animal animal) {
		animals.add(animal);
	}
	
	/**Permet d'afficher tous les animaux de la zone
	 * 
	 */
	public void displayAnimals(){
		System.out.println("***** "+this.name+" *****");
		for (Animal animal: animals){
			System.out.println(animal.getName());
		}
	}
	
	/**Permet de compter le nombre d'animaux dans la zone
	 * @return nombre d'animaux dans la zone
	 */
	public int countAnimals(){
		return animals.size();
	}
	
	
	/**Méthode permettant de calculer la quantité de nourriture consommée par jour dans la zone
	 * @return
	 */
	public double calculateFoodKgsByDay(){
		return animals.size() * this.foodCoeff;
	}
	
	/**Méthode qui retourne un booléen indiquant si l'animal passé en paramètre 
	 * est compatible avec la zone ou non
	 * @param animal dont on veut tester la compatibilité
	 * @return booléen de réponse
	 */
	public boolean accept(Animal animal) {
		boolean isAccepted = false;
		if(animal.getType().equals(this.getAcceptedType())) {
			isAccepted = true;
		}
		return isAccepted;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Zone other = (Zone) obj;
		if (acceptedType != other.acceptedType)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Animal> getAnimals() {
		return animals;
	}

	public void setAnimals(List<Animal> animals) {
		this.animals = animals;
	}

	public AnimalType getAcceptedType() {
		return acceptedType;
	}

	public void setAcceptedType(AnimalType acceptedType) {
		this.acceptedType = acceptedType;
	}

	public double getFooCoeff() {
		return foodCoeff;
	}

	public void setFoodCoeff(double coeffNourriture) {
		this.foodCoeff = coeffNourriture;
	}
	
	
		
		
}
