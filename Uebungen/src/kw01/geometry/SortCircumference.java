package kw01.geometry;

import java.util.Comparator;

public class SortCircumference implements Comparator<Primitive> {

	@Override
	public int compare(Primitive o1, Primitive o2) {
		return (int) (o1.getCircumference() - o2.getCircumference());
	}

}
