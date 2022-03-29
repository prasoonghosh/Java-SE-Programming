package Lab12;

public class main {
    public static void main(String[] args) {
        Bank bank = new Bank();
        SavingsAccount SA1 =new SavingsAccount("Smith","Will",Branch.MUMBAI);
        SA1.deposit(20000);
        bank.addCustomer(SA1);

        bank.addCustomer(new CheckingAccount("Cooper","Bradly",Branch.BANGALORE));
        bank.addCustomer(new SavingsAccount("Simms","Jane",Branch.BOSTON));

        bank.generateReport();
        bank.getNumOfCustomers();

    }
}
