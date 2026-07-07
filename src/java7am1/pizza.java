package java7am1;

public class pizza {

	void foodorder()
	{
		System.out.println("customer name is given ");
		System.out.println("Food item ordered  ");
	}
	
	
	static void placeOrder(String customername,String fooditem)
	{
		System.out.println("And the customer name is "+customername);
		System.out.println("The food item ordered is "+fooditem);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		pizza h=new pizza();
		h.foodorder();
		placeOrder("rahul","pizza");
		String deliverytime ="30 minutes";
		
		System.out.println("delivery expected in "+deliverytime);
		
		
	}

}
