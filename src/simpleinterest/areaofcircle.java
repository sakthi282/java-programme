package simpleinterest;

public class areaofcircle {

	
	
	
	//print result using a non-static method
	
	
	public void circle(int circle)
	{
		System.out.println("the area of circle is "+ circle);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//calculate area of a circle using a static method
		int lenght=45;
		int breadth =67;
		int area =(lenght*breadth);
		
		areaofcircle s=new areaofcircle();
		s.circle(area);
		
		
		
	}

}
