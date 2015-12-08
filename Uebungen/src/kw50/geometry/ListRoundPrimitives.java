package kw50.geometry;

public class ListRoundPrimitives extends ListPrimitives {
	
	@Override
	public void add(Primitive p) throws AngularArgumentException, WrongArgumentException  {
		if (p instanceof IAngular) {
			throw new AngularArgumentException();
		}
		super.add(p);
	}
	
}
