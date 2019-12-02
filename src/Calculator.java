
public class Calculator {

	int a, b;
	double c;

	public Calculator(int a, int b, double c) {

		this.a = a;
		this.b = b;
		this.c = c;

		System.out.println("The sum of these three numbers is " + (a + b + c));
	}

	public static void main(String[] args) {

		Calculator calculator = new Calculator(5, 85, 10.0);
		Calculator calculator1 = new Calculator(5, 20, 3);
	}
}
