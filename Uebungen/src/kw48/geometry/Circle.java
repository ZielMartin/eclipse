package kw48.geometry;

public class Circle extends Primitive {
	private Point center;
	private double radius;
	
	public Circle(Point center, double radius){							//Konstruktor
		super("Circle");
		this.center = center;
		this.radius = radius;
	}
	
	public double getCircumference(){									//Umfang spezifisch für Elipse
		return (Math.PI * radius * 2);
	}
	
	public double getSurface(){											//Flächeninhalt spezifisch für Elipse
		return (Math.PI * radius * radius);
	}
}
