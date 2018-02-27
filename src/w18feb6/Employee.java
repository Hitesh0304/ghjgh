
package w18feb6;

import java.time.LocalDate;
import java.time.Period;

public class Employee {
    private String firstName, lastName, sin;
    private LocalDate dob;
    
    /**
     * this is the constructor
     */
    public Employee(String firstName, String lastName, String sin, LocalDate dob) {
        setFirstName(firstName);
        setLastName(lastName);
        setSin(sin);
        setDob(dob);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSin() {
        return sin;
    }

    public void setSin(String sin) {
        this.sin = sin;
    }

    public LocalDate getDob() {
        return dob;
    }
    
    /**
     * This method will validate that the Employee is 15-90
     * years old
     * @param dob 
     */
    public void setDob(LocalDate dob) {
        int age = Period.between
                        (dob, LocalDate.now()).getYears();
        
        if (age >= 15 && age <= 90)
            this.dob = dob;
        else
            throw new IllegalArgumentException("Age must be 15-90");
    }
    
    /**
     * this method returns the employee's first and last name
     * as a string
     */
    @Override
    public String toString(){
            return String.format("%s %s",firstName,lastName);
    }
    
    /**
     * this method will return the employee's age in years
     */
    public int getAge(){
        int age = Period.between
                        (dob, LocalDate.now()).getYears();
        return age;
    
    
    }  
    
    
    
    
    
    
    
    
    
    
}
