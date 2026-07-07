package simpleinterest;

public class staticandnonstatic {

	public static int addition()
	{
		
	int a=45;
	int b=28;
	
	int c=a+b;
	
	return c;
		
		
	}
	public static int subtraction()
	{
		
	int a=45;
	int b=28;
	
	int c=a-b;
	
	return c;
		
		
	}
	//External Methods && Static method

	public static void systeminfo()

	{
	 
	System.out.println("Login System started");

	}

	 
	//Non-static method

	public void username(String username,int age )

	{
		
	 System.out.println("Username : "+username +" Age : " +age);

	
	}
	
	public static String name()
	{
		
		String name="Sakthivel";
		return name;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		 addition();
	     subtraction();
	    
         System.out.println("The Addtional number Is :"+ addition());
         System.out.println("The subtraction number Is :"+subtraction());
         systeminfo();
         staticandnonstatic s=new staticandnonstatic ();
         s.username("vel",39);
         s.username("prasanth",9);
         String newname = name();
         System.out.println("The name is : "+ newname);

	}

}
