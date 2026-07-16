package treeset;

import java.util.TreeSet;

public class id_checking {

	public static void main(String[] args) {
	

		        // 1. Store Book IDs using TreeSet.
		
		        TreeSet<Integer> bookid = new TreeSet<>();

		        bookid.add(101);
		        bookid.add(102);
		        bookid.add(103);
		        bookid.add(104);
		        bookid.add(105);
		        
		       // 2. Duplicate Book IDs should not be allowed.
		        
		        bookid.add(104);
		        
		        //3. Display Book IDs in ascending order.
		        
		        System.out.println("Book IDs "  +bookid);
		        
		      
		        // 4. Check whether Book ID 105 is available.
		        
		        if (bookid.contains(105))
		        {
		        	
		            System.out.println("Book ID 105 Available");
		            
		        }
		        else 
		        {
		            System.out.println("Book ID 105 Not Available");
		        }

		        // 5. Remove Book ID 102.
		        
		        bookid.remove(102);

		        //6. Display the updated Book IDs.
		        
		        System.out.println("Updated Book IDs  "+bookid);
		        
		       
		        
		    }
		
			
	}


