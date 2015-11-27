package codebeispiele;
public class ExampleNullPointer1 {
	public static String firstLetter(String s) {
		return s.substring(0,1);
	}
	public static void main(String[] args) {
		System.out.println(firstLetter(null));
	}
}
