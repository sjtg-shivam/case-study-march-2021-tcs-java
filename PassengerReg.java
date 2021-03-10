import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class PassengerReg{
    static Vector<Passenger> passList   =   new Vector<Passenger>();
    static int pIDGen(){
        int id=0;
        id=(int)Math. round(10000000*Math.random());
        // System.out.println(id);
        // if data base is connected we need to confirm uniqueness of id
        return id;
    }
//     static boolean validateContact(String contact){
//         if (contact.equals(" ")){
// System.out.print("Please enter the value again");
//         return false;}
//         return true;
//     }
//     static boolean validateEmail(String email){
//         if (email.equals(" ")){
// System.out.print("Please enter the value again");
//         return false;}
//         return true;
//     }
//     static boolean validatePName(String name){
//         if (name.equals(" ")){
// System.out.print("Please enter the value again");
//         return false;}
//         return true;
//     }
//     static boolean validatePassword(String password){
//         if (password.equals(" ")){
// System.out.print("Please enter the value again");
//         return false;}
//         return true;
//     }
//     static boolean validateAddress(String address){
//         if (address.equals(" ")){
// System.out.print("Please enter the value again");
//         return false;}
//         return true;
//     }

    public static void main(String[] args) {
        // System.out.println();
        Scanner sc = new Scanner(System.in);
        System.out.print("Welcome to Passenger registration wizard \n How many passengers whould you like to register");
        int size = sc.nextInt();
        sc.nextLine();
        boolean flag;
        Passenger p=null;
        for(int i=0;i<size;i++){
            int pID = pIDGen();  
            do{
                 flag=false;
            // System.out.print("Welcome to Passenger registration wizard \n How many passengers whould you like to register");
            // String pName = " ";
            // do {
                System.out.print("Please enter your name");
                String  pName =sc.nextLine();
            // }while(!validatePName(pName)); 
               
            // String email= " ";
            // do{
                System.out.print("Please enter your email");
                String  email =sc.nextLine(); 
            // }while(!validateEmail(email));
            
            //     String password = " ";
            // do{ 
                System.out.print("Please enter a password");
                String    password = sc.nextLine();
            // }while(!validatePassword(password));
                    
            // String address = " ";
            // do{ 
                System.out.print("Please enter your address");
              String  address =sc.nextLine();
            // }while(!validateAddress(address));
            
            // String contact= " ";
            // do{
                System.out.print("Please enter your contact in 10 digits ");
              String  contact= sc.nextLine();
            //  }while(!validateContact(contact));
            // String contact=contactb.toString(); 
            try{
            p =new Passenger(pID, pName, email, password, address, contact);
            }
            catch(InvalidValueException e){
                System.out.print(e);
                System.out.print("fill these values again");
                flag=true;
            }
            // System.out.println(p);
        }while(flag);
            passList.add(p);
            System.out.print("Passenger Registration is successful");
        }
        System.out.println(passList);
        sc.close();
    }

}




//  Developer needs to input the following information from the console using programming to register Passenger;  //
//  Passenger ID;  //  A random 7 digit number for Passenger ID with a default value
//  Passenger Name;  // A string field for Passenger name(Maximum 50 characters)
//  Email;  // A string field to capture the Email.
//  Password;  // A string field for Password(Maximum 30 characters)
//  Address;  // A string field to capture street, city details(Maximum 100 characters)
//  Contact Number;  //Text field. Maximum 10 characters.
// * Once all fields are taken as input, Passenger details need to be inserted in array/list/appropriate collection. After successful registration, a registration acknowledgment message need to be displayed on the console as "Passenger Registration is successful". 
