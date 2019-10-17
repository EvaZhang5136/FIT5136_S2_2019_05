/**
 * Write a description of class Quotation here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Quotation
{
    // instance variables - replace the example below with your own
    private String name;
    private String date;
    private String time;

    /**
     * Constructor for objects of class Quotation
     */
    public Quotation(String newName, String newDate, String newTime)
    {
        name = newName;
        date = newDate;
        time = newTime;
    }
    
    public Quotation()
    {
        name = "";
        date = "";
        time = "";
    }

    public String getName()
    {
        return name;
    }
    public String getDate()
    {
        return date;
    }
    public String getTime()
    {
        return time;
    }
    
    public void setName(String newName)
    {
        name = newName;
    }
    
    public void setDate(String newDate)
    {
        date= newDate;
    }
    
    public void setTime(String newTime)
    {
        time = newTime;
    }
    
}
