package Task3_1;

public class Main {
    public static void main(String[] args) {

        double pound=105.1;
        int g=(int) ((pound*453.6) %1000);
int kg=(int)((pound*0.4536)-g/1000);

        System.out.println("pound  :"+pound);
        System.out.println("kg  :"+kg);
        System.out.println("g  :"+g);

    }
}
