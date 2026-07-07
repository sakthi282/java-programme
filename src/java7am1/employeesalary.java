package java7am1;

public class employeesalary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


	netsalary(40000,3456, 4000,5660);
	grosssalary(3456,400000,5000);
	
	}

	
	public static void netsalary(double bse,double hra,double tax,double pf)
	{

		//double bse=bse;
		//double hra=hra;
		//double tax=tax;
		//double pf=pf;
		double netsalary=bse+hra-tax-pf;
		
		
		System.out.println("this is the netsalary "+netsalary);
			
	}
	public static void grosssalary(double hra,double bse,double pf)
	{
		double grosssalary=hra+bse+pf;
		System.out.println("this is my gross salary"+ grosssalary);
	}
	
	
}
