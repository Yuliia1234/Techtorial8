package FirstJava;

public class Method {
    public void newMethod(){
        int num =53875;
        int firstNum = num % 10; // 6
        num = num / 10;// 5387

        int secondNum = num % 10; // 7
        num = num / 10;// 538

        int thirdNum = num % 10;// 8
        num = num / 10; //53

        int fourthNum = num % 10;//3
        num = num / 10; //5

        int fifthNum = num ;// 5
        int result = firstNum * 10000 + secondNum * 1000 + thirdNum * 100 + fourthNum * 10 + fifthNum *1 ;
        System.out.println(result);
    }
}
