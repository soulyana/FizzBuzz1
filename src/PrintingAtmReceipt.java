import java.util.Scanner;


public class PrintingAtmReceipt {
    public static void main(String[] args) {
        String name, type;
        int acctNum;
        double amount, balance;

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter account number: ");
        acctNum = scan.nextInt();

        scan.nextLine();

        System.out.print("Enter customer name: ");
        name = scan.nextLine();

        System.out.print("Enter Transaction Type: ");
        type = scan.next();

        System.out.print("Enter transaction amount: ");
        amount = scan.nextDouble();

        System.out.print("Enter account balance: ");
        balance = scan.nextDouble();

        String leftAlignFormat = "| %-15s | %-4d |%n";

    System.out.println("+--------------------------------------+");
    System.out.format("|%-40s|%n","      Java Bank ATM Receipt");
    System.out.format("|%-40s|%n","      Wednesday, December 2, 2015");
    System.out.format("|%-40s|%n","      ATM Location # 123");
    System.out.format("|%-40s|%n"," ");
    System.out.format("|%-40s|%n"," ");
    System.out.format("|%-40s|%n","      Account Number:           " + acctNum);
    System.out.format("|%-40s|%n","      Customer:          "   + name);
    System.out.format("|%-40s|%n","      Transaction Type:       " +type);
    System.out.format("|%-40s|%n","      Transaction Amount:      "+"$"+amount);
    System.out.format("|%-40s|%n","      Account Balance:        " +"$"+balance);
    System.out.format("|%-40s|%n"," ");
    System.out.format("|%-40s|%n","      Thank you for banking with us");
    System.out.format("|%-40s|%n","            Have a coffee day");
    System.out.println("+--------------------------------------+");
    }
}