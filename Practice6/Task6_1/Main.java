package Practice6.Task6_1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("A?: ");
        double a= Double.parseDouble(sc.nextLine());
        System.out.println("B?: ");
        double b= Double.parseDouble(sc.nextLine());
        System.out.println("C?: ");
        double c= Double.parseDouble(sc.nextLine());
        System.out.println(areaTriangle(a,b,c));

    }
    public  static double areaTriangle(double  a, double  b,  double  c){

        double p=(a+b+c)/2;
        double result=Math.sqrt(p*(p-a)*(p-b)*(p-c));


     return result;
    }


}
