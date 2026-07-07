package simpleinterest;

public class interest {

		public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		double lk =f(1000,2,4);
		
		double gh =t(34,56,78);
		
		System.out.println("interest is "+ gh);
		
		System.out.println("interest is "+ lk);
	}

	public static double f(double p,double n,double r)
	{
	
	double si=p*n*r/100;
	System.out.println("Simple interest is "+ si);
	
     return si;
	}
	
	public static double t(double j,double l,double w)
	{
		double q=j*l*w/100;
		return q;

	}
}
