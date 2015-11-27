package codebeispiele.snippets;

import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;

public class Person {
	
	private String name, firstName;
	private char sex;
	private GregorianCalendar birthday;
	
	public Person(String firstName, String name, char sex, int day, int month,int year) {
		this.name=name;
		this.firstName=firstName;
		this.sex=sex;
		this.birthday = new GregorianCalendar(year, month-1, day);
	}
	
	
	public String getBirthdayAsString() {
		SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");
		return 	sdf.format(birthday.getTime());
	}
	public String toString() {
		return ""+name+";"+firstName+";"+sex+";"+getBirthdayAsString();
	}
}
