package Array.Tasks;

import java.util.Arrays;

public class Task6 {
    public static void main(String[] args) {
        //String [] names ={"Jake" ,"Nick", "David","Sara","Dominic}
        //outcome : jake@gmail.com

        String[] names = {"Jake", "Nick", "David", "Sara", " Dominic"};
        String[] emails = new String[names.length];
        int i = 0;
        for (String email : names) {
            emails[i] = (email.toLowerCase().concat("@gmail.com"));
            i++;
        }
        System.out.println(Arrays.toString(emails));
    }
}

