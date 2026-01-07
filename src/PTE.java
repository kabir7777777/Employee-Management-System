
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
    
    
    public double hourlyWage;
    public double hoursPerWeek;
    public double weeksPerYear;
    
    
    public PTE(int eN, String fN, String lN, int g, String wL, double dR, double hW, double hPW, double wPY) {       
        
        super(eN, fN, lN, g, wL, dR);
        hourlyWage = hW;
        hoursPerWeek = hPW;
        weeksPerYear = wPY;
        
    }   
    
    /**
     *
     * @return
     */
    @Override
    public double calcNetAnnualIncome() {
        return ((hourlyWage * hoursPerWeek * weeksPerYear) *(1.0 - deductRate));
    }
    public double grossPay() {
        return hourlyWage * hoursPerWeek * weeksPerYear;
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
