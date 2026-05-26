package Ex4FixacaoPOO.application;

public class Account {
    final private int account_number;
    public String account_holderName;
    private double account_balance;

    public Account(int account_number, String account_holderName){
        this.account_number = account_number;
        this.account_holderName = account_holderName;
        this.account_balance = 0;
    }

    public Account(int account_number, String account_holderName, double account_balance){
        this.account_number = account_number;
        this.account_holderName = account_holderName;
        this.account_balance = account_balance;
    }

    public int getAccount_number(){
        return account_number;
    }

    public String getAccount_holderName(){
        return account_holderName;
    }

    public void setAccount_holderName(String account_holderName){
        this.account_holderName = account_holderName;
    }

    public double getAccount_balance(){
        return account_balance;
    }

    public void accountDeposit(double depositQuantity){
        account_balance += depositQuantity;
    }

    public void accountWithdraw(double withdrawQuantity){
        account_balance -= withdrawQuantity;
    }


    public String toString() {
        return "\nAccount: " + account_number + ", Holder: " + account_holderName + ", Balance: $" + String.format("%.2f", account_balance);
    }
}
