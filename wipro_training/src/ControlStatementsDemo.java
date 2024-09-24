import java.util.Scanner;

public class ControlStatementsDemo {

	
	public static void main(String[] args) {
		
		
		
		//declare the array
		
		int x[]= {1,2,3,4,5};
		
		for(int i=0;i<x.length;i++)
		{
			System.out.println(x[i]);
		}
		
		//foreach loop or enhanced for loop
		System.out.println("==============");
		for(int y:x)
		{
			System.out.println(y);
		}
		
		System.out.println("========2d arrays======");
		
		//declare and intialize a 2D array of integers
		int[][] matrix = {
				
				{1,2,3},
				{4,5,6},
				{7,8,9}
		};
		
		//access and print each element in the 2d array
		
		for(int i=0;i<matrix.length;i++)
		{
			for(int j=0;j<matrix[i].length;j++)
			{
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
		
		
		
		
		
		
		
	}
}
