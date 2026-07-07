import java.util.Scanner;

public class inputsalary {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.out.println("please enter your salary ");
		
		try(Scanner sal=new Scanner(System.in)){
		
		double wage=sal.nextDouble();
		
			
		System.out.println("your salary mentioned is "+wage);
		
		double annual=((wage)*12);
		
		System.out.println("your annual salary is "+annual);
		}
		
		
		
		
	}

}
