package ex3;

import java.util.ArrayList;
import java.util.List;

public class Zone {
	
	protected List<Animal> animals;
	protected AnimalType acceptedType;
	protected String name;
	
	protected double foodCoeff;
	
	protected Zone(String name, AnimalType acceptedType) {
		this.animals = new ArrayList<Animal>();
		this.acceptedType = acceptedType;
		this.name = name;
	}
	
	public void addAnimal(Animal animal) {
		animals.add(animal);
	}
	
	public void displayAnimals(){
		System.out.println("***** "+this.name+" *****");
		for (Animal animal: animals){
			System.out.println(animal);
		}
	}
	
	public int countAnimals(){
		return animals.size();
	}
	
	public double calculateFoodKgsByDay(){
		return animals.size() * this.foodCoeff;
	}
	
	public boolean accept(Animal animal) {
		boolean isAccepted = false;
		if(animal.getType().equals(this.getAcceptedType())) {
			isAccepted = true;
		}
		return isAccepted;
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
