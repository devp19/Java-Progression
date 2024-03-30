/**
 * This program reads in country data from a file into an ArrayList, then can be
 * used to find the largest country by area, by density, or the smallest by density.
 * You are to complete the following:
 * <p>
 * - Complete the readCountries method which reads in the country data to an ArrayList of Country objects
 * - Make a Comparator that compares according to area
 * - Make a Comparator that compares according to density
 * - Use those comparators to find the max area country, max density country, and min density country
 */

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class CountryDataTester
{

    public static ArrayList<Country> readCountries(String filename)
    {
        ArrayList<Country> countries = new ArrayList<>();

        //-----------Start below here. To do: approximate lines of code = 13
        // Inside a try-catch block, create a scanner to iterate through
        // the lines in the file, extract each country, and add it to the above
        // ArrayList of countries
        
        try {
            File file = new File(filename);

            Scanner scan = new Scanner(file);

            if (scan.hasNextLine()) {
                scan.nextLine();
            }

            while(scan.hasNextLine()){
                String currLine = scan.nextLine();

                String[] parts = currLine.split(",");
                String countryName = (parts[0]);
                Integer population = Integer.parseInt(parts[1]);
                Integer area = Integer.parseInt(parts[2]);

                countries.add(new Country(countryName, population, area));

            }
        } catch (IOException e) {
            System.out.println(filename +": File not found");
            return(countries);
        }
            // Create a scanner for the given filename
            // Skip the first line which just has column information
        
        
        
            // Iterate through the lines
            // Use a second scanner to pull out necessary information to construct a Country object
            // Remember to set the delimiter correct for this data file
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        // Catch the IOException and print out "filename: File not found" where filename is the filename
        // Should return an empty array list in this case
        //-----------------End here. Please do not remove this comment. Reminder: no changes outside the todo regions.
        return countries;
    }

    //-----------Start below here. To do: approximate lines of code = 3
    // Create a Comparator that compares Country objects by area
    
    static class AreaComparator implements Comparator<Country>{
        public int compare(Country country1, Country country2){
            return(country1.getArea() - country2.getArea());

            // -1 for if c2 Area > c1
            // 0 for if c2 Area == c1 Area
            // 1 if c2 Area < c1 Area
        }
    }
    
    
    //-----------------End here. Please do not remove this comment. Reminder: no changes outside the todo regions.

    //-----------Start below here. To do: approximate lines of code = 9
    // Create a Comparator that compares Country objects by density. Before you
    // do the division, remember to cast the values to doubles
    
    
    static class DensityComparator implements Comparator<Country>{
        
        public int compare(Country country1, Country country2){
            
            double area1 = (double) country1.getArea();
            double area2 = (double) country2.getArea();

            double population1 = (double) country1.getPopulation();
            double population2 = (double) country2.getPopulation();

            double density1 = population1 / area1;
            double density2 = population2/area2;


            return(Double.compare(density1, density2));

        }
    }
    
    
    
    //-----------------End here. Please do not remove this comment. Reminder: no changes outside the todo regions.

    public static void main(String[] args)
    {
        System.out.println("------ TEST 1: Checks that readCountries works with correct data ------");
        String filename = "countrydata.txt";
        ArrayList<Country> countries = readCountries(filename);
        printTestResult(testIntOutput("countries.size()", countries.size(), 238));

        System.out.println("\n------ TEST 2: Get country with max area ------");
        Country maxArea = null;

        //-----------Start below here. To do: approximate lines of code = 1
        // Set maxArea as the Country with the maximum area. Use
        // Collections.max and your AreaComparator

        maxArea = Collections.max(countries, new AreaComparator());
        
        //-----------------End here. Please do not remove this comment. Reminder: no changes outside the todo regions.
        printTestResult(testStringOutput("maxArea.toString()", maxArea.toString(), "(Russia, Pop:140702094, Area:17075200)"));

        System.out.println("\n------ TEST 3: Get country with max density ------");
        Country maxDensity = null;

        //-----------Start below here. To do: approximate lines of code = 1
        // Set maxDensity as the Country with the maximum density. Use
        // Collections.max and your DensityComparator
        
        maxDensity = Collections.max(countries, new DensityComparator());

        //-----------------End here. Please do not remove this comment. Reminder: no changes outside the todo regions.
        printTestResult(testStringOutput("maxDensity.toString()", maxDensity.toString(), "(Macau, Pop:460823, Area:28)"));

        System.out.println("\n------ TEST 4: Get country with min density ------");
        Country minDensity = null;

        //-----------Start below here. To do: approximate lines of code = 1
        // Set minDensity as the Country with the minimum density. Use
        // Collections.min and your DensityComparator

        minDensity = Collections.min(countries, new DensityComparator());
        
        //-----------------End here. Please do not remove this comment. Reminder: no changes outside the todo regions.
        printTestResult(testStringOutput("minDensity.toString()", minDensity.toString(), "(Greenland, Pop:56326, Area:2166086)"));

        System.out.println("\n\n--- TEST 5: Checks on a missing file");
        System.out.print("OUTPUT:   ");
        ArrayList<Country> missing_countries = readCountries("missing_countrydata.txt");
        System.out.println("EXPECTED: missing_countrydata.txt: File not found");

        System.out.println("\ncheck array list is empty");
        printTestResult(testIntOutput("missing_countries.size()", missing_countries.size(), 0));
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

    public static boolean testIntOutput(String methodName, int output, int expected)
    {
        System.out.println("OUTPUT of " + methodName + ":   " + output);
        if (output != expected) {
            System.out.println("EXPECTED of " + methodName + ": " + expected);
            System.out.println("    INCORRECT OUTPUT");
            return false;
        }
        return true;
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
}
