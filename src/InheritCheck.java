
public class InheritCheck extends Car {

	public void testM(String c) {

		System.out.println(c + " is the great country to live in");

	}

	public static void main(String[] args) {

		InheritCheck inheritcheck = new InheritCheck();
		inheritcheck.testM("India");
		inheritcheck.autoDoor("Balano");
		inheritcheck.powerSteering("Swift");
	}

}