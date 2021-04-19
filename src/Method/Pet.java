package Method;

public class Pet {
    String name;
    String color;
    int age;
   static int FoodAmount=20;//we will make it static so cats can share one box of food


    public int eat(int FoodEaten){
        FoodAmount-=FoodEaten;
        System.out.println("Over left food after feeding cat  " + FoodAmount + " lb");
        return FoodAmount;
    }

    public static void sleep (String name){//if you want to use variable in sout you have to mention this variable in parametr
        System.out.println(name + " is sleeping ");
    }

    public static void main(String[] args) {
        Pet cat1 =new Pet();
        cat1.color="Grey";
        cat1.eat(1);
        cat1.eat(1);
        System.out.println(cat1.color);
        System.out.println(cat1.FoodAmount);
        cat1.name="Tim";
        cat1.sleep(cat1.name);

        Pet cat2 = new Pet();
        System.out.println(cat2.FoodAmount);
        System.out.println(cat2.color);
        cat2.eat(1);
        cat2.eat(1);
        cat2.name="Jerry";
        cat2.sleep(cat2.name);


    }
}
