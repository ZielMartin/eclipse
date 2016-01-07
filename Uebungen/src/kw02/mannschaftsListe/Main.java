package kw02.mannschaftsListe;

import java.util.ArrayList;
import java.util.Collections;
import java.util.GregorianCalendar;
import java.util.HashMap;

public class Main {

	public static void main(String[] args) {
		ArrayList<Person> li = new ArrayList<>();
		TorschützenListe li2 = new TorschützenListe();
		ArrayList<Spieler> li3 = null;
		Person Gustav;

		// Monate im GregorianCalendar beginnen mit 0!!

		li.add(new Person("Martin", new GregorianCalendar(1996, 5, 8), "Maddin", "Döhren", "057059589777"));
		li.add(new Person("Sippii", new GregorianCalendar(1991, 0, 1), "Simone", "Minden", "05705666676"));
		li.add(new Person("Michael", new GregorianCalendar(1992, 6, 5), "Michi", "Lippe", "05705696969"));
		li.add(new Person("Dominik", new GregorianCalendar(1991, 3, 1), "Dominique", "Porta", "057057353"));
		Gustav = new Person("Gustav", new GregorianCalendar(2015, 0, 5), "LustigerTyp", "LustigesLand", "012356");
//		li.add(null);
//		li.add(new Person<>(null, null, null, null, null));
		
		System.out.println("Unsortiert:");
		for (Person p : li) {
			System.out.println(p);
		}
		System.out.println("=====================");
		System.out.println("Sortiert nach Name:");
		Collections.sort(li, Person.Comparators.NAME);
		for (Person p : li) {
			System.out.println(p);
		}
		System.out.println("=====================");
		System.out.println("Sortiert nach Geburtsdatum:");
		Collections.sort(li, Person.Comparators.GEB);
		for (Person p : li) {
			System.out.println(p);
		}
		System.out.println("=====================");
		System.out.println("Sortiert nach Spitzname:");
		Collections.sort(li, Person.Comparators.SPITZ);
		for (Person p : li) {
			System.out.println(p);
		}
		System.out.println("=====================");
		
		//Fügt alle Personen aus der ArrayList<Person> zu der HashMap<Person, Tore> hinzu
		for (Person person : li) {
			if (person != null)
				li2.addSchütze(person);
			else
				System.err.println("null objekt entdeckt, nicht hinzugefügt");
		}

		li2.incTore("Martin");
		li2.setTore("Michael", 9001);
		li2.incTore(Gustav);
		
		li2.addSchütze(Gustav);
		li2.incTore(Gustav);
		li2.incTore(Gustav);
		li2.delSchütze(Gustav);

		li3 = li2.convert();

		System.out.println("============");
		System.out.println("SpielerArray soritert nach Name");
		Collections.sort(li3, Person.Comparators.NAME);

		for (Spieler spieler : li3) {
			System.out.println(spieler);
		}

		System.out.println("============");
		System.out.println("SpielerArray soritert nach Anzahl der Tore");
		Collections.sort(li3, Spieler.Comparators.TORE);

		for (Spieler spieler : li3) {
			System.out.println(spieler);
		}

	}
}
