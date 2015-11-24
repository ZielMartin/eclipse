package verwaltungMitarbeiteralt;

public class Lehrbeauftragter extends Hilfskraft {

	protected double timeRate;
	
	public Lehrbeauftragter(String surName, String firstName, String street,
			String city, int zip, int day, int month, int year, int hours, double timeRate) {
		super(surName, firstName, street, city, zip, day, month, year, hours);
		this.timeRate = timeRate;
	}

	public boolean haveToPayTaxes() {
		return false;
	}
	
	public double getNetto() {
		return timeRate * hours * Konstanten.FACTOR;
	}
}
