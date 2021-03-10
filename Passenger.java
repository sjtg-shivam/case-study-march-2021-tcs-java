import java.util.regex.*;   
public class Passenger{
    private int pID;  // // A random 7 digit number for Passenger ID with a default value
    private String pName;  // //A string field for Passenger name(Maximum 50 characters)
    private String email;  // A //string field to capture the email.
    private String password;  // A string field for password(Maximum 30 characters)
    private String address;  // A string field to capture street, city details(Maximum 100 characters)
    private String contact; 

    public Passenger(int pID, String pName, String email, String password, String address, String contact) throws InvalidValueException {
        this.setPID(pID); 
        this.setPName(pName);
        this.setEmail(email);
        this.setPassword(password);
        this.setAddress(address);
        this.setContact(contact);
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

    public void setPName(String pName)throws InvalidValueException{
        String regex = "[A-Za-z ]{2,50}";  
        Pattern pattern = Pattern.compile(regex);  
        Matcher matcher = pattern.matcher(pName); 
        if(matcher.matches()){

        this.pName =pName ;
        }
        else {
            throw new InvalidValueException("Name is not valid");
        }
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
            throw new InvalidValueException("Email is not valid");
        }
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password)throws InvalidValueException{
        String regex = "[ A-Za-z0-9_!@#$%\\^&\\*\\(\\)\\{\\}\\[\\];':\"'/\\.,><]{4,30}";  
        Pattern pattern = Pattern.compile(regex);  
        Matcher matcher = pattern.matcher(password); 
        if(matcher.matches()){

        this.password = password;
        }
        else {
            throw new InvalidValueException("Password is not valid");
        }
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) throws InvalidValueException{
        String regex = "[A-Za-z0-9,\\. ]{5,100}";  
        Pattern pattern = Pattern.compile(regex);  
        Matcher matcher = pattern.matcher(address); 
        if(matcher.matches()){

        this.address =address ;
        }
        else {
            throw new InvalidValueException("Address is not valid");
        }
    }

    public String getContact() {
        return this.contact;
    }

    public void setContact(String contact)throws InvalidValueException{
        String regex = "[0-9]{10}";  
        Pattern pattern = Pattern.compile(regex);  
        Matcher matcher = pattern.matcher(contact); 
        if(matcher.matches()){

        this.contact =contact ;
        }
        else {
            throw new InvalidValueException("Contact is not valid");
        }
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

