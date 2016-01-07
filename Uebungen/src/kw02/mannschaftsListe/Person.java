package kw02.mannschaftsListe;

import java.util.Comparator;
import java.util.GregorianCalendar;

public class Person implements Comparable<Person> {
	// Attributdeklarationen
	private String name, spitzName, adresse, telefonNummer;
	private GregorianCalendar geburtsDatum;

	// Konstruktoren
	public Person(String name, GregorianCalendar geburtsDatum, String spitzName, String adresse, String telefonNummer) {
		this.name = name;
		this.geburtsDatum = geburtsDatum;
		this.spitzName = spitzName;
		this.adresse = adresse;
		this.telefonNummer = telefonNummer;
	}

	// Zus�tzlicher Konstruktor, erstellt ein neues Person-Objekt, aus dem
	// �bergebenen
	public Person(Person p) {
		this.name = p.name;
		this.geburtsDatum = p.geburtsDatum;
		this.spitzName = p.spitzName;
		this.adresse = p.adresse;
		this.telefonNummer = p.telefonNummer;
	}

	// Getter
	String getName() {
		return name;
	}

	String getSpitzName() {
		return spitzName;
	}

	GregorianCalendar getGeburtsDatum() {
		return geburtsDatum;
	}
	

	// Liefert ein true zur�ck, wenn das �bergebene Objekt ein Person-Objekt ist
	// UND das �bergebene und die Person, dessen Methode aufgerufen wird den
	// selben Wert bei aufruf von hashCode zur�ckliefern
	

	public boolean equals(Object obj) {
		if (!(obj instanceof Person))
			return false;
		if (obj.hashCode() == this.hashCode())
			return true;
		return false;

	}
	
	// hashCode liefert einen Wert, der aus dem String.hashCode von dem Namen und der Telefonnummer berechnet wird
	@Override
	public int hashCode() {
		int hash = 0;
		hash += (name == null) ? 0 : name.hashCode();
		hash += (telefonNummer == null) ? 0 : telefonNummer.hashCode();
		return hash;

	}

	// Methode muss vorhanden sein, da Comparable<T> implementiert wird
	// sortiert, nach dem Ergebnis, welches bei dem �bergebenen Comparator ausgerechnet wird
	@Override
	public int compareTo(Person that) {
		return this.name.compareTo(that.name);
	}

	@Override
	public String toString() {
		String gebFormat;
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append("Name: ");
		stringBuilder.append(name);
		stringBuilder.append(" Geburtsdatum: ");
		try {
			gebFormat = String.format("%d.%02d.%02d", geburtsDatum.get(geburtsDatum.DAY_OF_MONTH),
					geburtsDatum.get(geburtsDatum.MONTH) + 1, geburtsDatum.get(geburtsDatum.YEAR));
		} catch (NullPointerException e) {
//			System.err.println("Kein (g�ltiger) Geburtstag?");
			gebFormat = null;
		}
		stringBuilder.append(gebFormat);
		stringBuilder.append(" Spitzname: ");
		stringBuilder.append(spitzName);
		stringBuilder.append(" Adresse: ");
		stringBuilder.append(adresse);
		stringBuilder.append(" Telefonnummer: ");
		stringBuilder.append(telefonNummer);
		return stringBuilder.toString();
	}
}
