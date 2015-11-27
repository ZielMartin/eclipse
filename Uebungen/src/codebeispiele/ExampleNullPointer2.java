package codebeispiele;
public class ExampleNullPointer2 {

	public static int factorial(Integer n) {
		int retVal=1;
		for(int i=1; i<=n; i++){
			retVal *=i;
		}
		return retVal;
	}
	
	public static void main(String[] args) {
		Integer n = null;
		factorial(n);

	}

}
