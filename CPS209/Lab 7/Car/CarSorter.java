/**
 * Tests your additions to Car.java. DO NOT EDIT THIS FILE
 */

import java.util.ArrayList;
import java.util.Collections;

public class CarSorter
{
    public static void main(String[] args)
    {
        ArrayList<Car> cars = new ArrayList<Car>();

        Car car;

        car = new Car("BMW", 5 / 100.0); // 5 Liters per 100 KM
        car.addGas(20.0); // 20 Liters
        cars.add(car);

        car = new Car("Audi", 12 / 100.0); // 12 Liters per 100 KM
        car.addGas(10.0); // 10 Liters
        cars.add(car);

        car = new Car("Mercedes", 1 / 100.0); // 1 Liters per 100 KM
        car.addGas(50.0); // 50 Liters
        cars.add(car);

        car = new Car("Prius", 25 / 100.0); // 25 Liters per 100 KM
        car.addGas(25.0); // 25 Liters
        cars.add(car);

        car = new Car("Corolla", 17 / 100.0); // 17 Liters per 100 KM
        car.addGas(43.0); // 43 Liters
        cars.add(car);

        System.out.println("------ TEST 1: Sort by efficiency, No Ties ------");
        runSortTest(cars, "[(Mercedes, Gas: 50.0, Eff: 0.01), (BMW, Gas: 20.0, Eff: 0.05), (Audi, Gas: 10.0, Eff: 0.12), (Corolla, Gas: 43.0, Eff: 0.17), (Prius, Gas: 25.0, Eff: 0.25)]");

        System.out.println("------ TEST 2: Sort by efficiency, Has Ties ------");
        car = new Car("Tiguan", 1 / 100.0); // 1 Liters per 100 KM
        car.addGas(33.0); // 33 Liters
        cars.add(car);

        car = new Car("Prius", 2 / 100.0); // 1 Liters per 100 KM
        car.addGas(21.0); // 21 Liters
        cars.add(car);

        car = new Car("Corolla", 17 / 100.0); // 17 Liters per 100 KM
        car.addGas(43.0); // 43 Liters
        cars.add(car);

        car = new Car("Mini", 17 / 100.0); // 17 Liters per 100 KM
        car.addGas(43.0); // 43 Liters
        cars.add(car);

        runSortTest(cars, "[(Mercedes, Gas: 50.0, Eff: 0.01), (Tiguan, Gas: 33.0, Eff: 0.01), (Prius, Gas: 21.0, Eff: 0.02), (BMW, Gas: 20.0, Eff: 0.05), (Audi, Gas: 10.0, Eff: 0.12), (Corolla, Gas: 43.0, Eff: 0.17), (Corolla, Gas: 43.0, Eff: 0.17), (Mini, Gas: 43.0, Eff: 0.17), (Prius, Gas: 25.0, Eff: 0.25)]");
    }

    public static void runSortTest(ArrayList<Car> cars, String expected)
    {
        System.out.println("The initial array is          " + cars);
        Collections.sort(cars);

        String output = cars.toString();

        printTestResult(testStringOutput("Collections.sort", output, expected));
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
