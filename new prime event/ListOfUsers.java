import java.util.Scanner;
import java.io.*;
import java.util.ArrayList;
/**
 * Write a description of class ListOfUsers here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ListOfUsers
{
    // instance variables - replace the example below with your own
    public ArrayList<User> users;

    /**
     * Constructor for objects of class ListOfUsers
     */
    public ListOfUsers()
    {
        // initialise instance variables
        users = new ArrayList<User>(5);
    }
    
    public ListOfUsers(ArrayList<User> newUsers)
    {
        // initialise instance variables
        users = newUsers;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void addUser()
    {
        User racer = new User();
        users.add(new User());
    }
    
    public ArrayList<User> getListOfUsers()
    {
        return users;
    }
    
    public User getSpecificUser(int index) throws NullPointerException
    {
        return users.get(index);
    }
    
    public String getSpecificUsersName(int index) throws NullPointerException
    {
        return users.get(index).getFullName();
    }
    
    public void readFile() //chnage void to STring and return something
    {
        String filename = ("user.txt");
        try
        {
            FileReader inputFile = new FileReader(filename);
            try
            {
                Scanner parser = new Scanner(inputFile);
                while (parser.hasNextLine())
                {
                    //drivers.add(parser.next());
                    String[] userValues = parser.nextLine().split(",");
                    String fname = userValues[0];
                    String lname = userValues[1];
                    String email = userValues[2];
                    String phoneNo = userValues[3];
                    String address = userValues[4];
                    String type = userValues[5];
                    String passwd = userValues[6];
                    

                    User user = new User();
                    user.setFname(fname);
                    user.setLname(lname);
                    user.setEmail(email);
                    user.setPhone(phoneNo);
                    user.setAddress(address);
                    user.setType(Integer.parseInt(type));
                    user.setPasswd(passwd);

                    users.add(user);

                }
            }
            finally
            {
                System.out.println("Users being set up");
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
    
    public void writeFile(User user)
    {
        String filename = "user.txt";
        try
        {
            FileWriter writer = new FileWriter(filename, true);
            BufferedWriter bw = new BufferedWriter(writer);
            bw.write("\n" + user.getFname() + "," + user.getLname() + "," + user.getEmail() + "," + user.getPhoneNo() + "," + user.getAddress() + "," + user.getType()+ "," + user.getPasswd());
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
    
    public void login()
    {
        
    }
    
    
}
