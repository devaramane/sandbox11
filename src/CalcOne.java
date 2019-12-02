
public class CalcOne {

	int x, y;
	double z;

	public void addNum(int x, int y, double z) {

		double result = x + y + z;

		System.out.println("The sum of these numbers is " + result);

	}

	public void subNum(int x, int y, double z) {

		double result = x - y - z;

		System.out.println("The subtraction of these numbers is " + result);
	}

	public void mulNum(int x, int y, double z) {

		double result = x * y * z;

		System.out.println("The multiplication of these numbers is " + result);

	}

	public static void main(String[] args) {

		CalcOne calcone = new CalcOne();
		calcone.addNum(5, 6, 2.0);
		calcone.subNum(5, 6, 2.0);
		calcone.mulNum(5, 6, 2.0);

	}
}
