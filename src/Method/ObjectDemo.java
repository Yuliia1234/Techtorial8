package Method;

public class ObjectDemo {
    public static void main(String[] args) {
//type,name =new type
    }
}

class Pie {
    //field
    String kind;
    String ingredients;

    //constructor
    Pie() {
    }

    //methods
    void describe() {
        System.out.println("This is a " + kind + " pie ");
    }

    boolean changeIngredients(String newINredients) {
        ingredients = newINredients;
        return true;
    }


}