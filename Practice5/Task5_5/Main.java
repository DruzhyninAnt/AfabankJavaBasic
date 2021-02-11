package Practice5.Task5_5;

public class Main {
    public static void main(String[] args) {
        String str1="7#111321A113 1@11#17";

        int index=0;

        while (index<str1.length()){
            if (str1.indexOf(str1.charAt(index))>=str1.lastIndexOf(str1.charAt(index))){
                System.out.print("'"+str1.charAt(index)+"' ");
            }
            index++;
        }
    }
}
