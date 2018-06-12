package ex3;

import java.util.ArrayList;
import java.util.List;

import org.omg.Messaging.SyncScopeHelper;

public class Zoo {

	private String nom;
	private List<Zone> zones;
	
	public Zoo(String nom){
		this.zones = new ArrayList<Zone>();
		this.zones.add(new SavaneAfricaine("Savane Africaine"));
		this.zones.add(new ZoneCarnivore("Zone Carnivores"));
		this.zones.add(new FermeReptile("Ferme Aux Reptiles"));
		this.zones.add(new Aquarium("Aquarium"));
		this.nom = nom;
	}
	
	/**Ajoute un Animal donné au zoo en le mettant dans la bonne zone
	 * @param animal: Animal à ajouter au zoo
	 */
	public void addAnimal(Animal animal) {
		Zone zone;
		try {
			zone = getAnimalZone(animal);
			zone.addAnimal(animal);
		} catch (NoZoneFoundException e) {
			e.printStackTrace();
		}
			
	}
	
	/**Méthode qui retourne la zone qui convient à l'animal passé en paramètre
	 * @param animal dont on souhaite connaître la zone
	 * @return la zone qui convient à l'animal passé en paramètre
	 */
	public Zone getAnimalZone(Animal animal)throws NoZoneFoundException{
		Zone acceptZone = null;
		boolean isAccepted = false;
		int i = 0;
		while(!isAccepted && i<zones.size()) {
			isAccepted = zones.get(i).accept(animal);
			if(isAccepted) {
				acceptZone = zones.get(i);
			}
			i++;
		}
		if(acceptZone == null) {
			throw new NoZoneFoundException("Aucune zone ne peut accueillir l'animal: "+animal);
		}
		return acceptZone;
	}
	
	/**Affiche la liste des animaux de chaque zone
	 * 
	 */
	public void displayAllAnimals(){
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
