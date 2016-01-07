package kw02.mannschaftsListe;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;

public class TorschützenListe {

	// Attributdeklaration
	HashMap<Person, Integer> torschützenListe;
	ArrayList<Spieler> spielerListe;

	// Konstruktor
	public TorschützenListe() {
		torschützenListe = new HashMap<>();
		spielerListe = new ArrayList<>();
	}

	// Füge einen neuen Schützen zu der HashMap torschützenListe hinzu, benötigt
	// ein Person-Objekt
	public void addSchütze(Person p) {
		torschützenListe.put(p, 0);
	}

	// Überladene Methode, setzt auch dierekt die Tore
	// auf die mitübergebene Zahl
	// kann auch zum setzen von einer neuen Toranzahl benutzt werden.
	public void addSchütze(Person p, Integer tore) {
		torschützenListe.put(p, tore);
	}

	// Methode um die tore von der ersten Personen die den übergebenen Namen hat
	// zu
	// setzen. Für Eindeutigkeit wird addSchütze empfohlen, es können ja z.B. 2
	// Personen mit dem Namen Dominick im Team spielen
	public void setTore(String name, Integer tore) {
		for (Entry<Person, Integer> entry : torschützenListe.entrySet()) {
			if (name == entry.getKey().getName()) {
				torschützenListe.put(entry.getKey(), tore);
				return;
			}
		}
	}

	// Löscht den Eintrag aus der HashMap, dessen 'Key' die übergebene Person
	// ist, diese eindeutige Person kann nur einmal in der HashMap vorhanden
	// sein
	public void delSchütze(Person p) {
		torschützenListe.remove(p);
	}

	// Erhöht den 'Value' Tore um 1, von dem eindeutigen 'Key' Person p
	// NullPointerExceptions (übergebene Perston nicht vorhanden in HashMap
	// als Key) werden gefangen
	public void incTore(Person p) {
		try {
			torschützenListe.put(p, (torschützenListe.get(p) + 1));
		} catch (NullPointerException e) {
			System.err.println("Diese Person ist nicht in der Torschützenliste enthalten");
		}
	}

	// Überladene Methode, die Nach einem Eintrag sucht, in dem der name
	// Attribut des Key's mit dem übergebenen String übereinstimmt
	// Hier wird wieder nur der erste Eintrag verwendet
	public void incTore(String name) {
		for (Entry<Person, Integer> entry : torschützenListe.entrySet()) {
			if (name == entry.getKey().getName()) {
				torschützenListe.put(entry.getKey(), entry.getValue() + 1);
				return;
			}
		}
	}

	// Konvertiert die HashMap von <Person, Tore> in eine ArrayList von neuen
	// Objekten, Spielern. Diese erben von Person und haben ein zusätzliches
	// Attribut "Tore"
	public ArrayList<Spieler> convert() {
		for (Entry<Person, Integer> entry : torschützenListe.entrySet()) {
			spielerListe.add(new Spieler(entry.getKey(), entry.getValue()));
		}
		return spielerListe;
	}
}
