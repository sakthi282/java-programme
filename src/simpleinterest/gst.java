package simpleinterest;

public class gst {

	//Write a program declare  method named addGST that takes the original price of a product as input.

//The method should return the final price after adding 18% GST.
	
	public void apple(double price)
	{
		System.out.println("the apple price with out gst is " +price);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double price =90;
		double rate = ((price*0.18)+price);
		
		
	System.out.println("the apple price with gst is " +rate);
		
		gst s=new gst();
		s.apple(price);
		
	}

}
