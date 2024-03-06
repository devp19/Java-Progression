/**
 * A class to model an employee. You are to complete the following:
 * - Complete the constructor
 * - Complete the toString method
 */
public class Employee
{
    private String name;
    private double salary;

    /**
     * Make an employee with a given name and salary.
     *
     * @param name   the name
     * @param salary the salary
     */
    public Employee(String name, double salary)
    {
        //-----------Start below here. To do: approximate lines of code = 2
        //
        // Remember to initialize all member variables
        
        this.name = name;
        this.salary = salary;
        
        //-----------------End here. Please do not remove this comment. Reminder: no changes outside the todo regions.
    }

    /**
     * Provide a string description of an employee.
     */
    public String toString()
    {
        String s = this.getClass().getName(); // Stores the class name in s
        //-----------Start below here. To do: approximate lines of code = 1
        //
        // Should output in the form "ClassName Name: Tom Salary: 50000.0"
        
  

        return(s + " Name: "+name+" Salary: "+salary);


        //-----------------End here. Please do not remove this comment. Reminder: no changes outside the todo regions.
    }
}
