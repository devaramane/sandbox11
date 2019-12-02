import java.util.Scanner;

public class Multiply {

	int a;
	double b;

	public void mulNum(int a, double b) {

		double result = a * b;
		System.out.println("India stands at " + result + " position");

	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Please enter the vaue of a:");
		int a = scanner.nextInt();
		System.out.println("Please enter the value of b:");
		double b = scanner.nextDouble();

		double result = a * b;

		System.out.println("The product of these two numbers is " + result);

		Multiply mul = new Multiply();

		mul.mulNum(a, b);

	}
}
