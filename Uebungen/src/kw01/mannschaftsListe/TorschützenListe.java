package kw01.mannschaftsListe;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;

public class TorschützenListe {
	HashMap<Person, Integer> torschützenListe;
	ArrayList<Spieler> spielerListe;

	public TorschützenListe() {
		torschützenListe = new HashMap<>();
		spielerListe = new ArrayList<>();
	}

	public void addSchütze(Person p) {
		torschützenListe.put(p, 0);
	}

	public void addSchütze(Person p, Integer tore) { // kann auch zum setzen von
														// einer neuen Toranzahl
														// benutzt werden.
		torschützenListe.put(p, tore);
	}

	public void delSchütze(Person p) {
		torschützenListe.remove(p);
	}

	public void incTore(Person p) {
		torschützenListe.put(p, (torschützenListe.get(p) + 1));
	}

	public ArrayList<Spieler> convert() {
		for (Entry<Person, Integer> entry : torschützenListe.entrySet()) {
			spielerListe.add(new Spieler(entry.getKey(), entry.getValue()));
		}
		return spielerListe;
	}
}
