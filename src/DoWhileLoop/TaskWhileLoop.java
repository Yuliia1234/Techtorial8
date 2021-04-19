package DoWhileLoop;

public class TaskWhileLoop {
    public static void main(String[] args) {

        //you have 40$ in your account
        //and each call is 5$.Find out how many calls can i make

        int account = 40;
        int call_price=5;
        int count = 0;
        while (account >0){
            account-=call_price;
            System.out.println("My balance is now " +account);
            count=count+1;


        } System.out.println("How many calls did i do " + count);

    }
}
