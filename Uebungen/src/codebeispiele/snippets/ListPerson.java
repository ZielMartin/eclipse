package codebeispiele.snippets;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ListPerson {
	public static final int MAXPERSON = 10;

	private Person[] list;

	public ListPerson() {
		this.list = new Person[ListPerson.MAXPERSON];
	}

	public boolean add(Person p) {
		boolean foundNullinList = false;
		int i = 0;
		while (!foundNullinList && i < ListPerson.MAXPERSON) {
			if (this.list[i] == null) {
				foundNullinList = true;
				list[i] = p;
			}
			i++;
		}
		return foundNullinList;
	}

	public boolean add(String line) {
		
		String helpLine[] = line.split(";");
		String name = helpLine[0];
		String firstName = helpLine[1];
		char sex = helpLine[2].charAt(0);
		System.out.println(helpLine[3]);
		String helpDate[] = helpLine[3].split("\\.");
		int day = Integer.parseInt(helpDate[0]);
		int month = Integer.parseInt(helpDate[1]);
		int year = Integer.parseInt(helpDate[2]);

		return this.add(new Person(firstName, name, sex, day, month, year));

	}

	public boolean removePerson(Person p) {
		boolean foundPinList = false;
		int i = 0;
		while (!foundPinList && i < ListPerson.MAXPERSON) {
			if (list[i] == p) {
				list[i] = null;
			}
			i++;
		}
		return foundPinList;
	}

	public Person getByIndex(int i) {
		return list[i];
	}

	public void save(File file) {
		FileWriter fw = null;
		BufferedWriter bw = null;
		try {
			fw = new FileWriter(file);
			bw = new BufferedWriter(fw);
			for (Person person : list) {
				if (person != null) {
					bw.append(person.toString() + "\n");
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (bw != null) {
					bw.close();
				}
				if (fw != null) {
					fw.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public void load(File fileName) {
		BufferedReader in = null;
		FileReader fr = null;
		try {
			fr = new FileReader(fileName);
			in = new BufferedReader(fr);
			String line = null;
			while ((line = in.readLine()) != null) {
				this.add(line);
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (in != null) {
					in.close();
				}
				if (fr != null) {
					fr.close();
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public void print() {
		for (Person person : list) {
			System.out.println(person);
		}
	}

	public static void main(String[] args) {
		ListPerson listp = new ListPerson();
		listp.add(new Person("Hans", "Wurst", 'm', 23, 10, 1948));
		listp.add(new Person("Marta", "Wurst", 'w', 27, 8, 1924));
		listp.add(new Person("blub", "blub", 'm', 5, 10, 1942));

		listp.print();

		listp.save(new File("blub.txt"));

		ListPerson listq = new ListPerson();
		listq.load(new File("blub.txt"));

		listq.print();

	}
}
