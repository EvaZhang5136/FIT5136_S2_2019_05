import java.util.Scanner;
import java.util.ArrayList;
import java.io.*;
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
        users = new ListOfUsers();
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
            logIn();
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

    public void logIn()
    {
        Scanner console = new Scanner(System.in);
        System.out.println("Please enter email address: ");
        String email = console.nextLine();
        for(int i =0; i<5; i++){ //What is the range of i?
            if(!email.equals(users.users.get(i).getEmail()))//Something wrong...
            {System.out.println("Please go to register!");
                register();
            }
            else{
                System.out.println("Please enter your password:");
                String passwd = console.nextLine();
                if (!passwd.equals(users.users.get(i).getPasswd()))
                {System.out.println("Wrong password!");
                    passwd = console.nextLine();}
                else{
                    System.out.println("Log in successful!");
                }
            }
        }
        for(int a = 0; a<3; a++)
            if(users.users.get(a).getType() == 1){
                System.out.println("1. View halls");
                System.out.println("2. Select a hall");
                System.out.println("3. Book a hall");
                System.out.println("4. Request for a quotation");
                System.out.println("5. View a booking");
                System.out.println("6. Change a booking");
                System.out.println("7. Cancel a booking");
                System.out.println("8. Write a review");
                System.out.println("Please enter 1-8 to select：");
            }
            else if(users.users.get(a).getType() == 2){
                System.out.println("1. Create a hall");
                System.out.println("2. Update a hall");
                System.out.println("3. Delete a hall");
                System.out.println("4. Update a booking");
                System.out.println("5. View a booking");
                System.out.println("6. Add discount");
                System.out.println("7. Remove discount");
                System.out.println("8. Manage payments");
                System.out.println("9. Confirm a quotation");
                System.out.println("10. Delete a quotation");
                System.out.println("11. Confirm a refund");
                System.out.println("12. Print receipt");
                System.out.println("Please enter 1-12 to select：");
            }
            else if(users.users.get(a).getType() == 3){
                System.out.println("1. Add users");
                System.out.println("2. Update users");
                System.out.println("3. Delete users");
                System.out.println("4. Reset password");
                System.out.println("5. Add discount");
                System.out.println("6. Delete discount");
                System.out.println("7. Identify password");
                System.out.println("8. Identify roles");
                System.out.println("Please enter 1-8 to select：");  
            }
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
        //users.writeFile(User user);//Not sure how to use this method.
    }

    public void logOut()
    {
        Scanner console = new Scanner(System.in);
        System.out.println("Are you sure to log out? \n 1: Continue to log out; \n 2: Back to last step.");
        System.out.println("Please enter 1-2 to continue.");
        int o=console.nextInt();
        if (o == 1){
            System.out.println("See ya~~~");

        }
        else if (o == 2){
            System.out.println("Page will auto jump back to view halls...");

        }

    }
    
    public void requestQuotation()
    {}

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