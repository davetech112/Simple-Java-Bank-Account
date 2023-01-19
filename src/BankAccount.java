public class BankAccount {
    private int accountNumber;
    private double accountBalance;
    private String customerName;
    private String emailAddress;
    private String phone;

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public String getPhone() {
        return phone;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void withdrawal(double amount) {

        if(amount > accountBalance) {
            System.out.println("Insufficient Balance");

        } else{
            accountBalance -= amount;
            System.out.println("Dear " + customerName + " you have successfully withdrawn " + amount +
                    " and current account balance is " + accountBalance);
        }
    }
    public void deposit(double amount) {
        accountBalance += amount;

        System.out.println("Dear " + customerName + " you have successfully deposited " + amount +
                " and current account balance is " + accountBalance);
    }

    public void customerDetails() {
        System.out.println("Dear " + customerName + " your account number is " + accountNumber +
                ", \nyour email address is " + emailAddress + ", \nphone number " + phone + ", \naccount balance " + accountBalance);
    }
}
