import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        while (true) {
            System.out.println("Enter 1 for login");
            System.out.println("Enter 0 for Exit");
            Scanner sc = new Scanner(System.in);
            int c = sc.nextInt();
            if (c== 1) {
                ATM.login();
            }
            else if (c==0){
                break;
            }
            else {
                System.out.println("Invalid Input Please Try Again");
            }
        }
    }

    private static void login() {
        float Balance;
        Balance = 10000;
        String userid;
        String password;

        userid = "animesh123";
        password = "12345678";
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter User ID");
        String user = sc.nextLine();
        System.out.println("Please Enter PassWord");
        String pass = sc.nextLine();
        while (true) {
            if (user.equals(userid) && pass.equals(password)) {
                System.out.println("Please Enter 1 for Check Balance");
                System.out.println("Please Enter 2 for Deposit");
                System.out.println("Please Enter 3 for Withdraw");
                System.out.println("Please Enter 0 for Exit");
                int c = sc.nextInt();
                if (c == 2) {
                    System.out.println("Your Current Balance is :"+Balance);
                    System.out.println("Please Enter Amount to Deposit");
                    float add_bal = sc.nextFloat();
                    float new_bal = Balance + add_bal;
                    Balance= new_bal;
                    System.out.println("Your Updated Balance is : " + new_bal);
                }
                else if (c == 3) {
                    System.out.println("Your Current Balance is :"+Balance);
                    System.out.println("Please Enter Amount to Withdraw");
                    float add_bal2 = sc.nextFloat();
                    if (add_bal2 < Balance) {
                        float new_bal2 = Balance - add_bal2;
                        Balance= new_bal2;
                        System.out.println("Your Updated Balance is : " + new_bal2);
                    } else {
                        System.out.println("You have insufficient Amount");
                    }
                }
                else if(c==1) {
                    System.out.println("Your Current Balance is :"+Balance);
                }
                else if(c==0) {
                    break;
                }
                else {
                    System.out.println("Invalid Input");
                }
            } else {
                System.out.println("You have Enter Wrong ID or Password");
                login();
            }
        }
    }
}
