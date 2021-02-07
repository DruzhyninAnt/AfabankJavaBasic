package task3_2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double percent=12.0;
        double deposit;
        double month;
        // прибыль по депозиту  рассчитывается по формуле: прибыль_по_депозиту= ((ставка_годовая_в_процентах/100)*размер_депозита/365)*30*количество_месяцев
        Scanner scanner=new Scanner(System.in);
        System.out.println("How much (money, USD)? :");
        deposit = Double.parseDouble(scanner.nextLine());
        System.out.println("How long (month) ?: ");
         month =Double.parseDouble( scanner.nextLine());
      
        System.out.println("you'll earn approximately "+ deposit*percent*30*month/100/365 +" usd");

    }
}
