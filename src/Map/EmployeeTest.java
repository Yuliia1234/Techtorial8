package Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class EmployeeTest {
    public static void main(String[] args) {


        //-create 4 employee object and store them in a map
        //        //-while storing employees in the map, use their ids
        //        //-create a method to print only employee names from map
        //        //-print all employee ids from map


        Map< Integer,Employee> employees = new HashMap<>();
        Employee set1 = new Employee("Julia", "Chicago", 24);
        Employee set2 = new Employee("Ivanka", "New York", 25);
        Employee set3 = new Employee("Diana", "Tampa", 24);
        Employee set4 = new Employee("Kristina", "Houston", 27);


        employees.put(set1.RandomID(),set1);
        employees.put(set2.RandomID(),set2);
        employees.put(set3.RandomID(),set3);
        employees.put(set4.RandomID(),set4);
        System.out.println(employees);

        for (Integer id : employees.keySet()){
            System.out.println(employees.get(id).city);




        }


    }
}