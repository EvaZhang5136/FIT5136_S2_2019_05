import java.util.Scanner;
import java.io.*;
import java.util.ArrayList;

/**
 * Write a description of class ListOfBookings here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ListOfBookings
{
    // instance variables - replace the example below with your own
    private ArrayList<Booking> bookings;

    /**
     * Constructor for objects of class ListOfBookings
     */
    public ListOfBookings()
    {
        // initialise instance variables
        bookings = new ArrayList<Booking>(5);
    }
    
    public ListOfBookings(ArrayList<Booking> newBookings)
    {
        // initialise instance variables
        bookings = newBookings;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void addBooking()
    {
        //Booking b = new Booking();
        //b.add(new Booking());
    }
    
    public ArrayList<Booking> getListOfBookings()
    {
        return bookings;
    }
    
    public Booking getSpecificBooking(int index) throws NullPointerException
    {
        return bookings.get(index);
    }
    
    public String getSpecificBookingsName(int index) throws NullPointerException
    {
        return bookings.get(index).getName();
    }
    
    public void readFile() //chnage void to STring and return something
    {
        String filename = ("bookings.txt");
        try
        {
            FileReader inputFile = new FileReader(filename);
            try
            {
                Scanner parser = new Scanner(inputFile);
                while (parser.hasNextLine())
                {
                    //drivers.add(parser.next());
                    String[] bookingValues = parser.nextLine().split(",");
                    //String bookingNo = bookingValues[0];
                    String name = bookingValues[0];
                    String date = bookingValues[1];
                    String time = bookingValues[2];
                    
                    

                    Booking booking = new Booking();
                    //booking.setBookingNo(bookingNo);
                    booking.setName(name);
                    booking.setDate(date);
                    booking.setTime(time);
                    

                    bookings.add(booking);

                }
            }
            finally
            {
                System.out.println("Bookings being set up");
                inputFile.close();
            }
        }
        catch(FileNotFoundException exception)
        {
            System.out.println(filename + "not found");
        }
        catch(IOException exception)
        {
            System.out.println("Unexpected I/O exception occured");
        }
        
        
    }
    
    public void writeFile(Booking booking)
    {
        String filename = "bookings.txt";
        try
        {
            FileWriter writer = new FileWriter(filename, true);
            BufferedWriter bw = new BufferedWriter(writer);
            bw.write("\n" + booking.getName() + "," + booking.getDate() + "," + booking.getTime() + "," + booking.getStatus());
            bw.flush();
        }
        catch(FileNotFoundException exception)
        {
            System.out.println(filename + "not found");
        }
        catch(IOException exception)
        {
            System.out.println("Unexpected I/O exception occured");
        }
    }
}