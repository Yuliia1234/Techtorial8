package InnerLoop;

public class BreakAContinue {
    public static void main(String[] args) {

        OUTER:
        for (int i = 0; i < 6; i++) {
            for (int k = 0; k < 10; k++) {

                System.out.println(k + " ");
                if (i == 2) {
                    break OUTER;//we will see count 2 time from 0 to 9

                }
            }
        }
        for (int i = 0; i < 8; i++) {

            if (i > 5 && i <=7) {
                continue;
            }
            System.out.println(i + "**");
        }

    }
}




