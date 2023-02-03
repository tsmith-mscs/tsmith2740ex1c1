import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        int acctNumber = 1234;
        String firstName = "John";
        String lastName = "Doe";
        int monthlyIncome = 1000;



        Scanner sc = new Scanner(System.in);

        int Rent = 550;

        System.out.println("Acct#: " + acctNumber );
        System.out.println("First name: " + firstName);
        System.out.println("Last name: " + lastName);
        System.out.println("Monthly income: " + monthlyIncome);
        System.out.println("Rent: " + Rent);
        System.out.print("Electric: ");
        int electric = sc.nextInt();
        System.out.print("Gas: ");
        int gas = sc.nextInt();
        System.out.print("Cable: ");
        int cable = sc.nextInt();
        int totalExpenses = (Rent + electric + gas + cable);
        int finalMoney = (monthlyIncome - totalExpenses);
        System.out.println();
        System.out.println("Account: " +        acctNumber + " " + firstName + " " + lastName  );
        System.out.println("Income - expenses: " +        "$"+monthlyIncome + " - " + "$"+totalExpenses + " = " +"$"+finalMoney  );

    }
}
