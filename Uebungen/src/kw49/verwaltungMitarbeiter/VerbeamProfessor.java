package kw49.verwaltungMitarbeiter;

public class VerbeamProfessor extends Beamte implements Professoren{

	public VerbeamProfessor(String surName, String firstName, String street,
			String city, int zip, int day, int month, int year, double salary) {
		super(surName, firstName, street, city, zip, day, month, year, salary);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String[] teaches() {
		// TODO Auto-generated method stub
		return null;
	}

}
