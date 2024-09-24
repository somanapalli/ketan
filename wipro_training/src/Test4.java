
public class Test4 {
	
	//parameterized constructor
	public Test4(int stid, String stname)
	{
		//call current class default constructor
		this();
		System.out.println("parameterized constructor");
		
		
	}
	
	//default constructor
	public Test4() {
		
		System.out.println("default constructors");
	}
	
	public static void main(String[] args) {

		Test4 obj1 = new Test4(100,"Rama");
	
	}

}
