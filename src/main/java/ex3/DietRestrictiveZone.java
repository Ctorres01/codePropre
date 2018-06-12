package ex3;

public class DietRestrictiveZone extends Zone {
	
	protected AnimalDiet acceptedDiet;

	public DietRestrictiveZone(String name, AnimalType acceptedType, AnimalDiet acceptedDiet) {
		super(name, acceptedType);
		this.acceptedDiet = acceptedDiet;
	}

	public AnimalDiet getAcceptedDiet() {
		return acceptedDiet;
	}

	public void setAcceptedDiet(AnimalDiet acceptedDiet) {
		this.acceptedDiet = acceptedDiet;
	}
	
	public boolean accept(Animal animal) {
		boolean isAccepted = false;
		if(super.accept(animal)) {
			if(animal.getDiet().equals(this.getAcceptedDiet())) {
				isAccepted = true;
			}
		}
		return isAccepted;
	}

}
