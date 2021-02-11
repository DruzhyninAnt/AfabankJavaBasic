package Practice5.Task5_3;

public class Main {
    public static void main(String[] args) {
        String s = new String("An information  system  is  designed  to  collect,  process, store and distribute information");
   int indBegin=s.indexOf(" ");
   int indLast=s.lastIndexOf(" ")+1;
        String begin=""+s.substring(0,indBegin);
        String last=""+s.substring(indLast);

        System.out.println(last+ " "+s.substring(indBegin,indLast) +" " +begin);
    }
}
