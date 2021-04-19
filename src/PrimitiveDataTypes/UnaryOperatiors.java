package PrimitiveDataTypes;

public class UnaryOperatiors {
    public static void main(String[]args){
        int studentNumber = 14;
        studentNumber = studentNumber+1 ;
        System.out.println(studentNumber);

        studentNumber+=1;//16
        System.out.println(studentNumber);

        studentNumber ++; //17
        System.out.println(studentNumber);
        System.out.println(studentNumber++);//We increase to 18 but we didn't asing to any value .
        //int a =studentNumber;-->here we asigned the int but we can run even with sout
       // System.out.println(a);
        System.out.println(++studentNumber);//19
        System.out.println("=================================================");


        int age=25;
        age = age -1;//age is 24
        age -= 1;///Compound assignment //age is 23
        System.out.println(age);
        age --;
        System.out.println(age);
        System.out.println(age--);// Printing as 22 and then decreasing .age is 21
        System.out.println(--age);// deacreasing age by one and then printing as 20
        System.out.println(--age + --age);//19+18=37

        int k = age++;
        System.out.println(k);
        System.out.println("+++++++++++++++++");

        k=k+(k++);
        System.out.println(k);
       //========================================================

        age = age++ + age++;
        System.out.println(age);


    }
}
