package Array;

import java.util.Arrays;

public class SplitMethod1 {
    public static void main(String[] args) {

        String text = "Spring, also known as springtime," +
                " is one of the four temperate seasons, succeeding winter " +
                "and preceding summer. There are various technical definitions of spring, " +
                "but local usage of the term varies according to local climate, cultures " +
                "and customs. When it is spring in the Northern Hemisphere, " +
                "it is autumn in the Southern Hemisphere and vice versa." +
                " At the spring (or vernal) equinox, days and nights are " +
                "approximately twelve hours long, with daytime length increasing " +
                "and nighttime length decreasing as the season progresses.";
        text = text.replace(",", "");
        text = text.replace(".", "");
        text = text.replace("(", "");
        text = text.replace(")", "");
        int count = 0;
        String[] splits = text.split(" ");
        System.out.println(Arrays.toString(splits));


        for (String a : splits) {
            a = a.trim();   System.out.println(a + " " + count);
            if (a.length() % 2 != 0) {
                System.out.println(a + "!");
                System.out.println(a.charAt(a.length()/2) + " Middle chars");
                count++;

            }


        }
        System.out.println("\n" + count);

    }
}
