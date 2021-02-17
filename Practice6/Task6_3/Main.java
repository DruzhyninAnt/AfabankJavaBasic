package Practice6.Task6_3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        char result;
            Scanner scanner=new Scanner(System.in);
            System.out.println("Input your string: ");
        String input=scanner.nextLine();
            System.out.println("input the word's number: ");
            int num= scanner.nextInt();
        if(num<1) {
            System.out.println("нет слова с таким номером");

        } else {
            result=getFirstCharacterOfWord(input, num);
            if(result!=' ')
            System.out.println("The first letter of" + num + " word is: " + result);
        }
    }

    public static char getFirstCharacterOfWord(String str, int numberWord){

        char firstChar;
        int i=0;
        int j=-1;



                while (i < numberWord - 1) {

                    j = str.indexOf(" ", j + 1);

                    if (j == -1) {
                        System.out.println("нет слова с таким номером");
                        return firstChar = ' ';
                    }

                    i++;
                }


                return firstChar =  str.charAt(j + 1);

    }
}
