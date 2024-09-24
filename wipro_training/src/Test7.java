
public class Test7 implements i2 {

	@Override
	public void sub(int x, int y) {
		System.out.println(x-y);
		
	}

	@Override
	public void sum(int x, int y) {
		// TODO Auto-generated method stub
		System.out.println(x+y);
	}
	public static void main(String[] args) {
		i2 obj = new Test7();
		obj.sum(4, 5);
		obj.sub(2, 3);
	}

}
