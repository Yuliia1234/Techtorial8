package WrapperClasses;

public class Student {
    // Create a new class named as >> Student
// In this Student class, create only one field called name variable/field
// In this Student class, create a constructor to initialize the name field
 //In this Student class, override toString() method to return following outcome >>  "Student name is <Name of the student>"
 //In this Student class, override finalize method to make sure Garbage collection method will run
// in main method, create multiple object and initialize student names for each object
 //make one or more object as null or not pointing to any object
 //Call Garbage Collector at the end to make sure that unused objects went to garbage}
    String name;
    public Student(String name) {
        this.name = name;
    }
    public String toString() {
        System.out.println("Student name is " + name);
        return "Student name is " + name;
    }


    protected void finalize() {
        System.out.println("Finalize method will work as same number of objects that goes to garbage");
    }

    public static void main(String[] args) {
        Student student1 = new Student("Michael");
        Student student2 = new Student("Sura");
        student1.finalize();
        student2.toString();
        student1.toString();
        Student student3 = student1;
        student1=null;
        student3=null;
        student2=null;
        System.gc();
    }
    }

