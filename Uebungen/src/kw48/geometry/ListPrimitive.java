package kw48.geometry;

public class ListPrimitive {
	private Primitive[] list01;
	
	public Primitive[] getArraySurface(){
		
		return null;
	}
	
	
	
	
	private static void sort(final Primitive[] list) {
		int size = list.length;
		Primitive swap = null;
		boolean swapped = false;
		do {
			swapped = false;
			for (int i = 0; i < size - 1; ++i) {
				if (list[i] > list[i + 1]) {
					swap = list[i];
					list[i] = array[i + 1];
					array[i + 1] = swap;
					swapped = true;
				}
			}
			size--;
		} while (swapped);
	}
}
