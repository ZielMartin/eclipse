package verwaltungMitarbeiteralt;

public class Angestellte extends Person {

	protected double salary;
	protected double healthInsurance = 7.3;
	protected double nursingCareInsurance;
	
	public Angestellte(String surName, String firstName, String street,
			String city, int zip, int day, int month, int year, double salary) {
		super(surName, firstName, street, city, zip, day, month, year);
		this.salary = salary;
	}

	public double getNetto() {
		return salary;
	}

	public boolean haveToPayTaxes() {
		return getNetto() * 12 > Konstanten.TAXEXEMPTION;
	}

	public String toString() {
		String s= super.toString();
		s += String.format("\t%10b" + "\t"+ "\t%6.2f" , this.haveToPayTaxes(), this.getNetto());
		return s;
	}
	
	protected final double getSocialInsuranceFaktor() {
		return (100 - (healthInsurance + nursingCareInsurance
				+ Konstanten.unemploymentInsurance + Konstanten.retirementInsurance)) / 100;
	}
}