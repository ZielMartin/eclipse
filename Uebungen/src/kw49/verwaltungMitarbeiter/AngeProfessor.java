package kw49.verwaltungMitarbeiter;

public class AngeProfessor extends Angestellte implements IProfessoren{	//spezielle Angestellte siehe Punkt 5

	public AngeProfessor(String surName, String firstName, String street,
			String city, int zip, int day, int month, int year, double salary, boolean hasKids) {
		super(surName, firstName, street, city, zip, day, month, year, salary, hasKids);
	}

	@Override
	public String[] teaches() {
		// TODO Auto-generated method stub
		return null;
	}

}
