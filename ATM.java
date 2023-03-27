import java.util.Scanner;
public class ATM {
    static int balance = 10000;
    private static void Login() {
        String Username;
        String Password;

        Username = "animesh";
        Password = "1234";

        Scanner input1 = new Scanner(System.in);
        System.out.println("Enter Username : ");
        String username = input1.next();

        Scanner input2 = new Scanner(System.in);
        System.out.println("Enter Password : ");
        String password = input2.next();

        if (username.equals(Username) && password.equals(Password)) {

            System.out.println("Welcome! You are successfully Logged In");
        }
        else {
            System.out.println("Invalid Username & Password!");
        }
    }
    private static void Withdraw() {
        int amount;
        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter Amount to Withdraw : ");
        amount = input.nextInt();
        if (amount<balance) {
            int new_balance = balance - amount;
            System.out.println("Your Current Balance is :" + new_balance);
        }
        else {
            System.out.println("Please Enter amount below :"+balance);
        }
    }
    private static void Deposit() {
        int amount;
        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter Amount to Deposit : ");
        amount = input.nextInt();
        int new_balance = balance + amount;
        System.out.println("Your Current Balance is :" + new_balance);
    }
    public static void main(String[] args) {
        while (true) {
            System.out.println("Press 1 for log in");
            System.out.println("Press 2 for withdraw");
            System.out.println("press 3 for deposit");
            Scanner input = new Scanner(System.in);
            int c = input.nextInt();

            if (c==1) {
                ATM.Login();
            }
            else if (c==2) {
                ATM.Withdraw();
            }
            else if (c==3) {
                ATM.Deposit();
            }
            else {
                System.out.println("Please Try Again");
            }
        }
    }
}
