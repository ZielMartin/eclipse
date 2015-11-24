package verwaltungMitarbeiteralt;

public class AngeMitarbeiter extends Angestellte {
	private boolean hasKids;

	
	
	public AngeMitarbeiter(String surName, String firstName, String street,
			String city, int zip, int day, int month, int year, double salary, boolean hasKids) {
		super(surName, firstName, street, city, zip, day, month, year, salary);
		
		if (this.getAge() >= Konstanten.ageThreshold  && !this.hasKids) {
			this.healthInsurance = Konstanten.nursingCareWithoutKids ;
		} else {
			this.healthInsurance = Konstanten.nursingCareWithKids; 
		}
		
	}

	public double getNetto() {
		return salary * getSocialInsuranceFaktor();
	}
	
	public boolean haveToPayTaxes() {
		return getNetto() * 12 > Konstanten.TAXEXEMPTION;
	}
	
}
