package TernaryOperator;

public class TernaryOperator {
    public static void main(String[] args) {
        int a=5;
        int b= 6;
        int k= 10;

      int result =  b<a? k : 99;
      int result1 =  b>a? k : 99;

        System.out.println(result);
        System.out.println(result1);

        String result2 = k>b? "Hello" : "7";//line supposed to be the same data type(not necessary in println)
        System.out.println(result2);

        System.out.println(k>b? "Hello" : 7);//not necessary in println

       // int n= k< a ? k++ + b : b ++;//we can use one the method
        System.out.println(k<a ? k++ + b : b ++);

        System.out.println('A'!='A'? "Yes": "No");

        String str ="techtorial";

        String result5 =  str.contains("rial")? "Tech": "it's not matching ";
        System.out.println(result5);

        String result6=str.contains("**")? "Tech": "it's not matching ";
        System.out.println(result6);

        String result7 = a>b || k>a? "good example":"need to work on it";
        System.out.println(result7);
    }
}
