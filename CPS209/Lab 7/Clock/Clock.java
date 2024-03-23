/**
 * Stores necessary fields for a clock.
 *
 * Complete the constructor so that it throws an IllegalArgumentException if given
 * invalid inputs, and otherwise sets attributes appropriately.
 */
public class Clock {
    private int hours;
    private int minutes;
    private int seconds;

    /**
     * Sets the clock variables to the correct values.
     *
     * @param hours What to set hours to
     * @param minutes What to set minutes to
     * @param seconds What to set seconds to
     * @throws IllegalArgumentException if the input parameters are illegal
     */
    public Clock(int hours, int minutes, int seconds) {
        //-----------Start below here. To do: approximate lines of code = 9
        //
        // If the hours is not from 1 and 12, should throw an IllegalArgumentException with message
        // "Hour value is invalid. Must be between 1 and 12"
        // If minutes is not from 0 to 59, should throw an IllegalArgumentException with message
        // "Minutes value is invalid. Must be between 0 and 59"
        // If seconds is not from 0 to 59, should throw an IllegalArgumentException with message
        // "Seconds value is invalid. Must be between 0 and 59"
        
        if(hours < 1 || hours > 12){
            throw new IllegalArgumentException("Hour value is invalid. Must be between 1 and 12");
        }
        else{
            this.hours = hours;
        }


        if(minutes < 0 || minutes > 59){
            throw new IllegalArgumentException("Minutes value is invalid. Must be between 0 and 59");
        }
        else{
            this.minutes = minutes;
        }

        if(seconds < 0 || seconds > 59){
            throw new IllegalArgumentException("Seconds value is invalid. Must be between 0 and 59");
        }
        else{
            this.seconds = seconds;
        }
       

        //-----------------End here. Please do not remove this comment. Reminder: no changes outside the todo regions.
    }

    public void secondElapsed() {
        seconds++;
        if (seconds == 60) {
            seconds = 0;
            minutes++;
        }
        if(minutes == 60) {
            minutes = 0;
            hours++;
        }
        if(hours == 13) {
            hours = 1;
        }
    }

    public String toString() {
        String time = "";
        if (hours < 10) {
            time += "0";
        }
        time += hours + ":";
        if (minutes < 10) {
            time += "0";
        }
        time += minutes + ":";
        if(seconds < 10) {
            time += "0";
        }
        time += seconds;
        return time;
    }

    public int getHours() {
        return hours;
    }
    public int getMinutes() {
        return minutes;
    }
    public int getSeconds() {
        return seconds;
    }

    public boolean equals(Clock other) {
        if (this.hours == other.hours && this.minutes == other.minutes && this.seconds == other.seconds) {
            return true;
        }
        return false;
    }
}