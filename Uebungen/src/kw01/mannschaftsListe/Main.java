package kw01.mannschaftsListe;

import java.util.ArrayList;
import java.util.Collections;
import java.util.GregorianCalendar;
import java.util.HashMap;

public class Main {

	public static void main(String[] args) {
		ArrayList<Person> li = new ArrayList<>();
		TorschützenListe li2 = new TorschützenListe();
		ArrayList<Spieler> li3 = null;
		
//		Personen hinzufügen zur liste
		
		li.add(new Person<>("Martin", new GregorianCalendar(1996, 06, 8), "Maddin", "Döhren", 9589777));
		li.add(new Person<>("Dieter", new GregorianCalendar(1912, 1, 1), "Dets", "Minden", 666676));
		li.add(new Person<>("Frank", new GregorianCalendar(1992, 7, 2), "Fran", "Lippe", 696969));
		li.add(new Person<>("Dominik", new GregorianCalendar(1991, 4, 1), "Dominique", "Porta", 7353));
//		li.add(new Person<>(null, null, null, null, 0));
		 Collections.sort(li, Person.Comparators.GEB);
		for (Person person : li) {
			li2.torschützenListe.put(person, 0);
		}

//		TORE hinzufügen zur liste 2
		li2.incTore(li.get(3));
		li2.incTore(li.get(3));
		li2.incTore(li.get(3));

		li2.addSchütze(li.get(2), 456456);
		

		li2.addSchütze(li.get(1), 12);

		li3 = li2.convert();

		Collections.sort(li3, Person.Comparators.NAME);

		for (Spieler spieler : li3) {
			System.out.println(spieler);
		}
		
		Collections.sort(li3, Spieler.Comparators.TORE);

		for (Spieler spieler : li3) {
			System.out.println(spieler);
		}

	}
}
