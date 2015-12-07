package kw49.geometry;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;

public class ListPrimitive {
	private Primitive[] list01 = new Primitive[10];
	private int j = 0;

	public void getArrayCirc() { // sortiert das Array nach Umfang
		int size = list01.length;
		double a = 0;
		double b = 0;
		Primitive swap = null;
		boolean swapped = false;
		do {
			swapped = false;
			for (int i = 0; i < size - 1; ++i) {
				if (list01[i] != null) {
					a = list01[i].getCircumference();
				} else
					a = 0.0;
				if (list01[i + 1] != null) {
					b = list01[i + 1].getCircumference();
				} else
					b = 0.0;
				if (a > b) {
					swap = list01[i];
					list01[i] = list01[i + 1];
					list01[i + 1] = swap;
					swapped = true;
				}
			}
			size--;
		} while (swapped);
	}

	public void getArraySurf() { // sortiert das Array nach Flaecheninhalt
		int size = list01.length;
		double a = 0;
		double b = 0;
		Primitive swap = null;
		boolean swapped = false;
		do {
			swapped = false;
			for (int i = 0; i < size - 1; ++i) {
				if (list01[i] != null) {
					a = list01[i].getSurface();
				} else
					a = 0.0;
				if (list01[i + 1] != null) {
					b = list01[i + 1].getSurface();
				} else
					b = 0.0;
				if (a > b) {
					swap = list01[i];
					list01[i] = list01[i + 1];
					list01[i + 1] = swap;
					swapped = true;
				}
			}
			size--;
		} while (swapped);

	}

	public void printFile(String file) throws IOException {
		String[] input = new String[10];
		int i = 0;
		String content = "";
		FileReader f;
		BufferedReader br;

		try {
			f = new FileReader(file);
			try {
				br = new BufferedReader(f);
				do {
					content = br.readLine();
					input[i] = content;
					i++;
				} while (content != null);
				br.close();
			} catch (Exception e) {
			} finally {
				f.close();
			}
		} catch (FileNotFoundException e) {
			System.out.println("Datei nicht vorhanden");
		} catch (NullPointerException e) {
			e.printStackTrace();
		}

		for (String zeile : input) {
			String[] elements = new String[3];
			if (zeile != null) {
				elements = zeile.split(";");
				try {
					System.out.println("Typ: " + elements[0] + " Umfang: " + Double.parseDouble(elements[1])
							+ " Oberfläche: " + Double.parseDouble(elements[2]));
				} catch (IndexOutOfBoundsException e) {
					System.out.println("Datei fehlerhaft");
				} catch (NumberFormatException e) {
					System.out.println("Die Textdatei beinhaltet keine Zahlen in den dafür vorgesehenen Feldern.");
				}
			}
		}
	}

	public void savePrimitives() {
		boolean k = false;
		FileWriter fw;
		BufferedWriter bw;
		for (Primitive a : list01) {
			if (a != null) {
				try {
					fw = new FileWriter("Primitives.txt", k);
					try {
						bw = new BufferedWriter(fw);
						bw.append(a.getType() + ";" + a.getCircumference() + ";" + a.getSurface());
						bw.newLine();
						bw.close();
					} finally {
						fw.close();
					}

				} catch (IOException | NullPointerException e) {
					e.printStackTrace();
				}
			}
			k = true;
		}
	}

	// Hinzufuegen von Primitive Objekten mit ihren Konstruktoren

	public void addSquare(Point startpoint, double length) {
		list01[j] = new Square(startpoint, length);
		while (list01[j] != null && j < 9)
			j++;
	}

	public void addRectangle(Point startpoint, double length, double width) {
		list01[j] = new Rectangle(startpoint, length, width);
		while (list01[j] != null && j < 9)
			j++;
	}

	public void addCircle(Point center, double radius) {
		list01[j] = new Circle(center, radius);
		while (list01[j] != null && j < 9)
			j++;
	}

	public void addEllipse(Point center, double lengthX, double lengthY) {
		list01[j] = new Ellipse(center, lengthX, lengthY);
		while (list01[j] != null && j < 9)
			j++;
	}

	public void addObject(Object a) throws WrongArgumentException {
		if (a != null) {
			list01[j] = (Primitive) a;
		}else{
			throw new WrongArgumentException();
		}

		while (list01[j] != null && j < 9)
			j++;
	}

	public void delPrim(int index) {
		list01[index - 1] = null;
		j = index - 1;
	}

	public void printList() {
		for (Primitive x : list01) {
			System.out.println(x);
		}
	}
	
	public Primitive getByIndex(int index){
		if(list01[index-1] != null){
			return list01[index-1];
		}else{
			try{
				throw new MyArrayOutOfBoundsException();
			}catch(MyArrayOutOfBoundsException e){
				System.out.println("Objekt ist 'null'");
			}
		}
		return null;
	}

	public static void main(String[] args) {
		ListPrimitive myList = new ListPrimitive();
		myList.addCircle(new Point(1, 2.5), 5);
		myList.addEllipse(new Point(5, 1), 1, 2.34);
		myList.addEllipse(new Point(5, 1), 1, 2.34);
		myList.addEllipse(new Point(5, 1), 1, 2.34);
		myList.addEllipse(new Point(5, 1), 1, 2.34);
		myList.addEllipse(new Point(5, 1), 1, 2.34);
		myList.addEllipse(new Point(5, 1), 1, 2.34);
		myList.addEllipse(new Point(5, 1), 1, 2.34);
		myList.addEllipse(new Point(5, 1), 1, 2.34);
		myList.addEllipse(new Point(5, 1), 1, 2.34);
		myList.delPrim(3);
		try {
			myList.addObject(null);
		} catch (WrongArgumentException e) {
			e.printStackTrace();
		}

		 myList.savePrimitives();
		 myList.getArrayCirc();
		 try {
		 myList.printFile("primitives.txt");
		 } catch (IOException e) {
		 e.printStackTrace();
		 }
		myList.printList();
		
		//ListEdgyObjects Simone = new ListEdgyObjects();
		//Simone.addCircle(new Point(5, 2), 2.2);
		//ListRoundObjects Michaela = new ListRoundObjects();
		//Michaela.addSquare(new Point(10, 10), 200);
		//System.out.println(myList.getByIndex(2));
	}
}
