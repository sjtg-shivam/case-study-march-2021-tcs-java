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
    static boolean validateContact(String contact){
        if (contact.equals(" "))
        return false;
        return true;
    }
    static boolean validateEmail(String email){
        if (email.equals(" "))
        return false;
        return true;
    }
    static boolean validatePName(String name){
        if (name.equals(" "))
        return false;
        return true;
    }
    static boolean validatePassword(String password){
        if (password.equals(" "))
        return false;
        return true;
    }
    static boolean validateAddress(String address){
        if (address.equals(" "))
        return false;
        return true;
    }

    public static void main(String[] args) {
        // System.out.println();
        Scanner sc = new Scanner(System.in);
        int pID = pIDGen();  // // A random 7 digit number for Passenger ID with a default value
        String pName = " ";
        while(!validatePName(pName)) 
            pName =sc.nextLine();
        String email= " ";
        while(!validateEmail(email)) 
            email =sc.nextLine(); 
        
            String password = " ";
            while(!validatePassword(password)) 
                password = sc.nextLine();
        String address = " ";
        while(!validateAddress(address)) 
            address =sc.nextLine();
        String contact= " ";
        while(!validateContact(contact)) 
            contact= sc.nextLine();
        // String contact=contactb.toString(); 
        // 

        Passenger p =new Passenger(pID, pName, email, password, address, contact);
        System.out.println(p);
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
