public class Main {
    public static void main(String[] args) {

        BankAccount dave = new BankAccount();
        dave.setAccountNumber(1234567890);
        dave.setAccountBalance(100000);
        dave.setCustomerName("David Onyeka");
        dave.setPhone("+234 806 921 6406");
        dave.setEmailAddress("david@yahoo.com");
        dave.withdrawal(5000.89);
        dave.deposit(5000.967);
        dave.customerDetails();
    }
}