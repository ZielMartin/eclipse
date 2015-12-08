package kw50.geometry;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class ListPrimitives extends ArrayList{

	private ArrayList<Primitive> listP;

	public ListPrimitives() {
		listP = new ArrayList<Primitive>();
	}

	public void add(Primitive p) throws WrongArgumentException {		//Vereinfach der add Methode durch eine ArrayList
			listP.add(p);
	}

	public void add(String line) {
		if (line == null || line == "") {
			throw new IllegalArgumentException("Zeile nicht vorhanden");
		}
		String help[] = line.split(";");
		if (help[0].contains("Rectangle")) {
			final int x = Integer.parseInt(help[3]);
			final int y = Integer.parseInt(help[4]);
			final int length = Integer.parseInt(help[5]);
			final int height = Integer.parseInt(help[6]);
			try {
				this.add(new Rectangle(new Point(x, y), length, height));
			} catch (WrongArgumentException e) {
				e.printStackTrace();
			}

		} else if (help[0].contains("Square")) {
			final int x = Integer.parseInt(help[3]);
			final int y = Integer.parseInt(help[4]);
			final int length = Integer.parseInt(help[5]);
			try {
				this.add(new Square(new Point(x, y), length));
			} catch (WrongArgumentException e) {
				e.printStackTrace();
			}
		} else if (help[0].contains("Ellipse")) {
			final int x = Integer.parseInt(help[3]);
			final int y = Integer.parseInt(help[4]);
			final int longSemiaxis = Integer.parseInt(help[5]);
			final int shortSemiaxis = Integer.parseInt(help[6]);
			try {
				this.add(new Ellipse(new Point(x, y), longSemiaxis,
						shortSemiaxis));
			} catch (WrongArgumentException e) {
				e.printStackTrace();
			}
		} else if (help[0].contains("Circle")) {
			final int x = Integer.parseInt(help[3]);
			final int y = Integer.parseInt(help[4]);
			final int longSemiaxis = Integer.parseInt(help[5]);
			try {
				this.add(new Circle(new Point(x, y), longSemiaxis));
			} catch (WrongArgumentException e) {
				e.printStackTrace();
			}
		}

	}

	public void remove(Primitive p) {
		listP.remove(p);
	}

	public void sortCircumference() {
		listP.sort(new SortCircumference());
	}

	public void sortArea() {
		listP.sort(new SortArea());
	}

	public void print() {
		for (Primitive primitive : listP) {
			System.out.println(primitive.toString());
		}
	}

	public void save(File fileName) {
		FileWriter fw = null;
		BufferedWriter bw = null;
		try {
			fw = new FileWriter(fileName);
			bw = new BufferedWriter(fw);
			for (Primitive p : listP) {
				if (p != null) {
					bw.append(p.toString() + "\n");
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
		} catch (FileNotFoundException e) {
			e.printStackTrace();
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
				// ignore e.printStackTrace();
			}
		}
	}

	public Primitive getByIndex(int index) {
		if (listP.get(index) == null) {
			throw new MyArrayOutOfBoundsException();
		}
		return listP.get(index);
	}
}
