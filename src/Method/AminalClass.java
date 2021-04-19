package Method;

public class AminalClass {
    String name ="king";
    String breed ;
    int age=5;
    String color;

    AminalClass(){}

    AminalClass (String name){
        this.name=name;
    }
    AminalClass(String name,String color){
        this.name=name;
        this.color=color;
    }

    public  void  sleep(){

          age++;
        System.out.println("My pet " + name +" is sleeping");
        System.out.println("The breed of sleeping animal is " +breed );
        System.out.println(" My pets age is " +age);
    }


    }

