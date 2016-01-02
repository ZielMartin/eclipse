package kw01.mannschaftsListe;

import java.util.Comparator;
import java.util.GregorianCalendar;

public class Person<T> implements Comparable<T> {
	private String name, spitzName, adresse, telefonNummer;
	private GregorianCalendar geburtsDatum;

	public Person(String name, GregorianCalendar geburtsDatum, String spitzName, String adresse, String telefonNummer) {
		super();
		this.name = name;
		this.geburtsDatum = geburtsDatum;
		this.spitzName = spitzName;
		this.adresse = adresse;
		this.telefonNummer = telefonNummer;
	}

	public Person(Person p) {
		super();
		this.name = p.name;
		this.geburtsDatum = p.geburtsDatum;
		this.spitzName = p.spitzName;
		this.adresse = p.adresse;
		this.telefonNummer = p.telefonNummer;
	}

	String getName() {
		return name;
	}

	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Person))
			return false;
		if (obj.hashCode() == this.hashCode())
			return true;
		return false;

	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (name == null) ? 0 : name.hashCode();
		hash += (telefonNummer == null) ? 0 : telefonNummer.hashCode();
		return hash;

	}

	@Override
	public int compareTo(T o) {
		return Comparators.NAME.compare(this, (Person<T>) o);
	}

	public static class Comparators {

		public static Comparator<Person> NAME = (o1, o2) -> o1.name.compareTo(o2.name); // lambda
																						// funktionen,
																						// ähnlich
																						// wie
																						// in
																						// Python
		public static Comparator<Person> SPITZ = (o1, o2) -> o1.spitzName.compareTo(o2.spitzName);
		public static Comparator<Person> GEB = (o1, o2) -> (int) (o1.geburtsDatum.compareTo(o2.geburtsDatum));

		// public static Comparator<Person> NAME = new Comparator<Person>() {
		// @Override
		// public int compare(Person o1, Person o2) {
		// return o1.name.compareTo(o2.name);
		// }
		// };
		// public static Comparator<Person> SPITZ = new Comparator<Person>() {
		// @Override
		// public int compare(Person o1, Person o2) {
		// return o1.spitzName.compareTo(o2.spitzName);
		// }
		// };
		// public static Comparator<Person> GEB = new Comparator<Person>() {
		// @Override
		// public int compare(Person o1, Person o2) {
		// return (int) (o1.geburtsDatum.compareTo(o2.geburtsDatum));
		// }
		// };
	}

	@Override
	public String toString() {
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append("Name: ");
		stringBuilder.append(name);
		stringBuilder.append(" Geburtsdatum: ");
		stringBuilder.append(String.format("%d.%02d.%02d", geburtsDatum.get(geburtsDatum.DAY_OF_MONTH),
				geburtsDatum.get(geburtsDatum.MONTH) + 1, geburtsDatum.get(geburtsDatum.YEAR)));
		stringBuilder.append(" Spitzname: ");
		stringBuilder.append(spitzName);
		stringBuilder.append(" Adresse: ");
		stringBuilder.append(adresse);
		stringBuilder.append(" Telefonnummer: ");
		stringBuilder.append(telefonNummer);
		return stringBuilder.toString();
	}
}
