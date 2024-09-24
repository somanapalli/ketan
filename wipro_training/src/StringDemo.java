
public class StringDemo {

	public static void main(String[] args) {
		
		String s = "wipro";
		
		s.concat("technologies");
		
		System.out.println(s);
		
		StringBuffer sb = new StringBuffer("rk");
		sb.append("technologies");
		System.out.println(sb);
		
		StringBuilder sb1 = new StringBuilder("sanket");
		sb1.append("technologies");
		
		System.out.println(sb1);
		
	}
}
