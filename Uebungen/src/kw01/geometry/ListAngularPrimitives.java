package kw01.geometry;

public class ListAngularPrimitives extends ListPrimitives {

	public void add(Primitive p) throws RoundArgumentException,WrongArgumentException {
		if (p instanceof IRound) {
			throw new RoundArgumentException();
		}
		super.add(p);
	}
}
