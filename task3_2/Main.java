package task3_2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double percent=12.0;
        double deposit;
        double month;
        Scanner scanner=new Scanner(System.in);
        System.out.println("How much (money)? :");
        deposit = Double.parseDouble(scanner.nextLine());
        System.out.println("How long (month) ?: ");
         month =Double.parseDouble( scanner.nextLine());
      //  System.out.println("one day's percent :"+percent);
        System.out.println("you'll earn approximately "+ deposit*percent*30*month/100/365 +" usd");

    }
}
