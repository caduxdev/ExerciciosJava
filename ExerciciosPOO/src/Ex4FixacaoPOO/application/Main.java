package Ex4FixacaoPOO.application;
import java.util.Scanner;
import Ex4FixacaoPOO.application.Account;

public class Main {

    void main(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter account number: ");
        int account_number = sc.nextInt();
        System.out.print("Enter account holder: ");
        sc.nextLine();
        String account_holderName = sc.nextLine();
        System.out.print("Is there na initial deposit (y/n)?");
        String depositOrNot = sc.nextLine();
        if (depositOrNot.equals("y")){
            System.out.print("Enter initial deposit value: ");
            double initalDeposit = sc.nextDouble();
            Account account;
            account = new Account(account_number, account_holderName, initalDeposit);
            System.out.println(account);

            System.out.print("Enter a deposit value: ");
            double deposit = sc.nextDouble();
            account.accountDeposit(deposit);
            System.out.println("Update Account data:");
            System.out.println(account);

            System.out.print("Enter a withdraw value: ");
            double withdraw = sc.nextDouble();
            account.accountWithdraw(withdraw);
            System.out.println("Update Account data:");
            System.out.println(account);
        }
        else{
            Account account;
            account = new Account(account_number, account_holderName);
            System.out.println(account);

            System.out.print("Enter a deposit value: ");
            double deposit = sc.nextDouble();
            account.accountDeposit(deposit);
            System.out.println("Update Account data:");
            System.out.println(account);

            System.out.print("Enter a withdraw value: ");
            double withdraw = sc.nextDouble();
            account.accountWithdraw(withdraw);
            System.out.println("Update Account data:");
            System.out.println(account);
        }
        sc.close();
    }

}
