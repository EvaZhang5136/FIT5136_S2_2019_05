import java.util.Scanner;
import java.util.ArrayList;

public class Controller
{
    // instance variables - replace the example below with your own
    private ListOfBookings bookings;
    private ListOfUsers users;
    private ListOfHalls halls;
    private ListOfQuotations quotations;

    public Controller()
    {
        // initialise instance variables
        //x = 0;
    }

    public void welcome()
    {
        Scanner console = new Scanner(System.in);
        System.out.println("Welcome to Prime Event!");
        System.out.println("1. Log in");
        System.out.println("2. Register");
        System.out.println("3. Forget Password");
        System.out.println("Please enter 1, 2 or 3 to select：");
        int w = console.nextInt();
        if (w == 1) 
        {
            login();
        }
        else if (w == 2) 
        {
            register();
        }
        else if (w == 3) 
        {
            System.out.println("Please enter your email：");
            System.out.println("Your temporary password has been sent to your email to reset your new password.");
            System.out.println("Press 0 to go back");
        }
    } 
    
    public void login()
     {
         
     }
     
    public void register()
    {
        ArrayList<String> user = new ArrayList<>();
        Scanner console = new Scanner(System.in);
        System.out.println("Please enter your first name：");
        String fname = console.nextLine();
        user.add(0,fname);
        System.out.println("Please enter your last name：");
        String lname = console.nextLine();
        user.add(1,lname);
        System.out.println("Please enter your email：");
        String email = console.nextLine();
        user.add(2,email);
        System.out.println("Please enter your phone number：");
        String phoneNo = console.nextLine();
        user.add(3,phoneNo);
        System.out.println("Please enter your address：");
        String address = console.nextLine();
        user.add(4,address);
        System.out.println("Please enter 1,2 or 3 if you are 1.Customer 2. Owner 3.Administrator");
        int type = console.nextInt();
        while(type != 1 && type != 2 && type != 3)
        {
           System.out.println("Error!Please enter 1,2 or 3 if you are 1.Customer 2. Owner 3.Administrator");
           type = console.nextInt();
        }
        String typeS = Integer.toString(type);
        user.add(5,typeS);
        System.out.println("Please enter your password：");
        String passwd1 = console.next();
        System.out.println("Please confirm your password：");
        String passwd2 = console.next();
        while (!passwd1.equals(passwd2))
        {
            System.out.println("Your passwords entered are not same.");
            System.out.println("Please enter your password：");
            passwd1 = console.nextLine();
            System.out.println("Please confirm your password：");
            passwd2 = console.nextLine();
        }
        String passwd = passwd1;
        user.add(6,passwd);
        user.add("\n");
        users.writeFile(User user);//Not sure how to use this method.
    }
    
    public void bookHall()
    {
        bookings.readFile();
        //May be a list of quotations should be displayed here.
        //(Or the user cannot know which quotation to select)
        //But readFile Method doesn`t create an arraylist.
        System.out.println("Enter the number of quatation to book a hall.");
        System.out.println("Enter 0 to exit.");
        Scanner console = new Scanner(System.in);
        int quotation = console.nextInt();
        if(quotation == 0)
        {
            
        }
        else
        {
            System.out.println("Quotation " + quotation+ "has been selected");
            System.out.println("Please enter you card number to pay a deposit:");
            String cardNo = console.nextLine();
            System.out.println("Please enter you PIN:");
            int pin = console.nextInt();
            System.out.println("Transaction successful!");
            //bookingNo = new Timestamp(System.currentTimeMillis());
        }
    }
}
