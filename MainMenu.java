import java.util.Scanner;

public class MainMenu {

    public static void main(String[] args) {
        int sw=0;
        Scanner sc= new Scanner(System.in);
        

        
        do{ System.out.println("enter 1 for Passenger registration \n 2 for Ticket Booking \n 3 for Ticket booking history \n 4 to exit");
        try{  sw=sc.nextInt();}
      catch(Exception e){ 
        System.out.println(e);
        }
        switch(sw){
        case 1 :PassengerReg.reg(sc);break;
        case 2 :Ticket_Booking.acceptBooking(sc);break;
        case 3: ;break;
        case 4: System.out.println("Good Bye!");break;
        default:System.out.println("enter the correct digit");
        }

    }while(sw!=4);
    sc.close();
   

    }
    
}
