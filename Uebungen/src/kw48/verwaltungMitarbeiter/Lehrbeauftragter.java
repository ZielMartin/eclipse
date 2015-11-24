package kw48.verwaltungMitarbeiter;

public class Lehrbeauftragter extends Hilfskraft {

	protected double FACTOR = 4.28;
	protected double timeRate;
	
	public Lehrbeauftragter(String surName, String firstName, String street,
			String city, int zip, int day, int month, int year, int hours, double timeRate) {
		super(surName, firstName, street, city, zip, day, month, year, hours);
		this.timeRate = timeRate;
	}

	@Override
	public boolean haveToPayTaxes() {
		return false;
	}
	
	@Override
	public double getNetto() {
		return timeRate * hours * FACTOR;
	}
}
 