package kw49.geometry;

public class ListEdgyObjects extends ListPrimitive {
	Primitive[] list01 = new Primitive[10];
	private int j = 0;
	
	public ListEdgyObjects() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public void addSquare(Point startpoint, double length) {
		list01[j] = new Square(startpoint, length);
		while (list01[j] != null && j < 9)
			j++;
	}

	@Override
	public void addRectangle(Point startpoint, double length, double width) {
		list01[j] = new Rectangle(startpoint, length, width);
		while (list01[j] != null && j < 9)
			j++;
	}

	@Override
	public void addCircle(Point center, double radius) {
		try {
			throw new ObjectNotEdgy();
		} catch (ObjectNotEdgy e) {
			e.printStackTrace();
		}
	}

	@Override
	public void addEllipse(Point center, double lengthX, double lengthY) {
		try {
			throw new ObjectNotEdgy();
		} catch (ObjectNotEdgy e) {
			e.printStackTrace();
		}
	}
}
