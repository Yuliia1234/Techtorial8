package Map;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class StudentInfoTask {
    public static void main(String[] args) {
        //How to Store map inside of a ArrayList.
        // -Create a StudentInfo class and store these data in a List of Maps.
        // -Find all students from Chicago and print their First and Last Names
        //  --Create HashMap to store each students information
        //  --Add all students to the ArrayList.
        //  --iterate over ArrayList to reach out each student and check its City

        HashMap<String, String> student = new HashMap<>();
        HashMap<String, String> student1 = new HashMap<>();
        HashMap<String, String> student2 = new HashMap<>();
        HashMap<String, String> student3 = new HashMap<>();


        student2.put("First Name", "Michael");
        student2.put("Last Name", "White");
        student2.put("Age", "35");
        student2.put("Gender", "M");
        student2.put("City", "Winnetka");

        student1.put("First Name", "Jeremiah");
        student1.put("Last Name", "Michaelson");
        student1.put("Age", "15");
        student1.put("Gender", "M");
        student1.put("City", "HighPark");

        student3.put("First Name", "Sarah");
        student3.put("Last Name", "Star");
        student3.put("Age", "29");
        student3.put("Gender", "F");
        student3.put("City", "Chicago");

        student.put("First Name", "David");
        student.put("Last Name", "Pena");
        student.put("Gender", "M");
        student.put("Age", "25");
        student.put("City", "Chicago");


        ArrayList<HashMap<String, String>> listOfValues = new ArrayList();

        listOfValues.add(student);
        listOfValues.add(student1);
        listOfValues.add(student2);
        listOfValues.add(student3);


        for (HashMap<String, String> st : listOfValues) {

            if (st.get("City").equalsIgnoreCase("chicago")) {
                System.out.println(st.get("First Name") + "-----" + st.get("Last Name"));


            }
            if (Integer.valueOf(st.get("Age")) < 20) {
                System.out.println(st);
            }

        }
    }


}

