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
    private int catering;
    private int price;

    public Quotation()
    {
        name = "";
        date = "";
        time = "";
        catering = 2;
        price = 0;
    }
    
    /**
     * Constructor for objects of class Quotation
     */
    public Quotation(String newName, String newDate, String newTime, int newCatering, int newPrice)
    {
        name = newName;
        date = newDate;
        time = newTime;
        catering = newCatering;
        price = newPrice;
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
    
    public int getCatering()
    {
        return catering;
    }
    
    public int getPrice()
    {
        return price;
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

    public void setCatering(int newCatering)
    {
        catering = newCatering;
    }
    
    public void setPrice(int newPrice)
    {
        price = newPrice;
    }
}
