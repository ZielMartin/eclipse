package codebeispiele.praktikumOverride;

public class B extends A {

	protected void foo() {
		System.out.println("ueberschrieben");
	}
	
	
	public static void main(String[] args) {
		A a= new A();
		a.bar();
		B b= new B();
		b.bar();
	}
}
