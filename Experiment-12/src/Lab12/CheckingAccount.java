package Lab12;

public class CheckingAccount extends Account  {
    public CheckingAccount(String Firstname, String Lastname, Branch b){
        this.FirstName= Firstname;
        this.LastName= Lastname;
        this.branch= b;
        this.AccounType=1;
    }



    public String getDescription(){
        return "Customer: "
                + LastName + ", "
                + FirstName
                + "\nBranch: " + branch + ", "
                + branch.getServiceLevel();
    }

    public double getBalance(){
        return balance;
    }
    public void deposit(double amount) {
        balance += amount;
    }
    public  void  withdraw(double amount){
        balance -=amount;
    }

    public String toString() {
        return this.getDescription() +"Checking Account balance is " + balance;
    }

}
