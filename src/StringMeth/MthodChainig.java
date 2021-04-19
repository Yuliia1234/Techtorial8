package StringMeth;

public class MthodChainig {
    public static void main(String[] args) {

        String str = "just do it!";
        //just copy it!                           +if you can-->JUST COPY IT! IF YOU CAN-->COPY IT! IF YOU CAN
        System.out.println(str.replace("do","copy").concat("if you can")
                .toUpperCase().substring(5).length());//the end of result is integer

          String test = "  TEST   ";
        System.out.println(test.toLowerCase().replace(test.charAt(test.indexOf('E')), 'o').contains("es"));
        System.out.println(test.trim().substring(3).length());




    }
}
