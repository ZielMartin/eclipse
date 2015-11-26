package kw48.geometry;

public class Ellipse extends Primitive {
	private Point center;
	private double lengthX;
	private double lengthY;
	
	public Ellipse(Point center, double lengthX, double lengthY){		//Konstruktor
		super("Elipse");
		this.center = center;
		this.lengthX = lengthX;
		this.lengthY = lengthY;
	}
	
	public double getCircumference(){									//Umfang spezifisch f�r Elipse
		return (Math.PI * (lengthX + lengthY)/2);
	}
	
	public double getSurface(){											//Fl�cheninhalt spezifisch f�r Elipse
		return (Math.PI * lengthX * lengthY);
	}
}
