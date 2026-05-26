package Ex4FixacaoPOO.application;
import java.util.Scanner;
import Ex4FixacaoPOO.application.Account;

public class Main {

    void main(){
        Scanner sc = new Scanner(System.in);
        Account account;

        System.out.print("Enter account number: ");
        int account_number = sc.nextInt();
        System.out.print("Enter account holder: ");
        sc.nextLine();
        String account_holderName = sc.nextLine();
        System.out.print("Is there na initial deposit (yes/no)?");
        String depositOrNot = sc.nextLine();

        if (depositOrNot.equals("yes")){
            System.out.print("\nEnter initial deposit value: ");
            double initalDeposit = sc.nextDouble();
            account = new Account(account_number, account_holderName, initalDeposit);
            System.out.println(account);
        }
        else{
            account = new Account(account_number, account_holderName);
            System.out.println(account);
        }

        System.out.print("\nEnter a deposit value: ");
        double deposit = sc.nextDouble();
        account.accountDeposit(deposit);
        System.out.print("\nUpdate Account data:");
        System.out.println(account);

        System.out.print("\nEnter a withdraw value: ");
        double withdraw = sc.nextDouble();
        account.accountWithdraw(withdraw);
        System.out.print("\nUpdate Account data:");
        System.out.println(account);

        sc.close();
    }

}
