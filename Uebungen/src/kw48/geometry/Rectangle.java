package kw48.geometry;

public class Rectangle extends Primitive {
	private Point startpoint;
	private double length;
	private double width;
	
	public Rectangle(Point startpoint, double length, double width){		//Konstruktor
		super("Rectangle");
		this.length = length;
		this.width = width;
	}
	
	public double getCircumference(){									//Umfang spezifisch f�r Elipse
		return (2* (width + length));
	}
	
	public double getSurface(){											//Fl�cheninhalt spezifisch f�r Elipse
		return (length*width);
	}
}
