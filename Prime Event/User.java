import java.util.Scanner;
import java.io.*;
import java.util.ArrayList;

public class User
{
    private String fname;
    private String lname;
    private String email;
    private String phoneNo;
    private String address;
    private int type;
    private String passwd;
    
    public User()
    {
        String fname = "";
        String lname = "";
        String email = "";
        String phoneNo = "";
        String address = "";
        int type = 1;//1.Customer 2.Owner 3.Admin
        String passwd = "";
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
        fname = console.nextLine();
        user.add(0,fname);
        System.out.println("Please enter your last name：");
        lname = console.nextLine();
        user.add(1,lname);
        System.out.println("Please enter your email：");
        email = console.nextLine();
        user.add(2,email);
        System.out.println("Please enter your phone number：");
        phoneNo = console.nextLine();
        user.add(3,phoneNo);
        System.out.println("Please enter your address：");
        address = console.nextLine();
        user.add(4,address);
        System.out.println("Please enter 1,2 or 3 if you are 1.Customer 2. Owner 3.Administrator");
        type = console.nextInt();
        while(type != 1 || type != 2 || type != 3)
        {
           System.out.println("Error!Please enter 1,2 or 3 if you are 1.Customer 2. Owner 3.Administrator");
           type = console.nextInt();
           //Always error!
        }
        String typeS = Integer.toString(type);
        user.add(5,typeS);
        System.out.println("Please enter your password：");
        passwd = console.nextLine();
        System.out.println("Please confirm your password：");
        String passwd2 = console.nextLine();
        //Always come out at the same time
        while (!passwd.equals(passwd2))
        {
            System.out.println("Your passwords entered are not same.");
            System.out.println("Please enter your password：");
            passwd = console.nextLine();
            System.out.println("Please confirm your password：");
            passwd2 = console.nextLine();
        }
        user.add(6,passwd);
        user.add("\n");
        System.out.println(user);
        try
        {
            FileWriter writer = new FileWriter("user.txt");
            BufferedWriter buffer = new BufferedWriter(writer);
            for(String str: user)
            {
                writer.write(str.join(","));
                //The arraylist can be printed correctly.
                //But append nothing to the file.
            }
            writer.close();
            buffer.close();
            System.out.println("Registeration successfully");
        }catch (IOException e)
        {      
            System.out.println("Write file filed!");
        }
    }
}
