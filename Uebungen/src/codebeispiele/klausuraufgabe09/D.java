package codebeispiele.klausuraufgabe09;

class C {
	String myString = "42";
	
	String getMyString(){
		return myString;
	}
	
	void setMyString(String s){
		myString = s;
	}
}

class D extends C{
	static String myString = "21";
	static String mySecondString = "73";
	
	String getMyString(){
		return myString + mySecondString;
	}
	
	static String getMyString(C c){
		return c.myString;
	}
	
	void setMyString(String s){
		myString = s;
	}
	
	public static void main(String[] args){
		System.out.println("Welche Ausgabe liefert das Programm? (Funktioniert es überhaupt?)");
		
		
		
//		D d = new D();
//		System.out.println(d.myString);
//		System.out.println(d.getMyString((C) d));
//		System.out.println(d.getMyString((D) d));
//		
//		C c = new D();
//		System.out.println(c.getMyString());
//		c.setMyString("12");
//		System.out.println(c.myString);
		
		
		
		
		
		
		
		
		
		
		
//		System.out.println("\nFuuuck ich hab\n42\n42\n21\n21\n21 \nraus :D");
	}
}
