
import java.util.Scanner;



public class Main{

    public static void main(String[] args) {
        
        // Find the hypotenuse of a triangle!

        Scanner trigScanner = new Scanner(System.in);

        System.out.print("Enter side 1 length: ");
        double side1 = trigScanner.nextDouble();

        System.out.print("Enter side 2 length: ");
        double side2 = trigScanner.nextDouble();

        trigScanner.close();

    
        double side3 = Math.sqrt((Math.pow(side1, 2) + Math.pow(side2, 2)));

        System.out.println("The length of the hypotenuse is: "+side3);
    }


    
}