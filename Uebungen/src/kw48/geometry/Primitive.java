package kw48.geometry;

public abstract class Primitive {
	private String type;
	
	public Primitive(String typ){
		this.type = typ;
	}
	
	public double getCircumference(){  	//Umfang berechnen
		return (Double) null;
	}
	
	public double getSurface(){			//Fläche berechnen
		return (Double) null;
	}
	
	@Override
	public String toString(){
		return "Typ: " + type + " Umfang: " + getCircumference() + " Fläche: " + getSurface();		//Bitte nochmal untersuchen
	}
	
	
	public static void main(String[] args){
		Ellipse Hi = new Ellipse(new Point(1, 1), 12, 3.4);
		System.out.println(Hi);
	}
}
