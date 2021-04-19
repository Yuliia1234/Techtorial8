package Method;

public class Netflix {

    String accountName= "Heroes";
    String userName;
    static int monthlyData=100;

public static double usage(double userData){
    double data = monthlyData-=userData;
    System.out.println("Left over data " + data);
    return data;
}

}
