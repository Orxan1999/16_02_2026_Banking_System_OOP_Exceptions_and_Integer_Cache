public class CurrentAccount extends BankAccount {
    public CurrentAccount(Integer accountNumber, String ownerName, double balance) {
        super(accountNumber, ownerName, balance);
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
        printBalance();
    }

    @Override
    public void withdraw(double amount) throws InsufficientBalanceException {

        try{
            if (balance - amount < -500) {
                throw new InsufficientBalanceException("Balance can't be less than -500");
            }
            balance -= amount;
            printBalance();
        }
        catch (InsufficientBalanceException ex){
            System.out.println(ex.getMessage());
        }

    }





}
