package Array.Tasks;

public class Task3 {
    public static void main(String[] args) {
        //print number which are greathr tan10 from given array
        int b =10;
        int[] a ={4,6,56,7,0,89,200,1};

        for (int i=a.length-1;i>=0;i--){
            if(a[i]>10) {
                System.out.println(a[i]);
            }


        }


    }
}
