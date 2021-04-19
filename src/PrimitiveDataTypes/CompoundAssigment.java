package PrimitiveDataTypes;

         public  class CompoundAssigment { //COMPOUND ASSIGMENTS
             public static void main (String[]args){
        byte num1=5;
        int num2 =  num1+10;///5+10 = 15;
        System.out.println(num2);
        num2 += num1;//+=--->open way num2 = num2+num1 (what we are doing :adding num1 to num2 ;)15+5
        System.out.println(num2);


        int car = 3;
        car+=2;
        System.out.println("My number of car " + car);
        car -= 1 ;
        System.out.println("My number of cars are " + car);
        car *=2;
        System.out.println("My number of cars are " + car);
        car /= 4;
        System.out.println("My number of cars are " + car);
        int remainder =car%2;
        System.out.println("Remainder " + remainder);
        car *= 2 ;
        System.out.println(car);

        short sh = 13;
        double db = 200.8;
        short sh1 =(short)(sh+db);//Castel


        short sh9=0;
        sh9 += db;///Casting is done automatically by java with compound assignment
        System.out.println(sh9);


        int k = 45;
        double db2 = 3.75;
        k+=db2;//or  k = (int)db2;
                     System.out.println(k);

    }
}
