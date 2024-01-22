/*
 * You are to complete a program reads that double values from a list (actually from a string) using a scanner.
 * It will then count how many input numbers there are and calculate the minimum, maximum, range, and average.
 *
 * For example, if the values are: 20 10 30 40 then the average is (20+10+30+40)/4 = 25 and the min is 10 and the max is 40
 *
 * Below, you need to complete code for calculating these values.
 */
import java.util.Scanner;

public class ComputeMaxMinAverage
{
    public static void main(String[] args)
    {
        String numbers = "34 68 22 76.0 81 98 78 84 62";
        Scanner in = new Scanner(numbers);

        double min = 10000000;
        double max = 0;
        double sum = 0.0;

        int count = 0;     
       
        while (in.hasNextDouble()){
            count += 1;
            double number = in.nextDouble();

            sum += number;

            if(number > max){
                max = number;
            }

            if(number < min){
                min = number;
            }
        }
        
        double range = max-min;
        double average = (sum / count);

        System.out.println("------ Max Test -------");
        System.out.printf("OUTPUT:   The maximum is %.2f%n", max);
        System.out.println("EXPECTED: The maximum is 98.00");

        System.out.println("\n\n------ Min Test -------");
        System.out.printf("OUTPUT:   The minimum is %.2f%n", min);
        System.out.println("EXPECTED: The minimum is 22.00");

        System.out.println("\n\n------ Count Test -------");
        System.out.println("OUTPUT:   The count is " + count);
        System.out.println("EXPECTED: The count is 9");

        System.out.println("\n\n------ Sum Test -------");
        System.out.printf("OUTPUT:   The sum is %.2f%n", sum);
        System.out.println("EXPECTED: The sum is 603.00");

        System.out.println("\n\n------ Range Test -------");
        System.out.printf("OUTPUT:   The range is %.2f%n", range);
        System.out.println("EXPECTED: The range is 76.00");

        System.out.println("\n------ Average Test -------");
        System.out.printf("OUTPUT:   The average is %.2f%n", average);
        System.out.println("EXPECTED: The average is 67.00");
    }
}
