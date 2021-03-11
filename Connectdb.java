// export CLASSPATH=/home/shivam/tcs_training/case\ study\ march\ 2021\ tcs/case\ study\ march\ 2021\ tcs\ java/mysql-connector-java-5.1.18-bin.jar:$CLASSPATH
import java.sql.*; 
import java.util.*;
public class Connectdb {
    static Vector<Integer> pidList = new Vector<Integer>();
    static Vector<Integer> pnrList = new Vector<Integer>();

    public static Vector<Integer> getPID(){
        pidList.clear();
        try{  
        // Class.forName("com.mysql.jdbc.Driver");  
        Class.forName ("com.mysql.jdbc.Driver");//.newInstance ();
               String userName = "admin";
               String password = "12345";
               String url = "jdbc:MySQL://localhost/airline";        
               Connection con = DriverManager.getConnection (url, userName, password);
        // Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/airline","admin","12345");  
        //here sonoo is database name, root is username and password  
        Statement stmt=con.createStatement();  
        
        ResultSet rs=stmt.executeQuery("select pid from passenger");  
        while(rs.next())  
        pidList.add(rs.getInt(1));  
        
        con.close();  
        }
        catch(Exception e){
             System.out.println(e);
            }  
        // for (Integer va:pidList){
        //     System.out.println(va);
        // }

    return pidList;
    }


    public static Vector<Integer> getPnr(){
        pidList.clear();
        try{  
        // Class.forName("com.mysql.jdbc.Driver");  
        Class.forName ("com.mysql.jdbc.Driver");//.newInstance ();
               String userName = "admin";
               String password = "12345";
               String url = "jdbc:MySQL://localhost/airline";        
               Connection con = DriverManager.getConnection (url, userName, password);
        // Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/airline","admin","12345");  
        //here sonoo is database name, root is username and password  
        Statement stmt=con.createStatement();  
        
        ResultSet rs=stmt.executeQuery("select pnr_no from booking");  
        while(rs.next())  
        pnrList.add(rs.getInt(1));  
        
        con.close();  
        }
        catch(Exception e){
             System.out.println(e);
            }  
        for (Integer va:pnrList){
            System.out.println(va);
        }

    return pidList;
    }

    public static void printselect(int ipid){
        pidList.clear();
        try{  
        // Class.forName("com.mysql.jdbc.Driver");  
        Class.forName ("com.mysql.jdbc.Driver");//.newInstance ();
               String userName = "admin";
               String password = "12345";
               String url = "jdbc:MySQL://localhost/airline";        
               Connection con = DriverManager.getConnection (url, userName, password);
        // Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/airline","admin","12345");  
        //here sonoo is database name, root is username and password  
        Statement stmt=con.createStatement();  
        
        ResultSet rs=stmt.executeQuery("select pnr_no,travel_date, source_airport ,destination_airport,seat_preference, meal_preference from booking where pid="+String.valueOf(ipid));  
        ResultSetMetaData rsmd = rs.getMetaData();
        int columnsNumber = rsmd.getColumnCount();
        boolean r1=true;
        while(rs.next()) {
        
        if(r1){
            for (int i = 1; i <= columnsNumber; i++) 

            System.out.print(rsmd.getColumnName(i));
        }
        System.out.println(" ");
        r1=false;
        for (int i = 1; i <= columnsNumber; i++) {
            
            if (i > 1) System.out.print(",  ");
            String columnValue = rs.getString(i);
            System.out.print(columnValue);
        } 
        System.out.println(" ");
    }
        
        con.close();  
        }
        catch(Exception e){
             System.out.println(e);
            }                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       
        for (Integer va:pnrList){
            System.out.println(va);                                                                                                                                                                                                                                                                         
        }


    }


}
