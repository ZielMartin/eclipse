package kw01.mannschaftsListe;

import java.util.Comparator;
import java.util.GregorianCalendar;

import kw01.mannschaftsListe.Person.Comparators;

public class Spieler extends Person {
	private int tore;
	
	// Nicht benötigt (?)
//	public Spieler(String name, GregorianCalendar geburtsDatum, String spitzName, String adresse, String telefonNummer, int tore) {
//		super(name, geburtsDatum, spitzName, adresse, telefonNummer);
//		this.tore = tore;
//	}
	
	//Konstruktor
	public Spieler(Person p, Integer tore) {
		super(p);
		this.tore = tore;
	}
	
	@Override
	public String toString() {
		return super.toString() + " Tore: " + tore;
	}
	
	// Zusätzlicher Vergleicher um das Array um die Anzahl der Tore sortieren zu können
	public static class Comparators {

		public static Comparator<Spieler> TORE = new Comparator<Spieler>() {
			@Override
			public int compare(Spieler o1, Spieler o2) {
				return o2.tore - o1.tore;
			}
		};
	}
	
	
}
