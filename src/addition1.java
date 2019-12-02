
public class addition1 {

	int x, y;

	public void addNum() {

		this.x = 50;
		this.y = 25;

		int result = x + y;
		System.out.println(result);
	}

	public static void main(String[] args) {
		addition1 ref = new addition1();
		ref.addNum();

	}
}
