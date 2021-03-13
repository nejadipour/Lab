/**
 * The ClockDisplay class implements a digital clock display for a
 * European-style 24 hour clock. The clock shows hours and minutes. The
 * range of the clock is 00:00 (midnight) to 23:59 (one minute before
 * midnight).
 *
 * The clock display receives "ticks" (via the timeTick method) every minute
 * and reacts by incrementing the display. This is done in the usual clock
 * fashion: the hour increments when the minutes roll over to zero.
 *
 * @author Michael Kolling and David J. Barnes
 * @version 2008.03.30
 */
public class ClockDisplay
{
    private NumberDisplay hours;
    private NumberDisplay minutes;
    private NumberDisplay seconds;
    private String displayString;    // simulates the actual display

    /**
     * Constructor for ClockDisplay objects. This constructor
     * creates a new clock set at 00:00.
     */
    public ClockDisplay()
    {
        this.hours = new NumberDisplay(24);
        this.minutes = new NumberDisplay(60);
        this.seconds = new NumberDisplay(60);
        updateDisplay();
    }

    /**
     * Constructor for ClockDisplay objects. This constructor
     * creates a new clock set at the time specified by the
     * parameters.
     */
    public ClockDisplay(int hour, int minute, int seconds)
    {
        this.hours = new NumberDisplay(24);
        this.minutes = new NumberDisplay(60);
        this.seconds = new NumberDisplay(60);
        setTime(hour, minute, seconds);
    }

    /**
     * This method should get called once every minute - it makes
     * the clock display go one minute forward.
     */
    public void timeTick()
    {
        seconds.increment();

        if(seconds.getValue() == 0)  // it just rolled over!
        {
            minutes.increment();

            if(minutes.getValue() == 0)  // it just rolled over!
            {
                hours.increment();
            }

        }


        updateDisplay();
    }

    /**
     * Set the time of the display to the specified hour and
     * minute.
     */
    public void setTime(int hour, int minute, int second)
    {
        hours.setValue(hour);
        minutes.setValue(minute);
        seconds.setValue(second);
        updateDisplay();
    }

    /**
     * Return the current time of this display in the format HH:MM.
     */
    public String getTime()
    {
        return displayString;
    }

    /**
     * Update the internal string that represents the display.
     */
    private void updateDisplay()
    {
        displayString = hours.getDisplayValue() + ":" +
                        minutes.getDisplayValue() + ":" +
                        seconds.getDisplayValue();
    }

    public static void main(String[] args)
    {
        ClockDisplay clock = new ClockDisplay(23, 58, 14);

        for (int i = 0 ; i < 300 ; i++)
        {
            clock.timeTick();
            System.out.println(clock.getTime());
        }

    }

}
