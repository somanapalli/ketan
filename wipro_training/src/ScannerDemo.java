import java.util.Scanner;

public class ScannerDemo {
	
	public static void main(String[] args) {
		
		//create an object for Scanner class 
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("enter first number");
		
		String fno = scanner.nextLine();
		
		//convert String type to integer type 
		
		int x = Integer.parseInt(fno);
		
		System.out.println("enter second number");
		
		String sno = scanner.nextLine();
		
		//convert String type to integer type
		
		int y = Integer.parseInt(sno);
		
		System.out.println("sum is: " + (x+y));
	}

}
