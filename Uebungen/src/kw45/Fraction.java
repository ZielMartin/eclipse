package kw45;

public class Fraction {
	private int zaehler, nenner;

	public Fraction(int zaehler, int nenner) {
		this.zaehler = zaehler;
		this.nenner = nenner;
	}

	public Fraction() {
		this.zaehler = 1;
		this.nenner = 1;
	}

	
	public String toString() {
		return "Fraction [zaehler=" + zaehler + ", nenner=" + nenner + "]";
	}

	public Fraction addieren(Fraction a, Fraction b) {
		Fraction c = new Fraction();
		if (a.nenner == b.nenner) {
			c.zaehler = (a.zaehler + b.zaehler);
			c.nenner = a.nenner;
		} else {
			c.zaehler = a.zaehler * b.nenner + b.zaehler * a.nenner;
			c.nenner = a.nenner * b.nenner;
		}
		redBruch(c);
		return c;
	}

	public Fraction multiplizieren(Fraction a, Fraction b) {
		Fraction c = new Fraction();
		c.zaehler = a.zaehler * b.zaehler;
		c.nenner = a.nenner * b.nenner;
		return c;
	}

	public float fliess(Fraction a) {
		float i;
		i = (float) a.zaehler / (float) a.nenner;
		return i;
	}

	public void kehrwert(Fraction a) {
		int x;
		x = a.zaehler;
		a.zaehler = a.nenner;
		a.nenner = x;
	}

	public void redBruch(Fraction a) {
		int x = a.zaehler;
		int y = a.nenner;
		while (y != 0) {
			if (x > y)
				x = x - y;
			else
				y = y - x;
		}
		a.zaehler = a.zaehler / x;
		a.nenner = a.nenner / x;
	}
}
