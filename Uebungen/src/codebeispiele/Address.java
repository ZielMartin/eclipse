package codebeispiele;
public class Address {
	String zipCode = "";

	public void setZipCode(String code) throws NoValidPostalCode {
		if (code.startsWith("0")) {
			throw new NoValidPostalCode();
		} else {
			this.zipCode = code;
		}
	}

	public static void main(String[] args) {
		Address myAdress = new Address();
		try {
			myAdress.setZipCode("0459");
		}
		catch (NoValidPostalCode e) {
			System.out.println(e.getMessage());
			System.out.println();
			e.printStackTrace();
		}
	}
}
