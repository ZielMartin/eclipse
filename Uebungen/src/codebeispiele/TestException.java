package codebeispiele;
public class TestException {

	public static int string2Int(String s) {
		return Integer.parseInt(s);
	}
	public static void main(String[] args) {
			string2Int("abc");
	}

}
