package kw02.mannschaftsListe;

import java.util.Comparator;
import java.util.GregorianCalendar;

public class Spieler extends Person {
	private int tore;
	
	int getTore(){
		return tore;
	}
	
	//Konstruktor
	public Spieler(Person p, Integer tore) {
		super(p);
		this.tore = tore;
	}
	
	@Override
	public String toString() {
		return super.toString() + " Tore: " + tore;
	}	
}
