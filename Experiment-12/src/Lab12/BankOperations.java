package Lab12;

public interface BankOperations {
    //  addCustomer(),
//getNumOfCustomers(), and getCustomer()
    void addCustomer(Account a);
    int getNumOfCustomers();
    Account getCustomer(String Firstname);
    void generateReport();

}
