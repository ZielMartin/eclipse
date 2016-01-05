package kw49.geometry;

public class ListEdgyObjects extends ListPrimitive {
	Primitive[] list01 = new Primitive[10]; // array der größe 10
	private int j = 0;
	
	public ListEdgyObjects() { // konstruktor
	}
	@Override
	public void addSquare(Point startpoint, double length) { //methode zum hinzufügen
		list01[j] = new Square(startpoint, length);
		while (list01[j] != null && j < 9)
			j++;
	}

	@Override // hinzufügen
	public void addRectangle(Point startpoint, double length, double width) {
		list01[j] = new Rectangle(startpoint, length, width);
		while (list01[j] != null && j < 9)
			j++;
	}

	@Override // ausgabe durch error um hinzufügen zu verhindern
	public void addCircle(Point center, double radius) {
		try {
			throw new ObjectNotEdgy();
		} catch (ObjectNotEdgy e) {
			e.printStackTrace();
		}
	}

	@Override
	public void addEllipse(Point center, double lengthX, double lengthY) { // ausgabe error um hinzufügen zu verhindern
		try {
			throw new ObjectNotEdgy();
		} catch (ObjectNotEdgy e) {
			e.printStackTrace();
		}
	}
}
