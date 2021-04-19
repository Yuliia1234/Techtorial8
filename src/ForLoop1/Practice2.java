package ForLoop1;

public class Practice2 {
    public static void main(String[] args) {
        //I want to count letter'a and 'A in a given string


        String word ="I Want to solve this question by myself today,OKAY!";
        int count = 0;
        for(int i = 0;i<word.length(); i++){


            if(word.charAt(i)=='a' || word.charAt(i)=='A'){

                count++;
            }
        }
        System.out.println("Total count : "+ count);


    }
}
