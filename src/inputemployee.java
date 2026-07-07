import java.util.Scanner;

public class inputemployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("please enter your name");
		Scanner name=new Scanner(System.in);
		String empname =name.next();
			
		System.out.println("please enter your age");
		String empage =name.next();
		
		System.out.println("please enter your city");
		String empcity =name.next();
		
		System.out.println("your goodname is "+empname);
		System.out.println("your age is "+empage);
		System.out.println("your wonderful city is "+empcity);
	
	name.close();
	}
}
