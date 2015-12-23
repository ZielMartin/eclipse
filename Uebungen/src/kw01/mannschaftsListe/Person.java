package kw01.mannschaftsListe;

import java.util.Comparator;
import java.util.GregorianCalendar;

public class Person<T> implements Comparable<T> {
	private double telefonNummer;
	private String name, spitzName, adresse;
	private GregorianCalendar geburtsDatum;

	public Person(String name, GregorianCalendar geburtsDatum, String spitzName, String adresse, double telefonNummer) {
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

		// Person rhs = (Person) obj;
		// return new EqualsBuilder().
		// // if deriving: appendSuper(super.equals(obj)).
		// append(name, rhs.name).append(age, rhs.age).isEquals();

		return false;

	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (name == null) ? 0 : name.hashCode();
		hash += (telefonNummer == 0) ? 0 : telefonNummer;
		return hash;

	}

	@Override
	public int compareTo(T o) {
		return Comparators.NAME.compare(this, (Person) o);
	}

	public static class Comparators {

		public static Comparator<Person> NAME = new Comparator<Person>() {
			@Override
			public int compare(Person o1, Person o2) {
				return o1.name.compareTo(o2.name);
			}
		};
		public static Comparator<Person> SPITZ = new Comparator<Person>() {
			@Override
			public int compare(Person o1, Person o2) {
				return o1.spitzName.compareTo(o2.spitzName);
			}
		};
		public static Comparator<Person> GEB = new Comparator<Person>() {
			@Override
			public int compare(Person o1, Person o2) {
				return (int) (o1.geburtsDatum.compareTo(o2.geburtsDatum));
			}
		};
	}
}
