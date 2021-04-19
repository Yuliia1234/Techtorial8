package StringMeth;

public class ReplaceAndTrim {
    public static void main(String[] args) {

        String word ="Java";


        word=word.replace('J','L');
        System.out.println(word);

        System.out.println(word.replace("a","o"));
        System.out.println(word.replace('a','o'));//Lovo

        System.out.println(word.replace("La","ARA"));
        System.out.println(word.replace("Lava","Orange"));
        System.out.println(word.replace( 'v','7'));


        //=====================================================
        //Trim

        String str = "   I have three apples  ";
        System.out.println(str.trim());

        String str2 = "   toyota  ";
        System.out.println(str2.trim());
    }
}
