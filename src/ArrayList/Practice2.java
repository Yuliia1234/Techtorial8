package ArrayList;

import java.util.ArrayList;

public class Practice2 {
    public static void main(String[] args) {


        //===TASK===
//-Create an ArrayList that will store 5 fruit names
//-Print out stored values by using traditional For Loop
        //Create one method named as "printFruits"
        //-takes an ArrayList<String> as parameter
        //-prints only elements that has 5 or more characters

        ArrayList<String> fruit = new ArrayList<String>(5);
        fruit.add("orange");
        fruit.add("apple");
        fruit.add("strawberry");
        fruit.add("peach");
        fruit.add("kivi");
        System.out.println(fruit.size());
        System.out.println(fruit);


        for (int i = 0; i < fruit.size(); i++) {
            System.out.println(fruit.get(i));
            System.out.println("//////////////////");
        }
        printFruits(fruit);
    }
    public static void printFruits(ArrayList<String> name){

        for (int i = 0; i <name.size() ; i++) {
            if (name.get(i).length() >=5){
                System.out.println(name.get(i));
            }


        }



    }
}