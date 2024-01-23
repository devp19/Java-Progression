/*
 * You are to complete three tasks involving powers of 2.
 *
 * Task 1: Calculate the sum of the powers of 2 from 1 to 20 (inclusive), skipping over power divisible by 3.
 * Task 2: Calculate the sum of the powers of 2 from 1 to 27 (inclusive), only including those with exponents divisible by 3.
 * Task 3: Find the exponent k such that 2^3 + 2^6 + 2^9 + ... + 2^k <= 1,000,000 where the sum only includes powers of two
 *         where the exponents are divisible by 3.
 *
 * Complete the tasks in the relevant sections below.
 *
 * ONLY ADD CODE TO THE SPECIFIED AREAS. DO NOT CHANGE ANY OTHER CODE.
 */
public class PrintPowers
{
    public static void main(String[] args)
    {
        int sum = 0;
        
        for(int power = 1; power <= 20; power++){

            if(power % 3 != 0){
                int result = (int)Math.pow(2, power);
                sum += result;
            }
        }

        System.out.println("------ Task 1 Test ------");
        System.out.println("OUTPUT:   Sum = " + sum);
        System.out.println("EXPECTED: Sum = 1797558");


        // ---------------- TASK 2 ---------------------
        // Calculate the sum of the powers of 2 from 1 to 27 (inclusive), only including those with exponents divisible by 3.
        // So the sum will be 2^3 + 2^6 + ...
     
        sum = 0;

        for(int power = 3; power <= 27; power+=3){
 
            int result = (int)Math.pow(2, power);

            sum += result;
        }
        
        System.out.println("\n\n------ Task 2 Test ------");
        System.out.println("OUTPUT:   Sum = " + sum);
        System.out.println("EXPECTED: Sum = 153391688");




        // ---------------- TASK 3 ---------------------
        // Find the exponent k such that 2^3 + 2^6 + 2^9 + ... + 2^k <= 1,000,000 where the sum only includes powers of two
        // where the exponents are divisible by 3. Create a program to find this value.
        //
        // For example, if the required max total was 1000, then the value would be 9, since 2^3 + 2^6 + 2^9 = 584 <= 1000
        // but 2^3 + 2^6 + 2^9 + 2^12 = 4680 > 1000.

        int power = 3;
        
        int maxTotal = 1000000;
        sum = 0;

        while((sum + Math.pow(2, power)) < maxTotal){

            sum += Math.pow(2, power);

            power += 3;

        }

        power -= 3;       
        
        System.out.println("\n\n------ Task 3 Test ------");
        System.out.println("OUTPUT:   Power = " + power);
        System.out.println("EXPECTED: Power = 18");
    }
}
