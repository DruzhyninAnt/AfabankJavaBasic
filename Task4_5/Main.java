package Task4_5;

public class Main {
    public static void main(String[] args) {
        System.out.println("*|  1  2  3  4  5  6  7  8  9");
        System.out.println("-----------------------------");
        int i=1;
        int j=1;
        while (i<10){
            System.out.print(i+"|");
            while (j<10){
               if(i*j<10) {
                   System.out.print("  " + i * j);
               } else System.out.print(" " + i * j);

                j++;
            }
            System.out.println("");
            i++;
            j=1;
        }
    }
}
