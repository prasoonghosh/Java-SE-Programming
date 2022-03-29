package Lab12;

class SavingsAccount extends Account  {
    public SavingsAccount(String Firstname, String Lastname, Branch b){
        this.FirstName= Firstname;
        this.LastName= Lastname;
        this.branch= b;
        this.AccounType=2;
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
        return this.getDescription() +" Saving Account balance is " + balance;
    }

}
