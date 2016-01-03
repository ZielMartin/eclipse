package kw01.geometry;

public abstract class Primitive<T> implements Comparable<T>{
	
	public abstract double getCircumference();
	public abstract double getArea();
	
	public String toString() {
		return"Typ: "+getClass()+";"+"area: "+String.format("%4.2f", getArea())+";"+"circumference: "+String.format("%4.2f",getCircumference());
	}
}