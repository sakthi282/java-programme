package simpleinterest;

public class collegename {

	//non-static methods print student name
	
	public void student(String studentname)
	{
		System.out.println("new student name is "+studentname);
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//static methods print college name
		System.out.println("gurunanak college");
		
		collegename s=new collegename();
		s.student("vijay");
		s.student("gopal");
		s.student("ram");
		s.student("logesh");
	}

}
