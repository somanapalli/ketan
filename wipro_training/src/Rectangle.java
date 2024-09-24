import java.util.Scanner;

public class Rectangle extends Shape {
	int len,br;
	Scanner sc= new Scanner(System.in);
	   //area function
		public void Area() {
			
			
			System.out.println("Enter length of rectangle:");
			len=sc.nextInt();
			System.out.println("Enter breadth of rectangle:");
			br=sc.nextInt();
			double area=len*br;
			System.out.println("Area of rectangle is "+area);
			//sc.close();
			
		}
		
		//draw function
		public void Draw() {
			System.out.println("To draw a rectangle,first dra a sleeping line followed by two standing lines at 90degree angle from the edges of the sleeping line. Now connect the standing lines by a sleping line.");
			
		}

}
