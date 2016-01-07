package kw02.geometry;

import java.util.ArrayList;
public abstract class Primitive implements Comparable<Primitive> {

	public abstract double getCircumference();

	public abstract double getArea();

	public String toString() {
		return "Typ: " + getClass() + ";" + "area: " + String.format("%4.2f", getArea()) + ";" + "circumference: "
				+ String.format("%4.2f", getCircumference());
	}

	@Override
	public int compareTo(Primitive o) {
		SortArea a = new SortArea();
		SortCircumference b = new SortCircumference();
		int a1 = a.compare(this, o);
		int b1 = b.compare(this, o);
		if(a1 != 0) return a1;
		else return b1;
	}
}