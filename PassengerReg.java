import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class PassengerReg{

    static int pIDGen(){
        int id=0;
        id=(int)Math. round(10000000*Math.random());
        // System.out.println(id);
        // if data base is connected we need to confirm uniqueness of id
        return id;
    }
    static boolean validateContact(StringBuffer contact){

        return true;
    }
    static boolean validateEmail(StringBuffer email){

        return true;
    }

    public static void main(String[] args) {
        // System.out.println();
        Scanner sc = new Scanner(System.in);
        int pID = pIDGen();  // // A random 7 digit number for Passenger ID with a default value
        String pName = sc.nextLine();  // //A string field for Passenger name(Maximum 50 characters)
        StringBuffer emailb=new StringBuffer(" ");
        while(!validateEmail(emailb)) 
            emailb =new StringBuffer(sc.nextLine()); 
        String email=emailb.toString(); // A //string field to capture the Email.
        String password = sc.nextLine();  // A string field for Password(Maximum 30 characters)
        String address = sc.nextLine();  // A string field to capture street, city details(Maximum 100 characters)
        StringBuffer contactb=new StringBuffer(" "); ;
        while(!validateContact(contactb)) 
            contactb = new StringBuffer(sc.nextLine());
        String contact=contactb.toString(); 
        // 

        Passenger p =new Passenger(pID, pName, email, password, address, contact);
        System.out.println(p);
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
