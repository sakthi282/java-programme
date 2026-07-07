import java.util.Scanner;

public class increment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int seat=85;
		
		System.out.println(" Available seats for booking is "+seat);
		
		System.out.println("please enter the no of seats for booking");
		
		Scanner scan=new Scanner(System.in);
				int booking=scan.nextInt();
		
		int balanceseat=seat-booking;
		
		System.out.println("your seats are booked "+booking);
		
		System.out.println("final show available seats are "+balanceseat);
		
		System.out.println("to cancel booked seats please enter ");
		
		
		int cancel=scan.nextInt();

		int remain=balanceseat+cancel;
		
		System.out.println("final show available seats are "+remain);
		
		scan.close();
		
	}

}
