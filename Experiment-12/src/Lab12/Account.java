package Lab12;
//getBalance(), deposit(), withdraw(), and getDescription().
public class Account {
    public String FirstName;
    public String LastName;
    double balance;
    public Branch branch;
    public int AccounType;

    public String toString() {

        return "Current balance is " + balance;
    }

    public Branch getBranch() {

        return branch;
    }

}
