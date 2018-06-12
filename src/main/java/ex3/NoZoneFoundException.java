package ex3;

/**Exception levée si la méthode getAnimalZone de la classe Zoo renvoie null
 * @author Corentin Torres
 *
 */
public class NoZoneFoundException extends Exception {

	String msg;

	public NoZoneFoundException() {
		super();
	}

	public NoZoneFoundException(String message) {
		super(message);
	}
}
