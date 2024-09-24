import java.util.Scanner;
public class Circle extends Shape {
	int rad;
	double area;
	Scanner s= new Scanner(System.in);
	//area function
	public void Area() {
		
		
		System.out.println("Enter radius of circle:");
		rad=s.nextInt();
		area=3.14*rad*rad;
		System.out.println("Area of circle is "+area);
		//s.close();
		
	}
	
	//draw function
	public void Draw() {
		System.out.println("To draw circle, put a pencil in compass, then take the required radius.Fix the compass ata apoint and draw a circle");
		
	}
}