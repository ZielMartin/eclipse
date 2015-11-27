package codebeispiele;
public class ExplainThrow {

	public void sayHello(String name) throws IllegalArgumentException {
		if (name == null) {
			throw new IllegalArgumentException("Es wurde kein Name übergeben");
		}
		System.out.println("Hello " + name);
	}

	public static void main(String[] args) {
		ExplainThrow ex = new ExplainThrow();
		try {
			ex.sayHello(null);
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		}
	}
}
