package kw02.geometry;

import java.util.ArrayList;
import java.util.Comparator;
public abstract class Primitive implements Comparable<Primitive> {

	public abstract double getCircumference();

	public abstract double getArea();

	public String toString() {
		return "Typ: " + getClass() + ";" + "area: " + String.format("%4.2f", getArea()) + ";" + "circumference: "
				+ String.format("%4.2f", getCircumference());
	}

	@Override
	public int compareTo(Primitive that) {
		int a1 = new Comparator<Primitive>() {
			@Override
			public int compare(Primitive o1, Primitive o2) {
				return (int) (o1.getArea() - o2.getArea());
			}
		}.compare(this, that);
		int b1 = new Comparator<Primitive>() {
			@Override
			public int compare(Primitive o1, Primitive o2) {
				return (int) (o1.getCircumference() - o2.getCircumference());
			}
		}.compare(this, that);
		if(a1 != 0) return a1;
		else return b1;
	}
}