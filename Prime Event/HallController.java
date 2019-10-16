import java.util.ArrayList;
import java.io.*;
import java.util.Scanner;
import java.util.*;
import java.util.Random;
/**
 * Write a description of class HallController here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class HallController
{
    // instance variables - replace the example below with your own
    private ArrayList<Hall> halls;

    /**
     * Constructor for objects of class HallController
     */
    public HallController()
    {
        // initialise instance variables
        halls = new ArrayList<Hall>(10);
    }
    
    public HallController(ArrayList<Hall> newHalls)
    {
        halls = newHalls;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void readFile() //chnage void to STring and return something
    {
        String filename = ("halls.txt");
        try
        {
            FileReader inputFile = new FileReader(filename);
            try
            {
                Scanner parser = new Scanner(inputFile);
                while (parser.hasNextLine())
                {
                    //drivers.add(parser.next());
                    String[] hallValues = parser.nextLine().split(",");
                    String hallName = hallValues[0];
                    String hallAddr = hallValues[1];
                    String hallDesc = hallValues[2];
                    String hallFunction = hallValues[3];
                    String hallPrice = hallValues[4];
                    String hallSize = hallValues[5];
                    String hallAvailability = hallValues[6];

                    Hall hall = new Hall(hallName, hallAddr, hallDesc, hallFunction, Double.parseDouble(hallPrice), Double.parseDouble(hallSize), hallAvailability);
                    halls.add(hall);

                }
            }
            finally
            {
                System.out.println("Updating halls");
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
        
    
}
