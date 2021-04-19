package HomeWork.Homework6;

public class Task7 {
    public static void main(String[] args) {

   int ventra_card =36;
   int costing = 3;
        int count = 1;
        while (ventra_card >0){
            ventra_card-=costing;
            System.out.println("Usage " +count);
            count=count+1;
        }
    }
}
