package kw48.geometry;

public class Square extends Primitive {
	private Point startpoint;
	private double length;
	
	public Square(Point startpoint, double length){		//Konstruktor
		super("Rectangle");
		this.length = length;
	}
	
	public double getCircumference(){									//Umfang spezifisch f�r Elipse
		return (4 * length);
	}
	
	public double getSurface(){											//Fl�cheninhalt spezifisch f�r Elipse
		return (length*length);
	}
}
