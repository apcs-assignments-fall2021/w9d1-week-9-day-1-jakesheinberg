import java.util.Scanner;

public class BankClient {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("What is your preferred name?");
        String name = scan.nextLine();
        BankAccount account = new BankAccount(1000000, 101134, name);
        System.out.println("account number is" + account.getAccountNumber());
        System.out.println("your name is " + account.getPreferredName());
        System.out.println("your balance is " + account.getBalance());
    }
}
