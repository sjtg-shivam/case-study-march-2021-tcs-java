import java.util.ArrayList;
import java.util.Scanner;

public class Ticket_Booking {
	static ArrayList<Booking> bookings = new ArrayList<Booking>();
	

	public static void acceptBooking(Scanner sc )
	{
		
		System.out.println("Please Enter your Passenger ID: ");
		int id= sc.nextInt();
		
		System.out.println("Please Enter your PNR Number: ");
		String pnr= sc.next();
		if(pnr.equalsIgnoreCase(""))
			pnr=sc.next();
		
		System.out.println("Please Enter your Travel Date(dd/mm/yyyy): ");
		String td= sc.next();
		if(td.equalsIgnoreCase(""))
			td=sc.next();
		
		System.out.println("Please Enter your Source Airport: ");
		String source= sc.nextLine();
		if(source.equalsIgnoreCase(""))
			source=sc.nextLine();
		
		System.out.println("Please Enter your Destination Airport: ");
		String dest= sc.nextLine();
		if(dest.equalsIgnoreCase(""))
			dest=sc.nextLine();
		
		System.out.println("Please Enter your Booking Status: ");
		String status= sc.next();
		if(status.equalsIgnoreCase(""))
			status=sc.next();
		
		System.out.println("Please Enter your Seat Prefrence: ");
		String sp= sc.next();
		if(sp.equalsIgnoreCase(""))
			sp=sc.next();
		
		System.out.println("Please Enter your Meal Prefrence: ");
		String mp= sc.next();
		if(mp.equalsIgnoreCase(""))
			mp=sc.next();
		
		Booking newBooking= new Booking(id,pnr,td,source,dest,status,sp,mp);
		if(newBooking.checkBooking())
		{
			bookings.add(newBooking);
			System.out.println("Booking Succesfully Created");
			System.out.println(newBooking.toString());
			
		}
		else
			System.out.println("Booking Not Added: Invalid Details");
		// sc.close();
	}

}
