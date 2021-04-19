package Method;

import java.util.Random;

public class Person {

    String name="David";
    int age;
    String address;

    public int time() {
        Random random = new Random();
        int hours = random.nextInt(11);
        return hours;
    }
    public void study() {
        int hour = time();
        System.out.println(name + " is studying " + hour);
    }

    public void run() {
        int hour = time();
        System.out.println(name + " is running " + hour);
    }
    public void sleep(){
        int hour = time();
        System.out.println(name + " is sleeping " + hour);
    }

    public static void main(String[] args) {
        Person object1 = new Person();
        // object1.hours = 3;
        object1.study();
        object1.run();
        object1.sleep();

    }
}
