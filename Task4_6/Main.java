package Task4_6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print ("Введите целое число: ");
        String input=new Scanner(System.in).nextLine();
        int length=input.length();
        int i=0;
        int sum=0;
    while (i<length){
        int temp=Integer.parseInt(String.valueOf(input.charAt(i)));

        sum=temp*temp+sum;
        i++;
    }
        System.out.println("Сумма квадратов цифр введенного числа: "+sum);
    }
}
