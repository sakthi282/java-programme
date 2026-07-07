package simpleinterest;

public class square {

	
	//a non-static method cube(int n) that returns cube
	public void cube(int n)
	{
		int areaofcube = (n*n*n);
		System.out.println("area of cube is "+areaofcube);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//a static method square(int n) that returns square
		
		int n =45;
		int areaofsquare=(n*n);
		System.out.println("while n = "+n);
		System.out.println("Area of square is "+areaofsquare);
		square s=new square();
		s.cube(n);
	}

}
