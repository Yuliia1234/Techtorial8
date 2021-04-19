package StringMeth;

public class Concat_Length {
    public static void main(String[] args) {
        String str = "school";
        System.out.println(str.concat("time"));

        String bookname = "Bussines";
        bookname =bookname.concat("Communication");
        System.out.println(bookname);
       //==================================================================

        System.out.println( bookname.length());
        int lengthOF = bookname.length();
        System.out.println(lengthOF);//cauting letters of the word =21 letters (BussinesCommunication)

         String word = "gsdcsgvuidfguv 45 0&&#%*&&";
        System.out.println(word.length());

    }
}
