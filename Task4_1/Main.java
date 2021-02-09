package work41;

public class Main
{
    public static void main(String[] args) {

        int val1=1000;
        int val2=220;
        int val3=50006;
        int max=val1;
      max=  (max > val2)? max :val2;
max=(max>val3)?max:val3;
      System.out.println(max);
    }
}
