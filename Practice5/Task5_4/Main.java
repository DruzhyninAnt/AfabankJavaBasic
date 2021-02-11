package Practice5.Task5_4;

public class Main {
    public static void main(String[] args) {
        String str1="Cartoon";
        String str2="Tomcat";

        int ind=0;
        while (ind<str1.length()){
            if (str2.indexOf(str1.charAt(ind))==-1)
            {System.out.print(""+str1.charAt(ind));}

            ind++;
        }
    }
}
