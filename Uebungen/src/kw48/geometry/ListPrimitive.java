package kw48.geometry;

public class ListPrimitive {
	private Primitive[] list01;
	
	public void getArrayCirc(){
		int size = list01.length;
		Primitive swap = null;
		boolean swapped = false;
		do {
			swapped = false;
			for (int i = 0; i < size - 1; ++i) {
				if (list01[i].getCircumference() > list01[i + 1].getCircumference()) {
					swap = list01[i];
					list01[i] = list01[i + 1];
					list01[i + 1] = swap;
					swapped = true;
				}
			}
			size--;
		} while (swapped);
	}
	
	public void gerArraySurf(){
		int size = list01.length;
		Primitive swap = null;
		boolean swapped = false;
		do {
			swapped = false;
			for (int i = 0; i < size - 1; ++i) {
				if (list01[i].getSurface() > list01[i + 1].getSurface()) {
					swap = list01[i];
					list01[i] = list01[i + 1];
					list01[i + 1] = swap;
					swapped = true;
				}
			}
			size--;
		} while (swapped);

	}
}
