package work24;



public class Task24 {
    public static void main(String[] args) {

        int number = 547;
    
        //   Способ 1 (только для трехзначных):
          
        int ed = number % 10;
             int des = number / 10 % 10;
                int sotni = number / 100;
             int res = ed * 100 + des * 10 + sotni;

        System.out.println("По способу 1 (только для трехзначных):"+number + "-" + res + "=" + (number - res));


        //   Способ 2 (для любых чисел без циклов) :

             StringBuffer stringBuilder = new StringBuffer(String.valueOf(number));

                int ch1 = Integer.parseInt(stringBuilder.reverse().toString());
        
        System.out.println("По способу 2 (для любых чисел) :"+number + "-" + ch1 + "=" + (number - ch1));


    }}
