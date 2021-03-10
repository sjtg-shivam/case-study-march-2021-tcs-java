import java.util.regex.*;   
public class Passenger{
    private int pID;  // // A random 7 digit number for Passenger ID with a default value
    private String pName;  // //A string field for Passenger name(Maximum 50 characters)
    private String email;  // A //string field to capture the email.
    private String password;  // A string field for password(Maximum 30 characters)
    private String address;  // A string field to capture street, city details(Maximum 100 characters)
    private String contact; 

    public Passenger(int pID, String pName, String email, String password, String address, String contact) {
        this.pID = pID;
        this.pName = pName;
        this.email = email;
        this.password = password;
        this.address = address;
        this.contact = contact;
    }

    public int getPID() {
        return this.pID;
    }

    public void setPID(int pID) {
        this.pID = pID;
    }

    public String getPName() {
        return this.pName;
    }

    public void setPName(String pName) {
        this.pName = pName;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) throws InvalidValueException{
        String regex = "^[A-Za-z0-9+_.-]+@(.+)$";  
        Pattern pattern = Pattern.compile(regex);  
        Matcher matcher = pattern.matcher(email); 
        if(matcher.matches()){

        this.email = email;
        }
        else {
            throw new InvalidValueException("not valid");
        }
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getContact() {
        return this.contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    

    @Override
    public String toString() {
        return "{" +
            " pID='" + getPID() + "'" +
            ", pName='" + getPName() + "'" +
            ", email='" + getEmail() + "'" +
            ", password='" + getPassword() + "'" +
            ", address='" + getAddress() + "'" +
            ", contact='" + getContact() + "'" +
            "}";
    }




}

