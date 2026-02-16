public abstract class BankAccount {

    private Integer accountNumber;
        private String ownerName;
        protected double balance;

public BankAccount(Integer accountNumber, String ownerName, double balance){
    this.balance=balance;
    this.ownerName=ownerName;
    this.accountNumber=accountNumber;
}

    public abstract void deposit(double amount);
    public abstract void withdraw(double amount) throws InsufficientBalanceException;

    public double getBalance() {
        return balance;
    }


    public  void printBalance(){
        System.out.println("Current balance: "+balance);
    }

}
