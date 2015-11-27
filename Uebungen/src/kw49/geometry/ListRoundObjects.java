package kw49.geometry;

public class ListRoundObjects extends ListPrimitive {
	Primitive[] list01 = new Primitive[10];
	private int j = 0;
	
	public ListRoundObjects() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void addCircle(Point center, double radius) {
		list01[j] = new Circle(center, radius);
		while (list01[j] != null && j < 9)
			j++;
	}
	@Override
	public void addEllipse(Point center, double lengthX, double lengthY) {
		list01[j] = new Ellipse(center, lengthX, lengthY);
		while (list01[j] != null && j < 9)
			j++;
	}
	
	@Override
	public void addSquare(Point startpoint, double length) {
		try {
			throw new ObjectNotRound();
		} catch (ObjectNotRound e) {
			e.printStackTrace();
		}
	}

	@Override
	public void addRectangle(Point startpoint, double length, double width) {
		try {
			throw new ObjectNotRound();
		} catch (ObjectNotRound e) {
			e.printStackTrace();
		}
	}
}
