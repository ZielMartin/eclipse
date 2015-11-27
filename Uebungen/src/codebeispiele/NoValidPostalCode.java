package codebeispiele;
public class NoValidPostalCode extends Exception {
	public NoValidPostalCode() {
		super("Keine gültige Postleitzahl");
	}
}
