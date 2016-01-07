package kw02.mannschaftsListe;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;

public class Torsch�tzenListe {

	// Attributdeklaration
	HashMap<Person, Integer> torsch�tzenListe;
	ArrayList<Spieler> spielerListe;

	// Konstruktor
	public Torsch�tzenListe() {
		torsch�tzenListe = new HashMap<>();
		spielerListe = new ArrayList<>();
	}

	// F�ge einen neuen Sch�tzen zu der HashMap torsch�tzenListe hinzu, ben�tigt
	// ein Person-Objekt
	public void addSch�tze(Person p) {
		torsch�tzenListe.put(p, 0);
	}

	// �berladene Methode, setzt auch dierekt die Tore
	// auf die mit�bergebene Zahl
	// kann auch zum setzen von einer neuen Toranzahl benutzt werden.
	public void addSch�tze(Person p, Integer tore) {
		torsch�tzenListe.put(p, tore);
	}

	// Methode um die tore von der ersten Personen die den �bergebenen Namen hat
	// zu
	// setzen. F�r Eindeutigkeit wird addSch�tze empfohlen, es k�nnen ja z.B. 2
	// Personen mit dem Namen Dominick im Team spielen
	public void setTore(String name, Integer tore) {
		for (Entry<Person, Integer> entry : torsch�tzenListe.entrySet()) {
			if (name == entry.getKey().getName()) {
				torsch�tzenListe.put(entry.getKey(), tore);
				return;
			}
		}
	}

	// L�scht den Eintrag aus der HashMap, dessen 'Key' die �bergebene Person
	// ist, diese eindeutige Person kann nur einmal in der HashMap vorhanden
	// sein
	public void delSch�tze(Person p) {
		torsch�tzenListe.remove(p);
	}

	// Erh�ht den 'Value' Tore um 1, von dem eindeutigen 'Key' Person p
	// NullPointerExceptions (�bergebene Perston nicht vorhanden in HashMap
	// als Key) werden gefangen
	public void incTore(Person p) {
		try {
			torsch�tzenListe.put(p, (torsch�tzenListe.get(p) + 1));
		} catch (NullPointerException e) {
			System.err.println("Diese Person ist nicht in der Torsch�tzenliste enthalten");
		}
	}

	// �berladene Methode, die Nach einem Eintrag sucht, in dem der name
	// Attribut des Key's mit dem �bergebenen String �bereinstimmt
	// Hier wird wieder nur der erste Eintrag verwendet
	public void incTore(String name) {
		for (Entry<Person, Integer> entry : torsch�tzenListe.entrySet()) {
			if (name == entry.getKey().getName()) {
				torsch�tzenListe.put(entry.getKey(), entry.getValue() + 1);
				return;
			}
		}
	}

	// Konvertiert die HashMap von <Person, Tore> in eine ArrayList von neuen
	// Objekten, Spielern. Diese erben von Person und haben ein zus�tzliches
	// Attribut "Tore"
	public ArrayList<Spieler> convert() {
		for (Entry<Person, Integer> entry : torsch�tzenListe.entrySet()) {
			spielerListe.add(new Spieler(entry.getKey(), entry.getValue()));
		}
		return spielerListe;
	}
}
