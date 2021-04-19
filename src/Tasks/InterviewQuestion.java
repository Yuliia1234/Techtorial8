package Tasks;

import java.util.Scanner;

public class InterviewQuestion {
    public static void main(String[] args) {
        //String we need to find numbers inside and do substraction or sum
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        // '0'<=and>='9'
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            String numbers="";
            boolean truu=true;
            if ('0' <= str.charAt(i) && str.charAt(i) <= '9') {
                numbers+=str.charAt(i);
                for (int k = i + 1; k < str.length(); k++) {
                    if ('0' <= str.charAt(k) && str.charAt(k) <= '9') {
                        numbers+=str.charAt(k);
                    }else{
                        break;
                    }
                }
                if(i-1>=0){
                    if (str.charAt(i-1)=='-'){
                        sum-=Integer.parseInt(numbers);
                        truu=false;
                    }
                }
                if(truu){
                    sum+=Integer.parseInt(numbers);}
            }
        }
        System.out.println(sum);
    }
}
