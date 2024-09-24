
public class Test2 {
	
	public static void main(String[] args) {
		
		byte b = 100;
		
		int  x = b;
		
		long l = x;
		
		//byte<short<int<long<float<double
		
		System.out.println(l);
		
		short s = (short)l;
		
		System.out.println(s);
		
		float f = 4.5f;
		int i = (int)f;
		System.out.println(i);
		
		
		
	}

}
