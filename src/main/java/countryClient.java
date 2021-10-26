import java.util.Scanner;

public class countryClient {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("What the countries name?");
        String name = scan.nextLine();
        country account = new country(10000, name);
        System.out.println("your countries name is " + account.getName());
        System.out.println("your population is " + account.getPopulation());
    }
}

