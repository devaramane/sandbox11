import java.util.Scanner;

public class addition {

	int x;
	double y;

	public void addNumbers() {

		double result = x + y;

	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the value of x");
		int num1 = scanner.nextInt();
		System.out.println("Enter the value of y");
		double num2 = scanner.nextDouble();
		double result = num1 + num2;
		System.out.println("The sum of x & y is " + result);
	}
}
