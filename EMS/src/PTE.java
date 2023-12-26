
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author P0068839
 */
    
// PART TIME EMPLOYEE

public class PTE extends EmployeeInfo {
    
    // ATTRIBUTES
    public double hourlyWage;
    public double hoursPerWeek;
    public double weeksPerYear;
    
    // CONSTRUCTOR
    public PTE(int eN, String fN, String lN, double dR, double hW, double hPW, double wPY) {       
        
        super(eN, fN, lN, dR);
        hourlyWage = hW;
        hoursPerWeek = hPW;
        weeksPerYear = wPY;
        
    }
    
    // METHODS
    
    public double calcNetAnnualIncome() { // methods
        return (hourlyWage * hoursPerWeek * weeksPerYear) * (1 - deductRate);
    }
    
    public double getHourlyWage() {
        return hourlyWage;
    }

    public double getHoursPerWeek() {
        return hoursPerWeek;
    }

    public double getWeeksPerYear() {
        return weeksPerYear;
    }
}
