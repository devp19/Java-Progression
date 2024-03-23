/**
 * A class suitable for the simulating a car driving. You are to complete the
 * following:
 * <p>
 * - Implement the compareTo method needed by Comparable, to compare according to fuel efficiency
 */
public class Car implements Comparable<Car>
{
    private String name;
    private double fuelEfficiency;
    private double gasLevel;

    /**
     * Initializes a car with a given fuel efficiency
     *
     * @param fuelEfficiency the default fuel efficiency
     */
    public Car(String name, double fuelEfficiency)
    {
        this.name = name;
        this.fuelEfficiency = fuelEfficiency;
        gasLevel = 0;
    }

    /**
     * Puts gas in the tank.
     *
     * @param gas amount of gas to add
     */
    public void addGas(double gas)
    {
        this.gasLevel = gasLevel + gas;
    }

    /**
     * Simulates driving the car and thus reducing the gas in the tank
     *
     * @param distance miles driven
     */
    public void drive(double distance)
    {
        gasLevel -= distance * fuelEfficiency;
    }

    /**
     * Returns the current gas level.
     *
     * @return current gas level
     */
    public double getGasLevel()
    {
        return gasLevel;
    }

    //-----------Start below here. To do: approximate lines of code = 6
    // write a method to implement the Comparable interface
    // The method should compare two cars based on fuel efficiency (higher fuel efficiency is better).
    // If there is a tie, it should then compare by alphabetical order of name
    // Note that because Car implements Comparable<Car> instead of just Comparable,
    // the parameter type should be Car
    //
    
    public int compareTo(Car otherCar) {
    // Compare based on fuel efficiency
    int fuelEfficiencyComparison = Double.compare(this.fuelEfficiency, otherCar.fuelEfficiency);

    // If fuel efficiencies are different, return the comparison result
    if (fuelEfficiencyComparison != 0) {
        return fuelEfficiencyComparison;
    } else {
        // If fuel efficiencies are the same, compare by name
        return this.name.compareTo(otherCar.name);
    }
}
    

    
    //-----------------End here. Please do not remove this comment. Reminder: no changes outside the todo regions.

    public String toString()
    {
        return "(" + name + ", Gas: " + gasLevel + ", Eff: " + fuelEfficiency + ")";
    }
}

