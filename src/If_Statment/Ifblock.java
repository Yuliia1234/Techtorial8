package If_Statment;

public class Ifblock {
    public static void main(String[] args) {
//        int number =1234;
//        if(number==1234){
//            System.out.println("Hello word");


           //if store has enough oranges i will by 40 of them
        int storeAvalib=45;//Thi is class varible
        int oranges=40;


         int $itemPrice =1;
         int initialPayment=0;

         if (storeAvalib>oranges) {

         int payment = oranges * $itemPrice;//declaring .//Payment is a local variable,so you can't use it out of block
             //Example "payment "
          System.out.println("This is your total payment for oranges " + payment);

         }else{

             System.out.println("the total payment is "+initialPayment);
         }



        }
    }

