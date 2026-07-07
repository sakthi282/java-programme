import java.util.Scanner;

public class numerchecking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	System.out.println("enter the colur red 1,yellow 2,green 3 to  test");
		
		Scanner num1=new Scanner(System.in);
		int colour =num1.nextInt();
		
		
		switch (colour) 
		{
		
		case (1):		
		
	
			System.out.println("pause ");
			break;
		
		
		case (2):	
		
			System.out.println("get ready");
			break;
	
		case (3):
		
				System.out.println("good to go");
				break;
			
		default:
			System.out.println("please choose either colur mentioned ");
		num1.close();
		}
			
	}	

}