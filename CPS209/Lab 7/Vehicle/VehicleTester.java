/**
 * Tests the Vehicle class. DO NOT EDIT THIS FILE.
 */
public class VehicleTester
{
    public static void main(String[] args)
    {
        System.out.println("------ TEST 1: Add Gas to Corolla ------");
        Vehicle v = new Vehicle("Corolla", 4.0/100.0, 35);

        runAddGasTest(v, 15, 15, false);
        runAddGasTest(v, 12, 27, false);
        runAddGasTest(v, 9, 27, true);

        System.out.println("\n------ TEST 2: Drive Corolla ------");
        runDriveTest(v, 600, 3.0, -1.0);
        runDriveTest(v, 100, 3.0, 75.0);
        runDriveTest(v, 50, 1.0, -1.0);
        runDriveTest(v, 50, 1.0, 25.0);

        System.out.println("\n------ TEST 3: Add Gas and Drive RAM ------");
        Vehicle v2 = new Vehicle("RAM", 15.0/100.0, 65);
        runAddGasTest(v2, 55, 55, false);
        runAddGasTest(v2, 13, 55, true);

        runDriveTest(v2, 350, 2.50, -1.0);
        runAddGasTest(v2, 55, 57.50, false);
        runDriveTest(v2, 300, 12.50, -1.0);
        runDriveTest(v2, 100, 12.50, 83.33);
    }

    public static void runAddGasTest(Vehicle v, double gasToAdd, double gasAfter, boolean exceptionThrown) {
        System.out.println("Adding " + gasToAdd + " gas to " + v);
        boolean pass = true;

        try {
            v.addGas(gasToAdd);
            if (exceptionThrown) {
                pass = false;
                System.out.println("*** INCORRECT. EXCEPTION SHOULD BE THROWN.");
            }
        } catch (Vehicle.FullTankException e) {
            if (!exceptionThrown) {
                pass = false;
                System.out.println("*** INCORRECT. FullTankException SHOULD NOT BE THROWN");
            } else {
                System.out.println("FullTankException CORRECTLY THROWN");
            }
        } catch (Exception e) {
            pass = false;
            if (exceptionThrown) {
                System.out.println("*** INCORRECT. WRONG EXCEPTION THROWN");
                System.out.println("EXCEPTION THROWN: " + e);
                System.out.println("*** FullTankException should be thrown instead");
            } else {
                System.out.println("*** INCORRECT. NO EXCEPTION SHOULD BE THROWN");
                System.out.println("EXCEPTION THROWN: " + e);
            }
        }

        if (!testDoubleOutput("getGasLevel", v.getGasLevel(), gasAfter, 2)) {
            pass = false;
        }

        printTestResult(pass);
    }

    public static void runDriveTest(Vehicle v, double distance, double gasAfter, double maxDistance) {
        System.out.println("Driving " + distance + " in vehicle " + v);
        boolean pass = true;

        try {
            v.drive(distance);
            if (maxDistance > 0.0) {
                pass = false;
                System.out.println("*** INCORRECT. EXCEPTION SHOULD BE THROWN.");
            }
        } catch (Vehicle.InsufficientGasLevelException e) {
            if (maxDistance <= 0.0) {
                pass = false;
                System.out.println("*** INCORRECT. InsufficientGasLevelException SHOULD NOT BE THROWN");
            } else {
                System.out.println("InsufficientGasLevelException CORRECTLY THROWN");
                if (!testDoubleOutput("getMaxDistance", e.getMaxDistance(), maxDistance, 2)) {
                    pass = false;
                }
            }
        } catch (Exception e) {
            pass = false;
            if (maxDistance > 0.0) {
                System.out.println("*** INCORRECT. WRONG EXCEPTION THROWN");
                System.out.println("EXCEPTION THROWN: " + e);
                System.out.println("*** InsufficientGasLevelException should be thrown instead");
            } else {
                System.out.println("*** INCORRECT. NO EXCEPTION SHOULD BE THROWN");
                System.out.println("EXCEPTION THROWN: " + e);
            }
        }

        if (!testDoubleOutput("getGasLevel", v.getGasLevel(), gasAfter, 2)) {
            pass = false;
        }

        printTestResult(pass);
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

    public static boolean testDoubleOutput(String methodName, double output, double expected, int digits)
    {
        String pf = "%." + digits + "f\n";
        System.out.printf("OUTPUT of " + methodName + ":   " + pf, output);
        if (Math.abs(output - expected) >= Math.pow(10, -1 * digits)) {
            System.out.printf("EXPECTED of " + methodName + ": " + expected);
            System.out.println("    INCORRECT OUTPUT");
            return false;
        }
        return true;
    }
}
