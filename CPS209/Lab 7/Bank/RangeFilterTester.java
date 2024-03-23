/**
 * Tests your BankAccount code. DO NOT EDIT THIS FILE
 */

import java.util.ArrayList;

class RangeFilterTester
{
    public static void main(String[] args)
    {
        ArrayList<BankAccount> accounts = new ArrayList<BankAccount>();
        accounts.add(new BankAccount(1398723, 900));
        accounts.add(new BankAccount(1432561, 9900));
        accounts.add(new BankAccount(1584624, 52));
        accounts.add(new BankAccount(1856210, 2300));
        accounts.add(new BankAccount(1745382, 213));
        accounts.add(new BankAccount(1965432, 603));
        accounts.add(new BankAccount(1234567, 12));

        System.out.println("------ TEST 1: Tests that inRange works Range 100 to 1000. ------");
        boolean [] correct = {true, false, false, false, true, true, false};
        for (int i = 0; i < accounts.size(); i++) {
            runFilterTest(accounts.get(i), 100, 1000, correct[i]);
        }

        System.out.println("------ TEST 1: Tests that inRange works Range 52 to 603. ------");
        boolean [] correct2 = {false, false, true, false, true, true, false};
        for (int i = 0; i < accounts.size(); i++) {
            runFilterTest(accounts.get(i), 52, 603, correct2[i]);
        }
    }

    public static void runFilterTest(BankAccount account, double low, double high, boolean expected) {
        System.out.println("Test Account - " + account);
        System.out.println("Range - low : " + low + " high: " + high);
        boolean output = account.inRange(low, high);

        printTestResult(testBooleanOutput("inRange", output, expected));
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

    public static boolean testBooleanOutput(String methodName, boolean output, boolean expected)
    {
        System.out.println("OUTPUT of " + methodName + ":   " + output);
        if (output != expected) {
            System.out.println("EXPECTED of " + methodName + ": " + expected);
            System.out.println("    INCORRECT OUTPUT");
            return false;
        }
        return true;
    }
}
