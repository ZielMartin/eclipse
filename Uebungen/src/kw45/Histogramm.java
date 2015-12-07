package kw45;

public class Histogramm {
//Ficken
	public static void main(String[] args) {
//		int[] a = { 1, 3, 4, 5, 8, 13, 0, 7, 2, 4, 18 };
//		System.out.println(maxOfArray(a));
//		printHisto(a);
//		Fraction bruch = new Fraction(12, 18);
//		Fraction bruch2 = new Fraction (17,19);
//		System.out.println(bruch.fliess(bruch));
//		bruch.redBruch(bruch);
//		bruch.kehrwert(bruch);
//		System.out.println(bruch);
//		System.out.println(bruch.addieren(bruch, bruch2));
//		System.out.println(bruch.multiplizieren(bruch, bruch2));
		Fraction Bezier = new Fraction(352, 64);
		Bezier.redBruch(Bezier);
		System.out.println(Bezier);
	}

	public static int maxOfArray(int[] a) {
		int b = 0;

		for (int c : a) {
			if (b < c)
				b = c;
		}

		return b;
	}

	public static void printHisto(int[] a) {
		for (int i = 0; i < maxOfArray(a); i++) {
			System.out.print((maxOfArray(a)-i) + ":	");
			for (int x : a) {
				if (x > (maxOfArray(a)-i-1))
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}
}
