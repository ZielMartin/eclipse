package kw49.verwaltungMitarbeiter;

public class SpecMitarbeiter extends Angestellte implements IMitarbeiter, ILehrende, IStudierende{

	public SpecMitarbeiter(String surName, String firstName, String street, String city, int zip, int day, int month,
			int year, double salary, boolean hasKids) {
		super(surName, firstName, street, city, zip, day, month, year, salary, hasKids);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String[] teaches() {
		// TODO Auto-generated method stub
		return null;
	}

}
