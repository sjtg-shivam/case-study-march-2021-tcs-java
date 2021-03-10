
import java.time.*;
import java.time.format.DateTimeFormatter;
public class Booking {
	
	private int id; // 7 Digit Passenger ID
	private String pnr; // 7 Digit PNR number
	private LocalDate travelDate;
	private DateTimeFormatter format;
	private String travel_date; // Travel Date in the format dd/mm/yyyy
	private String source; // Source Airport
	private String destination; // Destination Airport
	private String status; // Values: New, Confirm, Hold
	private String seat_prefrence; // Values: Middle, Aisle, Window
	private String meal_prefrence; // Values: Veg, Non-Veg
	private boolean idCheck;
	private boolean pnrCheck;
	private boolean dateCheck;
	private boolean sourceCheck;
	private boolean destCheck;
	private boolean statusCheck;
	private boolean seatCheck;
	private boolean mealCheck;

	
	public Booking() {
		super();
		this.id=0;
		this.pnr="";
		this.travelDate =null;
		this.format = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		this.travel_date="";
		this.source="";
		this.destination="";
		this.status="";
		this.seat_prefrence="";
		this.meal_prefrence="";
		this. idCheck = false;   
		this. pnrCheck= false;  
		this. dateCheck= false; 
		this. sourceCheck= false;
		this. destCheck= false; 
		this. statusCheck= false;
		this. seatCheck= false; 
		this. mealCheck= false; 

		
	}
	
	public Booking(int id, String pnr, String travel_date, String source, String destination, String status,
			String seat_prefrence, String meal_prefrence) {
		super();
		setId(id);
		//this.id = id;
		setPnr(pnr);
		//this.pnr = pnr;
		this.format = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		settravel_date(travel_date);
		//this.travel_date = travel_date;
		setSource(source);
		//this.source = source;
		setDestination(destination);
		//this.destination = destination;
		setStatus(status);
		//this.status = status;
		setSeat_prefrence(seat_prefrence);
		//this.seat_prefrence = seat_prefrence;
		setMeal_prefrence(meal_prefrence);
		//this.meal_prefrence = meal_prefrence;
	}
	
	public Boolean checkBooking() //checks if all fields have been filled
	{
		/*System.out.println(idCheck     );
		System.out.println(pnrCheck      );
		System.out.println(dateCheck   );
		System.out.println(sourceCheck );
		System.out.println(destCheck   );
		System.out.println(statusCheck );
		System.out.println(seatCheck   );
		System.out.println(mealCheck   );*/
		if( idCheck && pnrCheck && dateCheck && sourceCheck && destCheck && statusCheck && seatCheck && mealCheck  )
			return true;
		else
			return false;
	}
	
	@Override
	public String toString()
	{
		return "id-"+id+"\npnr-"+pnr+"\ntravel_date-"+travel_date+"\nsource-"+source+"\ndestination-"+destination 
				+"\nstatus-"+status +"\nseat_prefrence-"+seat_prefrence+"\nmeal_prefrence-"+meal_prefrence;
	}

	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		int flag= id/1000000;
		if(flag>=1 && flag<=9)
			{this.id = id; idCheck= true;}
		else
		{
			this.id =0;
			System.out.println("Invalid ID");
			idCheck= false;
		}
			
	}
	
	
	public String getPnr() {
		return pnr;
	}
	public void setPnr(String pnr) {
		if(pnr.length()==7)
			{this.pnr = pnr; pnrCheck=true;}
		else
		{
			this.pnr ="";
			System.out.println("Invalid PNR");
			pnrCheck=false;
		}
	}
	
	
	public String gettravel_date() {
		return travel_date;
	}
	public void settravel_date(String travel_date) {
		try {
			this.travelDate = LocalDate.parse(travel_date, this.format);
			this.travel_date = this.travelDate.format(this.format);
			dateCheck =true;
		} catch(Exception e)
		{
			System.out.println("Incorrect Date Format");
			System.out.println("Exception: "+ e.toString());
			dateCheck=false;
		}
		
	}
	
	
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		if(source.equalsIgnoreCase(""))
			{this.source = ""; sourceCheck=false;}
		else
			{this.source = source.toUpperCase(); sourceCheck=true;}
	}
	
	
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		if(destination.equalsIgnoreCase(""))
			{this.destination = ""; destCheck=false;}
		else
			{this.destination = destination.toUpperCase(); destCheck=true;}
	}
	
	
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		if(status.equalsIgnoreCase("New") || status.equalsIgnoreCase("Confirm") || status.equalsIgnoreCase("Hold") )
			{this.status = status.toUpperCase(); statusCheck=true;}
		else
		{
			this.status ="";
			System.out.println("Invalid Status");
			statusCheck=false;
		}
	}
	
	
	public String getSeat_prefrence() {
		return seat_prefrence;
	}
	public void setSeat_prefrence(String seat_prefrence) {
		if(seat_prefrence.equalsIgnoreCase("Middle") || seat_prefrence.equalsIgnoreCase("Aisle") || seat_prefrence.equalsIgnoreCase("Window") )
			{this.seat_prefrence = seat_prefrence.toUpperCase(); seatCheck=true;}
		else
		{
			this.seat_prefrence ="";
			System.out.println("Invalid Seat Prefrence");
			seatCheck=false;
		}
	}
	
	
	public String getMeal_prefrence() {
		return meal_prefrence;
	}
	public void setMeal_prefrence(String meal_prefrence) {
		if(meal_prefrence.equalsIgnoreCase("Veg") || meal_prefrence.equalsIgnoreCase("Non-Veg"))
			{this.meal_prefrence = meal_prefrence.toUpperCase(); mealCheck=true;}
		else
		{
			this.meal_prefrence ="";
			System.out.println("Invalid Meal Prefrence");
			mealCheck=false;
		}
	}
	
	

}
