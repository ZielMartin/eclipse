package kw48.verwaltungMitarbeiter;

public class Hilfskraft extends Person implements Lehrende {


	protected int hours;
	
	public Hilfskraft(String surName, String firstName, String street,
			String city, int zip, int day, int month, int year, int hours) {
		super(surName, firstName, street, city, zip, day, month, year);
		this.hours = hours;
	}
	
	@Override
	public boolean haveToPayTaxes() {
		return false;
	}

	@Override
	public double getNetto() {
		return TIMERATE * hours * FACTOR;
	}
	
	@Override
	public String toString() {
		String s= super.toString();
		s += String.format("\t%10b" + "\t"+ "\t%6.2f" , this.haveToPayTaxes(), this.getNetto());
		return s;
	}

	@Override
	public String[] teaches(){
		String[] a = new String[10];
		return a;
	}

}