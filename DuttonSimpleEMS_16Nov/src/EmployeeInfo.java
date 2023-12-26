

public class EmployeeInfo {

    
    // ATTRIBUTES
    public int empNum;
    public String firstName;
    public String lastName;
    public double deductRate; // e.g. 0.21 for 21%
    
    
    // CONSTRUCTORS
    
    public EmployeeInfo(int eN, String fN, String lN, double dR) {
    	empNum = eN;
    	firstName = fN;
    	lastName = lN;
    	deductRate = dR;
    }
    
    
    // METHODS
    
    public int getEmpNum() {
    	return empNum;
    }
    
    public String getFirstName() {
    	return firstName;
    }
    
    public String getLastName() {
    	return lastName;
    }
    
    
    public double calcNetAnnualIncome() {
        return (-1.0);
    }
    
}
