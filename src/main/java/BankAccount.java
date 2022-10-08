public class BankAccount {

    private int accountNumber;
    private double accountBalance;
    private String customerName;
    private String customerEmail;
    private String phoneNumber;

    public BankAccount(int accountNumber, double accountBalance, String customerName, String customerEmail, String phoneNumber) {
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
        this.customerName = customerName;
        this.customerEmail = customerEmail;
        this.phoneNumber = phoneNumber;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void depositFunds(double deposit){
        accountBalance += deposit;
        System.out.println("you deposited " + deposit + " your balance is " +  accountBalance);

    }

    public void withdrawFunds(double withdraw){
        accountBalance -= withdraw;
        if (this.accountBalance < 0){
            System.out.println("insufficient funds");
        } else {
            System.out.println("you withdrew " + withdraw + " your balance is " + accountBalance);
        }

    }
}
