
public class ConsExample {

	int x;
	double y;

	public ConsExample(int p, double q) {

		this.x = p;
		this.y = q;

		System.out.println(x + y);

	}

	public static void main(String[] args) {

		ConsExample ce = new ConsExample(29, 3.6);

	}
}
