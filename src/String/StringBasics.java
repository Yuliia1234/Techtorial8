package String;

public class StringBasics {
    public static void main(String[] args) {

        String word = "Hello"; // first way of creating string
        String word2 = new String("value"); //second way of creating string

        System.out.println(word);
        System.out.println(word2);

        String name = "5";

        System.out.println("My name is " + name);
        System.out.println(name + " my name is " + word);

        int count = 18;
        int percent = 200;
        System.out.println(count + percent + word + name);
        System.out.println(count + percent +name +word );

        System.out.println(word +name+count+percent);
        System.out.println(word+name+(percent+count));
        System.out.println(word+name+("" + percent+count));




    }
}
