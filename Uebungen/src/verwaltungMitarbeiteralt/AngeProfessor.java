package verwaltungMitarbeiteralt;

public class AngeProfessor extends Angestellte {

	private boolean hasKids;

	public AngeProfessor(String surName, String firstName, String street,
			String city, int zip, int day, int month, int year, double salary,
			boolean hasKids) {
		super(surName, firstName, street, city, zip, day, month, year, salary);
		this.hasKids = hasKids;

		if (this.getAge() >= Konstanten.ageThreshold && !this.hasKids) {
			this.healthInsurance = Konstanten.nursingCareWithoutKids;
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
