package kw02;


//‰uﬂere Klasse Calculator
public class Calculator {
	// Attrributdeklaration, die Variable operation wird mit dem Typ Operation und dem Zugriffsmodifikator private deklariert
	private Operation operation;
	// Konstruktor der Calculator Klasse, die Variable operation erh‰lt ein neues Objekt vom Typ Operation
	public Calculator(){
		this.operation = new Operation();
	}
	
	public static void main(String[] args) {
		//es wird ein neues Objekt namens calc vom Typ Calculator erstellt
	Calculator calc = new Calculator();
	// durh das Objekt calc werden verschiedene Methodenaufrufe der Unterklasse Operation aufgerufen
	System.out.println(calc.operation.PLUS(4, 7));
	System.out.println(calc.operation.MINUS(4, 7));
	System.out.println(calc.operation.TIMES(4, 7));
	System.out.println(calc.operation.DIVIDE(4, 7));
	
	}
	//Methoden
private static class Operation{
	private int PLUS(int a,int b) {
		return a + b;
	}
	
	private int MINUS(int a , int b){
		return a - b;
	}
	
	private double DIVIDE(int a , int b){
		return (double) a/b;
	}
	
	private int TIMES(int a , int b){
		return a * b;
	}
}
}
