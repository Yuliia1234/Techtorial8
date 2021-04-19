package ForLoop1;

public class ForLoop {
    public static void main(String[] args) {
                //int i=0;//initializing
        for(int i=0;    i<=8;   i++){//i++ incrementing
            System.out.println("Hello Word " + i);
        }
        for(int i=8; i>0; i--){
            System.out.println("This is second for loop");
        }
        int sum =0;
        for (int i=5; i<=9;i++){
            sum=sum+i;
            System.out.println(sum);
        }
        System.out.println("last total " +sum);
    }
}
