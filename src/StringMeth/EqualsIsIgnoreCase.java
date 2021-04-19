package StringMeth;

public class EqualsIsIgnoreCase {
    public static void main(String[] args) {

        //Equals method
        String studentName ="Peter";
        String studentLastName = "Montero";

        System.out.println(studentName.equals(studentLastName));//false
        System.out.println(studentName.equals("Peter")); //true
        System.out.println(studentLastName.equals("Montero"));//true

        studentName=studentLastName;//reassigning
        System.out.println(studentLastName.equals(studentName));

        studentName+=studentName;//reassigning MonteroMontero
        System.out.println(studentName);
        System.out.println(studentLastName.equals(studentName));


        //equalsIgnoreCase -->only when you compare two value
        String str1 = "Java Is Easy to Learn";
        String str2 ="Java is EASY TO learn";

        System.out.println(str1.equalsIgnoreCase(str2));
        System.out.println(str1.equalsIgnoreCase(" Java is EASY TO learn "));
    //false because of the space at the beginning;
        str1=str1.toLowerCase();
        str2=str2.toLowerCase();
        System.out.println(str1.equalsIgnoreCase(str2));//true
    }
}
