public class BankAccount {
    // Instance variables
    private int balance;
    private int accountNumber;
    private String preferredName;

    public BankAccount(int b, int an, String pn) {
        balance = b;
        accountNumber = an;
        preferredName = pn;
    }

    public int getBalance() {
        return balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public String getPreferredName() {
        return preferredName;
    }

    public void withdraw(int x) {
        balance-=x;

    }
    public void deposit(int x){
        balance+=x;

    }
    public void setPreferredName(String preferredName) {
        this.preferredName = preferredName;
    }

    public String toString() {
        return "BankAccount:" +
                "balance=" + balance +
                ", accountNumber=" + accountNumber +
                ", preferredName='" + preferredName;
    }
}