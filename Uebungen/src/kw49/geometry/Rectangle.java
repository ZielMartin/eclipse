package kw49.geometry;

public class Rectangle extends Primitive {
	private Point startpoint;
	private double length;
	private double width;
	
	public Rectangle(Point startpoint, double length, double width){		//Konstruktor
		super("Rectangle");
		this.length = length;
		this.width = width;
	}
	
	public double getCircumference(){									//Umfang spezifisch fue Rectangle
		return (2* (width + length));
	}
	
	public double getSurface(){											//Flaecheninhalt spezifisch fuer Rectangle
		return (length*width);
	}
}
