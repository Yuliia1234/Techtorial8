package Map;

import java.util.ArrayList;
import java.util.Random;

public class Employee {

        //-create an employee class with instance variables of name, city, age, id
        //-create one constructor to intialize instance variables
        //-create a method to generate random 6 digit employee id nad use this id for employeeId
        //-create employeeTest class
        //-create 4 employee object and store them in a map
        //-while storing employees in the map, use their ids
        //-create a method to print only employee names from map
        //-print all employee ids from map

        String name;
        String city;
        int age;
        int id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    Employee(String name, String city, int age){
            this.name=name;
            this.city=city;
            this.age=age;
            this.id=RandomID();
        }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", age=" + age +
                '}';
    }

    public int  RandomID(){

            int card = (int) (Math.random()*1000000);
           return card;

        }
    }

