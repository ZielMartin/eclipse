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
		return "Typ: " + type + " Umfang: " + getCircumference() + " Flaeche: " + getSurface();		//universelle toString() fuer alle 
	}
	
	
}
