
public class MethodOverloadingDemo {
	
	
	public void sum(int x, int y)
	{
		System.out.println("integer sum is: " + (x+y));
	}

	public void sum(double x, double y) {
		System.out.println("double sum is: " + (x+y));
	}
	
	
	public static void main(String[] args) {
		
		
		MethodOverloadingDemo md;
		md = new MethodOverloadingDemo();
		
		md.sum(4, 3);
		md.sum(5.6,4.5);
		
	}
}
