package codebeispiele.praktikumOverride;

public class A {
	private final void foo() {
		System.out.println("foo() ist private");
	}
	public void bar() {
		foo();
	}
}
