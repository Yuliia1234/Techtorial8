package Method;

public class EmployeeTest {


    public static void main(String[] args) {

        Employee.work(40);
        Employee person1 = new Employee();
        person1.name = "Jessica";
        person1.yearOfexperience = 5;
        person1.age = 26;

        Employee person2 = new Employee();
        Employee person3 = new Employee();
        person1 = null;
        System.gc();
    }
}
