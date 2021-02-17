package Practice6.Task6_5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Введите этажность пирамиды от 1 до 9: ");
        int count=scanner.nextInt();
        if (count>=1|count<=9){
        printPyramid(count);
        }else {
            System.out.println("Вы ввели неправильное число");
        }




    }
    public  static void printPyramid(int  height){
        String base="123456789";
        String base2="987654321";
        String outp;
        int i=0;

        while (height>0){

            System.out.println(" ".repeat(height-1) +base.substring(0,i)+base2.substring(8-i)+" ".repeat(height-1));
            height--;
            i++;
        }
    }

}
