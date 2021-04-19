package ArrayList;

import java.util.ArrayList;

public class Practice {
    public static void main(String[] args) {

        ArrayList al1 = new ArrayList();

        ArrayList al2 = new ArrayList(10);

        ArrayList<Integer> al3 = new ArrayList<>();


        al3.add(10);
        al3.add(20);
        al3.add(30);
        System.out.println(al3.size());// it will return size of ArrayList
        System.out.println(al3.get(1));// it will return the value at the first index
        // System.out.println(al3.get(30)); it will return IndexOutOfBoundsException
        al3.add(3, 40);
        System.out.println(al3.size());
        //al3.add(30,100); >> it will return IndexOutOfBoundsException
        //System.out.println(al3.size());
        System.out.println("********************");
        System.out.println(al3);


        ArrayList<String> studentNames = new ArrayList<>();
        studentNames.add("Dinara");
        studentNames.add("Nara");
        studentNames.add("David");
        studentNames.add("Michael");
        studentNames.add("Jessica");


        for (String name : studentNames) {
            System.out.println(name);
        }
//*********************************************************

        for (int i = 0; i < al3.size(); i++) {
            System.out.println(al3.get(i));
        }
    }
}
