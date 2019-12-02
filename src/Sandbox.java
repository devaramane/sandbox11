
public class Sandbox {

	String c;

	public void checkList() {

		this.c = "Audi";

		System.out.println(c + " is the best car in India");

		Car car = new Car();
		car.autoDoor("Swift");
		car.powerSteering("Honda City");
	}

	public static void main(String[] args) {

		Sandbox sandbox = new Sandbox();
		sandbox.checkList();
	}
}
