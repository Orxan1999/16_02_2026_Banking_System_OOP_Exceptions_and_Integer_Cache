public class SavingsAccount extends BankAccount{

    public SavingsAccount(Integer accountNumber, String ownerName, double balance) {
        super(accountNumber, ownerName, balance);
    }

    @Override
    public void deposit(double amount) {
        balance+=amount;
        System.out.println(toString());
    }

    @Override
    public void withdraw(double amount) throws InsufficientBalanceException {

        try{
            if(amount>balance){
                throw new InsufficientBalanceException("Insufficient balance");
            }
            balance-=amount;
        }
        catch (InsufficientBalanceException ex){
            System.out.println(ex.getMessage());
        }



    }
}
