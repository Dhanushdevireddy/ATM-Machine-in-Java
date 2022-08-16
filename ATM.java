import java.util.Scanner;

public class ATM {
    public static void main(String args[]){
        int balance = 3000;//default balance
        int i = 0;
        Scanner scan = new Scanner(System.in);
        while (i == 0){
            System.out.print("Welcome to ATM\nChoose the required operation:\n1.Amout Withdrawal\n2.Amount Deposition\n3.Check Account Balance\nAny other number to Exit\nChoice: ");
            int choice = scan.nextInt();
            System.out.println();
            switch(choice) {
                case 1:
                System.out.print("Enter amount to be withdrawn:");
                int amount = scan.nextInt();
                if (amount > balance){
                    System.out.println("\nYour Account does not hold that much money.");
                }else{
                    balance = balance - amount;
                    System.out.println();
                    System.out.println(amount +" withdrawn");
                }
                System.out.println("Current Account Balance: " +balance);
                break;

                case 2 :
                System.out.print("Enter amount to be deposited:");
                int amountDeposit = scan.nextInt();
                balance = balance + amountDeposit;
                System.out.println();
                System.out.println(amountDeposit + " deposited");
                System.out.println("Current Account Balance: " +balance);
                break;

                case 3 :
                System.out.println();
                System.out.println("Current Account Balance: " +balance);
                break;

                default:
                i = i + 1;
                System.out.println("Thank You!!!!!!");
                break;
            }
        }
    }
}