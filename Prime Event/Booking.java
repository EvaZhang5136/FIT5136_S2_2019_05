import java.util.Scanner;
import java.io.*;
import java.util.ArrayList;
import java.sql.Timestamp;

public class Booking
{
    private Timestamp bookingNo;
    private String name;
    private String date;
    private String time;
    private int status;//1.Ongoing 2. Complished
    private ArrayList<Review> reviews;
    

    public Booking()
    {
        //Timestamp bookingNo = ;
        String name = "";
        String date = "";
        String time = "";
        int status = 1; 
        reviews = new ArrayList<>();
    }
    
    /**
     * Return the number of customer comments for this item.
     */
    public int getNumberOfReviews()
    {
        return reviews.size();
    }
    
    /**
     * Add a comment to the comment list of this sales item. Return true if successful;
     * false if the comment was rejected.
     * 
     * The comment will be rejected if the same author has already left a comment, or
     * if the rating is invalid. Valid ratings are numbers between 1 and 5 (inclusive).
     */
    public boolean addReview(String author, String text)
    {
        //if(reviews.getTimestamp() == Booking.getTime()) {  // reject invalid ratings
          //  return false;
        //}
        
        reviews.add(new Review(author, text));
        return true;
    }
    
    /**
     * Remove the comment stored at the index given. If the index is invalid, do nothing.
     */
    public void removeComment(int index)
    {
        if(index >=0 && index < reviews.size()) { // if index is valid
            reviews.remove(index);
        }
    }

    public void bookHall()
    {
        ArrayList<String> file = new ArrayList<>();
        FileReader reader = null;
        try
        {
            reader = new  FileReader("Quotation.txt");
            Scanner scanner = new Scanner(reader);
            while(scanner.hasNext())
            {
                String line = scanner.nextLine();
                file.add(line + "\n");
            }
            reader.close();
        }
        catch(FileNotFoundException e)
        {
            System.out.println("Files can not be found!");
        }
        catch(IOException e)
        {
            System.out.println("Error!");
        }
        
        for(int i = 0; i < file.size(); i++)
        {
            System.out.println("Quotation " + i+1 + ". " + file.get(i));
        }
        System.out.println("Enter the number of quatation to book a hall.");
        System.out.println("Enter 0 to exit.");
        Scanner console = new Scanner(System.in);
        int quotation = console.nextInt();
        if(quotation == 0)
        {
            
        }
        else
        {
            System.out.println("Quotation " + quotation + "has been selected");
            System.out.println("Please enter you card number to pay a deposit:");
            String cardNo = console.nextLine();
            System.out.println("Please enter you PIN:");
            int pin = console.nextInt();
            System.out.println("Transaction successful!");
            ArrayList<String> booking = new ArrayList<>();
            bookingNo = new Timestamp(System.currentTimeMillis());
            name = file.get(quotation);//.getName();
            date = file.get(quotation);//.getDate();
            time = file.get(quotation);//.getTime();
            status = 1;
            booking.add(0,bookingNo.toString());
            booking.add(1,name);
            booking.add(2,date);
            booking.add(3,time);
            String statusS = Integer.toString(status);
            booking.add(4,statusS);
            booking.add("\n");
            try
            {
                FileWriter writer = new FileWriter("Booking.txt");
                BufferedWriter buffer = new BufferedWriter(writer);
                
                writer.close();
                buffer.close();
                System.out.println("You have been successfully booked a hall!");
            }catch (IOException e)
            {      
                System.out.println("Write file filed!");
            }
        }
    }
}
