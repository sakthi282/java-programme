import java.util.Scanner;

public class account {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("please enter the account type 1 for saving and current acc for current");
		Scanner scan=new Scanner(System.in);
		String acctype = scan.next();
		double interestRate = 0;
        double interest = 0;
    	System.out.println("please enter the account balance");
		
		double accbal = scan.nextDouble();
        
		//boolean result=acctype=="saving":interest=(accbal*0.03);
		
        	if (acctype=="saving" && accbal <= 10000) 
		    {
        		
        		interestRate = 5;
				interest=accbal*0.05;
        			
			} 
			  else
				{
                interestRate = 3;
                interest=accbal*0.03;
				}
        	 if (acctype=="current"&& accbal >= 20000) 
			   {
        		 interestRate = 4;
				 interest=accbal*0.04;
			   }  
				 
				else  
				{
	             interestRate = 2;
	             interest=accbal*0.02;
	            }
				 System.out.println("Interest Rate: " + interestRate );
			      System.out.println("Calculated Interest: " + interest);
			    scan.close();  
		}
		
}
