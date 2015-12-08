
public class test {
	
	
	
	
	public static void main(String[] args){
		String s1= "blub";
		String s2 = "blub";
		Integer i1 = 42;
		Integer i2 = 42;
		Integer i3 = new Integer(42);
		Integer i4 = new Integer(42);
		String s3 = new String("blub");
		String s4 = new String("blub");
		
		
		System.out.println("Objektgleichheit s1, s2: " + (s1 == s2));
		System.out.println("Wertegleichheit s1,s2: " + (s1.equals(s2)));
		System.out.println();
		System.out.println("Objektgleichheit i1, i2: " + (i1 == i2));
		System.out.println("Wertegleichheit i1, i2: " + (i1.equals(i2)));
		System.out.println();
		System.out.println("Objektgleichheit i3, i4: " + (i3 == i4));
		System.out.println("Wertegleichheit i3, i4: " + (i3.equals(i4)));
		System.out.println();
		System.out.println("Objektgleichheit s3, s4: " + (s3 == s4));
		System.out.println("Wertegleichheit s3, s4: " + (s3.equals(s4)));
		System.out.println();
		System.out.println("Objektgleichheit s1, s4: " + (s1 == s4));
		System.out.println("Wertegleichheit s1, s4: " + (s1.equals(s4)));
		
	}
}
