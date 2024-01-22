/*
 * You are to complete a program that reads a list of integer numbers from a String (using Scanner), and finds the sum
 * of all numbers in that list that are odd, at least 20, and no larger than 60. For example, if the String is
 * "7 67 23 18 16 99 45 51 42 64 33 71", then the sum is 23 + 45 + 51 + 33 = 152.
 */

import java.util.Scanner;

public class AddOddNumbers
{
    public static void main(String[] args)
    {
        int min = 20;
        int max = 60;

        String numbers = "7 67 23 18 16 99 45 51 42 64 33 71";
        Scanner in = new Scanner(numbers);
        int sum = 0;
        
        while(in.hasNextInt()){
            int number = in.nextInt();

            if ((number % 2 != 0) && number<max && number>min){
                sum += number;

            }
        }
        
        System.out.println("------ Test ------");
        System.out.println("OUTPUT:   The sum is " + sum);
        System.out.println("EXPECTED: The sum is 152");
    }
}
