/**
 * A class suitable for the simulating a vehicle driving. You are to complete the
 * following:
 * <p>
 * - Create a FullTankException subclass
 * - Complete the InsufficientTankException subclass
 * - Implement addGas
 * - Implement drive
 */
public class Vehicle
{
    private String name;
    private double fuelEfficiency;
    private double gasLevel;
    private double tankSize;

    //-----------Start below here. To do: approximate lines of code = 1
    //
    // Create a public static class called FullTankException which extends from
    // IllegalArgumentException. The rest of the class can be blank as we will
    // only use the default constructor
    // HINT: The first line of the InsufficientGasLevelException shows you the key parts
    
    public static class FullTankException extends IllegalArgumentException{}
    //-----------------End here. Please do not remove this comment. Reminder: no changes outside the todo regions.
    public static class InsufficientGasLevelException extends IllegalArgumentException {
        private double maxDistance;

        /**
         * Constructs the exception.
         *
         * @param gasLeft The amount of gas left
         * @param efficiency The efficiency of the vehicle
         */
        //-----------Start below here. To do: approximate lines of code = 2
        //
        // Implement the constructor according to the definition in the javadoc comment above.
        // It should set the maxDistance attribute as the distance that could be travelled
        // based on the amount of gas left and the efficiency
        // Hint: remember that gasLeft is in litres, and the efficiency is how many kms
        // the car can travel per litre.
        
        public InsufficientGasLevelException(double gasLeft, double efficiency){
            this.maxDistance = gasLeft / efficiency;
        }
       

        
        //-----------------End here. Please do not remove this comment. Reminder: no changes outside the todo regions.

        public double getMaxDistance() {
            return maxDistance;
        }
    }

    /**
     * Initializes a car with a given fuel efficiency
     *
     * @param name The vehicle name
     * @param fuelEfficiency the default fuel efficiency in L/100 km
     * @param tankSize The size of the fuel tank in L
     */
    public Vehicle(String name, double fuelEfficiency, double tankSize)
    {
        this.name = name;
        this.fuelEfficiency = fuelEfficiency;
        this.tankSize = tankSize;
        gasLevel = 0;
    }

    /**
     * Puts gas in the tank.
     *
     * @param gas amount of gas to add
     */
    public void addGas(double gas)
    {
        //-----------Start below here. To do: approximate lines of code = 3
        //
        // If the added gas would not fit based on the current level and tank size
        // throw a FullTankException (with no message). No gas should be added to
        // the tank in this case.
        // Otherwise add the gas to the tank.
        
        if((gas + gasLevel) > tankSize){
            throw new FullTankException();
        }
        else{
            gasLevel += gas;
        }
        
        
        //-----------------End here. Please do not remove this comment. Reminder: no changes outside the todo regions.
    }

    /**
     * Simulates driving the car and thus reducing the gas in the tank
     *
     * @param distance miles driven
     */
    public void drive(double distance)
    {
        //-----------Start below here. To do: approximate lines of code = 4
        //
        // If there is not enough gas, throw an InsufficientGasLevelException
        // Do not drive that distance in this case
        // Otherwise, subtract the gas used from the tank
        // HINT: Try to determine how to calculate the gas on your own first. If you
        // are having trouble, see Car.java from Question 3
        
        double gasNeeded = distance * fuelEfficiency; // Convert distance from km to liters based on fuel efficiency

        if (gasNeeded > gasLevel) {
            throw new InsufficientGasLevelException(gasLevel, fuelEfficiency);
        } else {
            gasLevel -= gasNeeded;
        }
        
        
        //-----------------End here. Please do not remove this comment. Reminder: no changes outside the todo regions.
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

    public double getTankSize() {
        return tankSize;
    }

    public String toString()
    {
        return "(" + name + ", Gas: " + gasLevel + ", Eff: " + fuelEfficiency + ")";
    }
}

