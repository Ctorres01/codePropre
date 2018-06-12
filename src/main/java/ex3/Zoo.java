package ex3;

import java.util.List;

public class Zoo {

	private String nom;
	
	private List<Zone> zones;
	private List<DietRestrictiveZone> dietZones;
	
	public Zoo(String nom){
		SavaneAfricaine savaneAfricaine = new SavaneAfricaine("Savane Africaine");
		ZoneCarnivore zoneCarnivore = new ZoneCarnivore("Zone Carnivores");
		FermeReptile fermeReptilee = new FermeReptile("Ferme Aux Reptiles");
		Aquarium aquarium = new Aquarium("Aquarium");
		this.dietZones.add(savaneAfricaine);
		this.dietZones.add(zoneCarnivore);
		this.zones.add(fermeReptilee);
		this.zones.add(aquarium);
		this.nom = nom;
	}
	
	/**Ajoute un Animal donné au zoo en le mettant dans la bonne zone
	 * @param animal: Animal à ajouter au zoo
	 */
	public void addAnimal(Animal animal) {
		getAnimalZone(animal).addAnimal(animal);
	}
	
	/**Méthode qui retourne la zone qui convient à l'animal passé en paramètre
	 * @param animal dont on souhaite connaître la zone
	 * @return la zone qui convient à l'animal passé en paramètre
	 */
	public Zone getAnimalZone(Animal animal) {
		Zone acceptZone = null;
		boolean isAccepted = false;
		int i = 0;
		while(!isAccepted && i<zones.size()) {
			isAccepted = zones.get(i).accept(animal);
			if(isAccepted) {
				acceptZone = zones.get(i);
			}
		}
		return acceptZone;
	}
	
	/**Affiche la liste des animaux de chaque zone
	 * 
	 */
	public void afficherListeAnimaux(){
		for(Zone zone : zones) {
			zone.displayAnimals();
		}
	}

	/** Getter for nom
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/** Setter
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}
}
