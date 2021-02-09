package Task4_4;

public class Main {
    public static void main(String[] args) {

        int i=1;
        int j=0;

       outer: while (i<=300){
            if(i%3==0||i%4==0){
                System.out.println(i);
                j++;
                if (j==10) break outer;
            }
            i++;
        }

    }


}
