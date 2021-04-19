package HomeWork;

public class HomeworkTrueTable {
    public static void main(String[] args) {
        double average_of_attend = 85;
        double Max_attend = 80;
        double first_score =65;
        double second_score = 72;
        double third_score = 80;
        double Max_score = 65;

        double first_class = 0.20 * first_score;
        double second_class = 0.30 * second_score;
        double third_class =0.50 * third_score;

        double average_of_score = (first_class+second_class+third_class) ;
        System.out.println(average_of_score);




        boolean able_toPass_the_class = average_of_score >= Max_score && average_of_attend >= Max_attend;
        System.out.println(" Can I pass the class " + able_toPass_the_class);



    }
}
