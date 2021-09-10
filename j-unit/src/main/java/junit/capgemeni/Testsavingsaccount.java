package junit.capgemeni;

class IllegalBankTransactionException extends RuntimeException{

    public IllegalBankTransactionException(){
        super();
    }
    public IllegalBankTransactionException(String message){
        super(message);
    }

}
class InsufficientBalanceException extends RuntimeException{
    public InsufficientBalanceException(){
        super();
    }
    public InsufficientBalanceException(String msg){
        super(msg);
    }
}
class Testsavingsaccount{
    long id;
     double balance;
    double withdraw(double amount){
        if (amount>balance||balance==0){
            throw new InsufficientBalanceException("Insufficient Balance");
        }

        else if (amount<0)
            throw new IllegalBankTransactionException("Illegal Bank Transaction..!");
        else{
            this.balance-=amount;
            return  this.balance;
            }
    }
    double deposit(double amount){
        System.out.println("depositing amount");
        balance+=amount;
        return balance;
    }

    public double getBalance() {
        return balance;
    }
}
