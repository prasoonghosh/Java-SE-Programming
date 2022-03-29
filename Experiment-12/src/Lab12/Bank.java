package Lab12;

import java.util.ArrayList;
import java.util.List;

public class Bank implements BankOperations{

    private List<Account> AccountsList;
    static int NumOfCustomers;
    public Bank(){
        this.AccountsList= new ArrayList<>();
    }

    @Override
    public void addCustomer(Account A) {
        AccountsList.add(A);
        NumOfCustomers++;
    }

    @Override
    public int getNumOfCustomers() {
        return NumOfCustomers;
    }

    @Override
    public Account getCustomer(String Firstname) {
        for (Account a :AccountsList ){
            if (a.FirstName.equalsIgnoreCase(Firstname)){
                return a;
            }
        }
        return null;
    }

    @Override
    public void generateReport() {
        System.out.println("CUSTOMERS REPORT\n" +
                "================");
        for (Account a : AccountsList){
            System.out.println("Customer: "+ a.FirstName +", "+a.LastName+"\n"+"Branch "+ a.getBranch() +", "+
                    a.branch.getServiceLevel());
            if (a.AccounType==1)
                System.out.println("Checking Account balance is"+ a.balance);
            else if (a.AccounType==2)
                System.out.println("Saving Account balance is"+ a.balance);
        }
    }
}
