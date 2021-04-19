package Switch;

public class SwitchPractice {
    public static void main(String[] args) {
        String str = "Luna";

        switch (str) {

            case "Alex":
                System.out.println("Given name is Alex");
                break;
            case "Luna":
                System.out.println("Given name is Luna");
                break;
            case "Jessi":
                System.out.println("Given name is Jessi");
                break;
            default:
                System.out.println("There is no such name");
                break;


        }
    }
}
