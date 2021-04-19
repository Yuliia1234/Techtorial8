package Method;

public class Employee {

    static String name;
    int age;
    String name_of_company = "Chase";
    int yearOfexperience;
    static double budgetOfCompany = 25000000;

    public static double work(double salary) {

        double result = budgetOfCompany - salary;
        System.out.println("Employee is working " + result);

        System.out.println("Employee name is " + name);
        return result;
    }
    protected void finalize(){

        System.out.println("*****");

           }

}
