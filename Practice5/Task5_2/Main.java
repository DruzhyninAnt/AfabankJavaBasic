package Practice5.Task5_2;

public class Main {
    public static void main(String[] args) {
        String s=new String("National Aviation University");
        System.out.print(""+s.charAt(0)+s.charAt(s.indexOf(" ")+1)+s.charAt(s.lastIndexOf(" ")+1));

    }
}
