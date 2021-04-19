package Tasks;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        //Input date in format MM/DD/YYYY
        //
        //TimeFrame 5 years, it should be able to identify any date within 5 years correct week day
        //Input 03/07/2021
        //Output : Sunday
        Scanner input=new Scanner (System.in);
        System.out.println("Please, enter any date");
        int month = input.nextInt();
        int month1 = 0;
        int year =5;
        int totalDays = 0;

        switch (month) {

        case 1:
        case 3:
        case 5:
        case 7:
        case 8:
        case 10:
        case 12:
        totalDays = 31;
        break;
        case 2:
        if (((year % 4 == 0) && !(year % 100 == 0))
                || (year % 400 == 0)){
            totalDays = 29;

        } else{

        }
            totalDays = 28;
        break;
        default:
        totalDays = 30;
        break;

        }
    }
}
