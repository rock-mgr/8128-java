public class FullTimeEmployee extends Employees{
    private double monthlySalary;
    private int leave;
    
    public FullTimeEmployee(){
        super();
    }
    
    public FullTimeEmployee(String newFirstName, String newLastName, String newEmail, double newMonthlySalary, int newLeave){
        super(newFirstName, newLastName, newEmail);
        setMonthlySalary(newMonthlySalary);
        setLeave(newLeave);
    }

    public void setMonthlySalary(double newMonthlySalary)    {

    }

    public void setLeave (int newLeave){

    }
    
    public double getMonthlySalary(){
        return monthlySalary;
    }

    public int getLeave(){
        return leave;
    }
}