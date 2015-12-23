package kw01.mannschaftsListe;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;

public class Torsch�tzenListe {
	HashMap<Person, Integer> torsch�tzenListe;
	ArrayList<Spieler> spielerListe;

	public Torsch�tzenListe() {
		torsch�tzenListe = new HashMap<>();
		spielerListe = new ArrayList<>();
	}

	public void addSch�tze(Person p) {
		torsch�tzenListe.put(p, 0);
	}

	public void addSch�tze(Person p, Integer tore) { // kann auch zum setzen von
														// einer neuen Toranzahl
														// benutzt werden.
		torsch�tzenListe.put(p, tore);
	}

	public void delSch�tze(Person p) {
		torsch�tzenListe.remove(p);
	}

	public void incTore(Person p) {
		torsch�tzenListe.put(p, (torsch�tzenListe.get(p) + 1));
	}

	public ArrayList<Spieler> convert() {
		for (Entry<Person, Integer> entry : torsch�tzenListe.entrySet()) {
			spielerListe.add(new Spieler(entry.getKey(), entry.getValue()));
		}
		return spielerListe;
	}
}
