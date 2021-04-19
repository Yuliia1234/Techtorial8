package Set;

public class Flower {
    String first_flower ;
    String color ;

    public String getFirst_flower() {
        return first_flower;
    }

    public void setFirst_flower(String first_flower) {
        this.first_flower = first_flower;
    }



    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }



    Flower(String first_flower,String color){
        this.first_flower=first_flower;
        this.color= color;


    }
    public String toString() {
    return     first_flower+ " =  "
            + color;

    }

}
