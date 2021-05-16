package Object;

import java.io.Serializable;
import java.util.Date;

/**
 * notes information stores here
 * @author Alireza Nejadipour
 * @version 1.6
 */

public class Note implements Serializable
{
    private final String title;
    private final String text;
    private final Date date;

    /**
     * create a new note
     * @param title the title of the note
     * @param text the text
     * @param date the date note has created
     */
    public Note(String title, String text, Date date)
    {
        this.title = title;
        this.text = text;
        this.date = date;

    }


    /**
     * get title of note
     * @return the title field
     */
    public String getTitle()
    {
        return title;

    }

    /**
     * return the text
     * @return field text is returned
     */
    public String getText()
    {
        return text;

    }

    /**
     * get the date note has been made
     * @return the date field is returned
     */
    public Date getDate()
    {
        return date;

    }

}
