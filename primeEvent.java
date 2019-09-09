import java.util.Scanner;

public class primeEvent {
	public static void main(String[] args){
		welcome();
		customer();
		owner();
		admin();
	}
	public static void welcome(){
		Scanner console = new Scanner(System.in);
		System.out.println("Welcome to Prime Event!");
		System.out.println("1. Log in");
		System.out.println("2. Register");
		System.out.println("3. Forget Password");
		System.out.println("Please enter 1, 2 or 3 to select：");
		int w=console.nextInt();
		if (w == 1) {
			System.out.println("Please enter your username(email)：");
			System.out.println("Please enter your password：");
			System.out.println("Press 0 to go back");
			}
		else if (w == 2) {
			System.out.println("Please enter your first name：");
			System.out.println("Please enter your last name：");
			System.out.println("Please enter your email：");
			System.out.println("Please enter your password：");
			System.out.println("Please confirm your password：");
			System.out.println("Please enter your phone number：");
			System.out.println("Please enter your address：");
			System.out.println("Please select if you are 1.Customer or 2. Owner");
			System.out.println("Press 0 to go back");
		}
		else if (w == 3) {
			System.out.println("Please enter your email：");
			System.out.println("Your new password has been sent to your email");
			System.out.println("Press 0 to go back");
		}
		
	}
	
	public static void customer(){
		Scanner console = new Scanner(System.in);
		System.out.println("1. View halls");
		System.out.println("2. Request for a quotation");
		System.out.println("3. Book a hall");
		System.out.println("4. Change a booking");
		System.out.println("5. Cancel a booking");
		System.out.println("6. Write a review");
		System.out.println("0. Go back");
		System.out.println("Please enter 0-6 to select：");
		int c=console.nextInt();
		if (c == 1) {
			System.out.println("1.View all halls");
			System.out.println("2.Search a hall");
			System.out.println("Press 0 to go back");
			System.out.println("Please enter 0-2 to select：");
			int h =console.nextInt();
			if (h==1) {
				System.out.println("Hall1,Anniversary,100 seats,130 City Road,$200/h,Available");
				System.out.println("Hall2,Birthday,50 seats,58 Dandenong Road,$100/h,Available");
				System.out.println("Hall3,Wedding Ceremony,300 seats,77 Swanston Road,$1000/h,Available");
				System.out.println("Hall4,Wedding Reception,20 seats,12 Collins Street,$50/h,Available");
				System.out.println("Press 0 to go back");
			}else if(h==2)
			{
				System.out.println("Please enter hall type to serch:");
				System.out.println("Press 0 to go back");
			}
		}
		else if (c == 2) {
			System.out.println("Please enter 1-4 to send request for a hall:");
			System.out.println("Press 0 to go back");
		}
		else if (c == 3) {
			System.out.println("Please enter 1-4 to book a hall:");
			System.out.println("Please enter your card number:");
			System.out.println("Please enter your PIN:");
			System.out.println("Please confirme to pay deposit by press enter");
			System.out.println("Press 0 to go back");
		}
		else if (c==4) {
			System.out.println("Your booking list is:");
			System.out.println("0001, Hall2, 02/09/2019, Paid, Accomplished");
			System.out.println("0002, Hall3, 05/09/2019, Deposit, Pending");
			System.out.println("Please select booking number(Pending booking) to change time:");
			System.out.println("Press 0 to go back");
		}
		else if(c==5) {
			System.out.println("Your booking list is:");
			System.out.println("0001, Hall2, 02/09/2019, Paid, Accomplished");
			System.out.println("0002, Hall3, 05/09/2019, Deposit, Pending");
			System.out.println("Please select booking number(Pending booking) to cancel booking:");
			System.out.println("Press 0 to go back");
		}
		else if(c==6) {
			System.out.println("Your booking list is:");
			System.out.println("0001, Hall2, 02/09/2019, Paid, Accomplished");
			System.out.println("0002, Hall3, 05/09/2019, Deposit, Pending");
			System.out.println("Please select booking number(Accomplishe booking) to write a review:");
			System.out.println("Press 0 to go back");
		}
	
	}
	
	public static void owner(){
		Scanner console = new Scanner(System.in);
		System.out.println("1. Create a hall");
		System.out.println("2. Update a hall");
		System.out.println("3. Delete a hall");
		System.out.println("4. Update a booking");
		System.out.println("5. Manage payments");
		System.out.println("6. Confirm a quotation");
		System.out.println("7. Confirm a refund");
		System.out.println("0. Go back");
		System.out.println("Please enter 0-7 to select：");
		int o=console.nextInt();
		if (o == 1) {
			System.out.println("Please enter your hall name:");
			System.out.println("Please enter your hall type:");
			System.out.println("Please enter your hall location:");
			System.out.println("Please enter your hall price per hour:");
			System.out.println("Please enter your hall size:");
			System.out.println("Please enter your hall availbility:");
			System.out.println("Please enter your hall catering choice:");
			System.out.println("Press 0 to go back");
		}
		else if (o == 2) {
			System.out.println("You hall list is: ");
			System.out.println("1.Hall1,Anniversary,100 seats,130 City Road,$200/h,Available");
			System.out.println("2.Hall2,Birthday,50 seats,58 Dandenong Road,$100/h,Available");
			System.out.println("Please select a hall to update:");
			System.out.println("Press 0 to go back");
		}
		else if (o == 3) {
			System.out.println("You hall list is: ");
			System.out.println("1.Hall1,Anniversary,100 seats,130 City Road,$200/h,Available");
			System.out.println("2.Hall2,Birthday,50 seats,58 Dandenong Road,$100/h,Available");
			System.out.println("Please select a hall to delete:");
			System.out.println("Press 0 to go back");
		}
		else if (o==4) {
			System.out.println("Your booking list is:");
			System.out.println("0001, Hall2, 02/09/2019, Paid, Accomplished");
			System.out.println("0002, Hall3, 05/09/2019, Deposit, Pending");
			System.out.println("Please select booking number(Pending booking) to uodate:");
			System.out.println("Press 0 to go back");
		}
		else if(o==5) {
			System.out.println("Your booking list is:");
			System.out.println("0001, Hall2, 02/09/2019, Paid, Accomplished");
			System.out.println("0002, Hall1, 05/09/2019, Deposit, Pending");
			System.out.println("Please select booking number(Pending booking) to manage:");
			System.out.println("Press 0 to go back");
		}
		else if(o==6) {
			System.out.println("Your quotation request list is:");
			System.out.println("0001, Hall2,02/09/2019, 100 people, catering included");
			System.out.println("0002, Hall1,05/09/2019, 20 people, catering excluded");
			System.out.println("Please select request number to send quotation:");
			System.out.println("Press 0 to go back");
		}
		else if(o==7) {
			System.out.println("Your refund request list is:");
			System.out.println("0001, Hall2,02/09/2019");
			System.out.println("0002, Hall1,05/09/2019");
			System.out.println("Please select request number to confirm refund:");
			System.out.println("Press 0 to go back");
		}
	
	}

	public static void admin(){
		Scanner console = new Scanner(System.in);
		System.out.println("1. Update a user");
		System.out.println("2. Add a user");
		System.out.println("3. Delete a user");
		System.out.println("4. Create discount");
		System.out.println("5. Remove dicount");
		System.out.println("0. Go back");
		System.out.println("Please enter 0-5 to select：");
		int a=console.nextInt();
		if (a==1) {
			System.out.println("User list is:");
			System.out.println("0001, user1" );
			System.out.println("0002, user2");
			System.out.println("Please select user number to update password:");
			System.out.println("Press 0 to go back");
		}
		else if (a==2) {
			System.out.println("Please enter user first name：");
			System.out.println("Please enter user last name：");
			System.out.println("Please enter user email：");
			System.out.println("Please enter user password：");
			System.out.println("Please confirm user password：");
			System.out.println("Please enter user phone number：");
			System.out.println("Please enter user address：");
			System.out.println("Please select if user is 1.Customer or 2. Owner");
			System.out.println("Press 0 to go back");
		}
		else if (a==3) {
			System.out.println("User list is:");
			System.out.println("0001, user1" );
			System.out.println("0002, user2");
			System.out.println("Please select user number to delete user:");
			System.out.println("Press 0 to go back");
		}
		else if (a==4) {
			System.out.println("1.Veterans 2.Senior citizens 3.Business partner");
			System.out.println("Please select customer type to create dicount:");
			System.out.println("Please enter discount rate：");
			System.out.println("Press 0 to go back");
		}
		else if (a==5) {
			System.out.println("Discount list is:");
			System.out.println("0001, Discount1, Veterans, 20%off" );
			System.out.println("0002, Discount2,Buiness partner,10% off");
			System.out.println("Please select discount number to remove discount:");
			System.out.println("Press 0 to go back");
		}
	}
  
}