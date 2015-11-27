package kw48.geometry;
//test
public class Circle extends Primitive {
	private Point center;
	private double radius;
	
	public Circle(Point center, double radius){							//Konstruktor
		super("Circle");
		this.center = center;
		this.radius = radius;
	}
	
	public double getCircumference(){									//Umfang spezifisch fuer Elipse
		return (Math.PI * radius * 2);
	}
	
	public double getSurface(){											//Flaecheninhalt spezifisch fuer Elipse
		return (Math.PI * radius * radius);
	}
	//das ist ein lustiker commentaar
}
