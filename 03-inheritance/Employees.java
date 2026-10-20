public class Employees {
    private String firstName;
    private String lastName;
    private String email;

    public Employees(){
        firstName = "N/A";
        lastName = "N/A";
        email = "N/A";
    }

    public Employees(String newFirstName, String newLastName, String newEmail){
        setFirstName(newFirstName);
        setLastName(newLastName);
        setEmail(newEmail);
    }

    public void setFirstName (String newFirstName){
        
    }

    public void setLastName (String newLastName){

    }

    public void setEmail(String newEmail){
        
    }

    public String getFirstName (){
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public String getEmail(){
        return email;
    }
}