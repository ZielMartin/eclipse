package kw01.geometry;

public abstract class Primitive implements Comparable<Primitive> {

	public abstract double getCircumference();

	public abstract double getArea();

	public String toString() {
		return "Typ: " + getClass() + ";" + "area: " + String.format("%4.2f", getArea()) + ";" + "circumference: "
				+ String.format("%4.2f", getCircumference());
	}

	@Override
	public int compareTo(Primitive o) {
		// TODO Auto-generated method stub
		return 0;
	}
}