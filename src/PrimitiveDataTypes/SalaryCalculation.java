package PrimitiveDataTypes;

public class SalaryCalculation {
    public static void main (String[]args) {
        /**
         * Calculate a salary for a person who works 5 days,8 hours in a each day and 20 days in a month in rate is 30$/hr
         */
        int hours_perday = 8;
        int days_inmonth = 20;
        int salary = 30;
        double tax;
        double tax_percentege = 0.24;
        int hours_in_mon = hours_perday * days_inmonth;
        int month_salary = salary * hours_in_mon;
        tax = month_salary * tax_percentege;
        System.out.println("My monthly salary" + month_salary);
        System.out.println("My net salary is $" + (month_salary - tax));
     //========================================
        int phone_cost = 875;
        int mounthly_payment = 100;
         int payment = phone_cost%mounthly_payment;
        System.out.println(payment);
        //======================================
        /**Multiplication and division has to be done first
         * Addition and Substraction next
         * Always go from left to right
         * Parantheses will take the first precedence (priority)
         * 5+6*2-1*3/3
         * 5+12-3/3
         * 5+12-1
         * 16
         */
//========================================================================
        int result1 = 5+ 6 *2 -1 *3 / 3;
        System.out.println(result1);

        int result2 = ( 5 + 6) *(2 -1 *3 / 3);
        System.out.println("My second result" + "--->" + result2);

        int result3 = (5 + 6) *((2 -1 )-3 / 3);
        System.out.println(" My third result " + result3);
    }
}
