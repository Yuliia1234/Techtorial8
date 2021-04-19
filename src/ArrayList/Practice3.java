package ArrayList;

import java.util.ArrayList;

public class Practice3 {
    public static void main(String[] args) {

        ArrayList<String> city = new ArrayList<>();
        city.add("Chicago");
        city.add("New York");
        city.add("Miami");
        city.add("Washington");
        city.add(1, "Kansas");
        System.out.println(city);
        city.add(city.size() - 1, "Milwaukee");
        System.out.println(city);

        city.remove(0);
        System.out.println(city);
        city.remove("Miami");
        System.out.println(city);
        System.out.println(city.remove("Kansas"));//true
        System.out.println(city);//removing result

        city.set(1, "Maliby");
        System.out.println(city);
        city.set(city.indexOf("Washington"), "Toronto");
        System.out.println(city);
        System.out.println(city.isEmpty());//false

        city.add(0, "New York");
        System.out.println(city);

        city.remove("New York");//it remove only first match
        System.out.println(city);

        boolean a = city.contains("Maliby");
        System.out.println(a);

        ArrayList<String> states = new ArrayList<>();
        states.add("LA");
        states.add("IL");
        states.add("KS");
        System.out.println(states);

        states.addAll(city);
        System.out.println(states);

        city.remove(states);
        System.out.println(city);


    }
}
