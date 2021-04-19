package Method;

public class AnimalTest {
    public static void main(String[] args) {
        AminalClass pet1 = new AminalClass();
        pet1.name= "Yuma";
        System.out.println(pet1.name);//will print default name

        AminalClass pet2 =new AminalClass("Kiddo");
        System.out.println(pet2.name);
        System.out.println(pet2.color);
        System.out.println(pet2.breed);


        AminalClass pet3 = new AminalClass("Hoticco","White");
        System.out.println(pet3.color);
        pet3.breed="Domestic";
        System.out.println(pet3.breed);
        pet1.sleep();
        pet1.breed="Wild";
    }
}
