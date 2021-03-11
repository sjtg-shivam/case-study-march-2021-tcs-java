import java.sql.*; 
public class Connectdb {
    public static void getPID(){
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
        System.out.println(rs.getInt(1));  
        
        con.close();  
        }
        catch(Exception e){
             System.out.println(e);
            }  


    }
}
