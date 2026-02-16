public class SavingsAccount extends BankAccount{

    public SavingsAccount(Integer accountNumber, String ownerName, double balance) {
        super(accountNumber, ownerName, balance);
    }

    @Override
    public void deposit(double amount) {
        balance+=amount;
        printBalance();
    }

    @Override
    public void withdraw(double amount) throws InsufficientBalanceException {

        try{
            if(amount>balance){
                throw new InsufficientBalanceException("Insufficient balance");
            }
            balance-=amount;
            printBalance();

        }
        catch (InsufficientBalanceException ex){
            System.out.println(ex.getMessage());
        }



    }
}
