/**
 * A Country class that has a name and an area. The measure of a country is the
 * area. You should complete the following:
 * <p>
 * - Define the class and make it implement Measurable
 * - Implement getMeasure to return the area
 */

//-----------Start below here. To do: approximate lines of code = 1
//
// Define the class named Country and make it implement Measurable

public class Country implements Measurable
//-----------------End here. Please do not remove this comment. Reminder: no changes outside the todo regions.
{
    private String name;
    private double area;

    /**
     * Construct a country with name and area.
     *
     * @param name country's name
     * @param area total area of country
     */
    public Country(String name, double area)
    {
        this.name = name;
        this.area = area;
    }

    public String toString()
    {
        return name + ", AREA: " + area;
    }

    /**
     * Measurable interface method to retrieve measure.
     *
     * @return the measured area
     */
    //-----------Start below here. To do: approximate lines of code = 2
    //
    
    public double getMeasure(){
        return(area);
    }
    
    //-----------------End here. Please do not remove this comment. Reminder: no changes outside the todo regions.
}
