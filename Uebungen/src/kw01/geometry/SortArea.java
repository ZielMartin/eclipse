package kw01.geometry;

import java.util.Comparator;

public class SortArea implements Comparator<Primitive>{

	@Override
	public int compare(Primitive o1, Primitive o2) {
		return (int) (o1.getArea() - o2.getArea());
	}

}
