import java.util.Scanner;
import java.io.*;
import java.util.ArrayList;
/**
 * Write a description of class ListOfQuattions here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ListOfQuotations
{
    // instance variables - replace the example below with your own
    private ArrayList<Quotation> quotations;

    /**
     * Constructor for objects of class ListOfQuattions
     */
    public ListOfQuotations()
    {
        // initialise instance variables
        quotations = new ArrayList<Quotation>(5);
    }

    public ListOfQuotations(ArrayList<Quotation> newQuotations)
    {
        // initialise instance variables
        quotations = newQuotations;
    }

    public void addQuotation()
    {
        //Quotation racer = new Quotation();
        //racer.add(new Quotation());

    }

    public ArrayList<Quotation> getListOfQuotations()
    {
        return quotations;
    }

    public Quotation getSpecificQuotation(int index) throws NullPointerException
    {
        return quotations.get(index);
    }

    public String getSpecificQuotationsName(int index) throws NullPointerException
    {
        return quotations.get(index).getName();
    }

    public void readFile() //chnage void to STring and return something
    {
        String filename = ("quotations.txt");
        try
        {
            FileReader inputFile = new FileReader(filename);
            try
            {
                Scanner parser = new Scanner(inputFile);
                while (parser.hasNextLine())
                {
                    //drivers.add(parser.next());
                    String[] quotationValues = parser.nextLine().split(",");
                    //String bookingNo = bookingValues[0];
                    String name = quotationValues[0];
                    String date = quotationValues[1];
                    String time = quotationValues[2];
                    String catering = quotationValues[3];
                    String price = quotationValues[4];

                    Quotation quotation = new Quotation();
                    //booking.setBookingNo(bookingNo);
                    quotation.setName(name);
                    quotation.setDate(date);
                    quotation.setTime(time);
                    quotation.setCatering(Boolean.parseBoolean(catering));
                    //Plz check change String to boolean value--setCatering() is right or not?
                    quotation.setPrice(Integer.parseInt(price));

                    quotations.add(quotation);

                }
            }
            finally
            {
                System.out.println("Quotations being set up");
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
    public void writeFile(Quotation quotation)
    {
        String filename = "Quotations.txt";
        try
        {
            FileWriter writer = new FileWriter(filename, true);
            BufferedWriter bw = new BufferedWriter(writer);
            bw.write("\n" + quotation.getName() + "," + quotation.getDate() + "," + quotation.getTime());
            //bw.write() need to add boolean value getCatering() and int value getPrice()
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
