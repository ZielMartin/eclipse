package kw49.geometry;

public class Ellipse extends Primitive {
	private Point center;
	private double lengthX;
	private double lengthY;
	
	public Ellipse(Point center, double lengthX, double lengthY){		//Konstruktor
		super("Ellipse");
		this.center = center;
		this.lengthX = lengthX;
		this.lengthY = lengthY;
	}
	
	public double getCircumference(){									//Umfang spezifisch fuer Ellipse
		return (Math.PI * (lengthX + lengthY)/2);
	}
	
	public double getSurface(){											//Flaeheninhalt spezifisch fuer Ellipse
		return (Math.PI * lengthX * lengthY);
	}
	
	@Override
	public String toString(){
		return super.toString() + " center: " + center + " lengthX: " + lengthX + " lengthY: " + lengthY;
	}
}
