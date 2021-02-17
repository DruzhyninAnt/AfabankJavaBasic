package Practice6.Task6_2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("input the number: ");

        System.out.println("Last two digits reverse is:"+ latestDigit(scanner.nextInt()));

    }
    public static String latestDigit(int number){


        String numToStr= String.valueOf(number);

        StringBuffer sb=new StringBuffer(numToStr);
        sb.reverse();
        sb.setLength(2);
        String lastDigits=sb.toString();

        return lastDigits;
    }
}
