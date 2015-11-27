package kw48.geometry;

public class ListPrimitive {
	private Primitive[] list01 = new Primitive[10];
	int j = 0;
	
	public void getArrayCirc(){							//sortiert das Array nach Umfang
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
	
	public void getArraySurf(){							//sortiert das Array nach Flächeninhalt
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
	
	
	public void addSquare(Point startpoint, double length){
		list01[j] = new Square(startpoint, length);
		while(list01[j] != null && j < 9) j++;
	}
	
	public void addRectangle(Point startpoint, double length, double width){
		list01[j] = new Rectangle(startpoint, length, width);
		while(list01[j] != null && j < 9) j++;
	}
	
	public void addCircle(Point center, double radius){
		list01[j] = new Circle(center, radius);
		while(list01[j] != null && j < 9) j++;
	}
	
	public void addEllipse(Point center, double lengthX, double lengthY){
		list01[j] = new Ellipse(center, lengthX, lengthY);
		while(list01[j] != null && j < 9) j++;
	}
	
	public void delPrim(int index){
		list01[index-1] = null;
		j = index-1;
	}
	public void printList(){
		for (Primitive x : list01) {
			System.out.println(x);
		}
	}

	public static void main(String[] args){
		ListPrimitive myList = new ListPrimitive();
		myList.addCircle(new Point(1, 2.5), 5);
		myList.addEllipse(new Point(5, 1), 1, 2.34);
		myList.addEllipse(new Point(5, 1), 1, 2.34);
		myList.addEllipse(new Point(5, 1), 1, 2.34);
		myList.addEllipse(new Point(5, 1), 1, 2.34);
		myList.addEllipse(new Point(5, 1), 1, 2.34);
		myList.addEllipse(new Point(5, 1), 1, 2.34);
		myList.addEllipse(new Point(5, 1), 1, 2.34);
		myList.addEllipse(new Point(5, 1), 1, 2.34);
		myList.addEllipse(new Point(5, 1), 1, 2.34);
		myList.delPrim(3);
		myList.addRectangle(new Point(2, 3), 4, 4);
		
		myList.getArrayCirc();
		
		myList.printList();
	}
}
