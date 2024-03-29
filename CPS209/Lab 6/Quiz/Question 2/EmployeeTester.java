
/**
 * Tests the Employee, Manager, and Executive classes. DO NOT EDIT THIS FILE.
 */
public class EmployeeTester
{
    public static void main(String[] args)
    {
        System.out.println("------ Test 1: Check Employee toString ------");
        Employee e1 = new Employee("Jeff", 30000);
        runToStringTest(e1, "Employee Name: Jeff Salary: 30000.0");

        Employee e2 = new Employee("Tim", 43000);
        runToStringTest(e2, "Employee Name: Tim Salary: 43000.0");

        System.out.println("\n------ Test 2: Check Manager toString ------");
        Manager m1 = new Manager("Larry", 80000, "Sales");
        runToStringTest(m1, "Manager Name: Larry Salary: 80000.0 Department: Sales");

        Manager m2 = new Manager("Hamed", 75000, "Engineering");
        runToStringTest(m2, "Manager Name: Hamed Salary: 75000.0 Department: Engineering");

        System.out.println("\n------ Test 3: Check Executive toString ------");
        Executive ex1 = new Executive("Jayne", 750000, "Regional Sales", 20000);
        runToStringTest(ex1, "Executive Name: Jayne Salary: 750000.0 Department: Regional Sales Bonus: 20000");

        Executive ex2 = new Executive("Sally", 650000, "R and D", 25000);
        runToStringTest(ex2, "Executive Name: Sally Salary: 650000.0 Department: R and D Bonus: 25000");
    }

    public static void runToStringTest(Employee e, String expected)
    {
        String output = e.toString();
        printTestResult(testStringOutput("toString", output, expected));
    }

    public static void printTestResult(boolean pass)
    {
        if (pass) {
            System.out.println("*** TEST PASSES ***\n");
        } else {
            System.out.println("*******************************************");
            System.out.println("*************** TEST FAILED ***************");
            System.out.println("*******************************************\n");
        }
    }

    public static boolean testStringOutput(String methodName, String output, String expected)
    {
        System.out.println("OUTPUT of " + methodName + ":   " + output);
        if (!output.equals(expected)) {
            System.out.println("EXPECTED of " + methodName + ": " + expected);
            System.out.println("    INCORRECT OUTPUT");
            return false;
        }
        return true;
    }
}
