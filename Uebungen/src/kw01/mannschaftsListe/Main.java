package kw01.mannschaftsListe;

import java.util.ArrayList;
import java.util.Collections;
import java.util.GregorianCalendar;

public class Main {
	
	
	public static void main(String[] args){
		ArrayList<Person> li = new ArrayList<>();
		
		li.add(new Person<>("Martin", new GregorianCalendar(1996, 06, 8), "Maddin", "Döhren", 9589777));
		li.add(new Person<>("Sippii", new GregorianCalendar(1912, 1, 1), "Simone", "Minden", 666676));
		li.add(new Person<>("Michael", new GregorianCalendar(1992, 7, 2), "Michi", "Lippe", 696969));
		li.add(new Person<>("Dominick", new GregorianCalendar(1991, 4, 1), "Dominique", "Porta", 7353));
		Collections.sort(li, Person.Comparators.GEB);
		for (Person person : li) {
			System.out.println(person.getName());
		}
	}
}
