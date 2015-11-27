package kw49.geometry;

public class Square extends Primitive {
	private Point startpoint;
	private double length;
	
	public Square(Point startpoint, double length){		//Konstruktor
		super("Rectangle");
		this.length = length;
	}
	
	public double getCircumference(){									//Umfang spezifisch fuer Square
		return (4 * length);
	}
	
	public double getSurface(){											//Flächeninhalt spezifisch fuer Square
		return (length*length);
	}
	
	@Override
	public String toString(){
		return super.toString() + " startpoint: " + startpoint + " length: " + length;
	}
}
