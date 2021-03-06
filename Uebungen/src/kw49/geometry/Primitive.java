package kw49.geometry;

public abstract class Primitive {
	private String type;
	
	public Primitive(String typ){
		this.type = typ;
	}
	
	public String getType(){
		return type;					// gibt den Typ zurueck
	}
	
	public double getCircumference(){  	//Umfang berechnen
		return (Double) null;
	}
	
	public double getSurface(){			//Flaeche berechnen
		return (Double) null;
	}
	
	@Override
	public String toString(){
		return "Typ: " + type + " Umfang: " + getCircumference() + " Flaeche: " + getSurface();		//universelle toString() fuer alle 
	}
	
	
}
