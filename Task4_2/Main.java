package task42;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        String intput =sc.nextLine();
        String out;
        switch (intput){
            case "1": out="One"; break;
            case "2": out="Two"; break;
            case "3": out="Three"; break;
            case "4": out="Four"; break;
            case "5": out="Five"; break;
            case "6": out="Six"; break;
            case "7": out="Seven"; break;
            case "8": out="Eight"; break;
            case "9": out="Nine"; break;
            default:out= "Other";

        }
        System.out.println(out);
    }
}
