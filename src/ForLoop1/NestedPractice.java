package ForLoop1;

public class NestedPractice {
    public static void main(String[] args) {
        //print of months of the year betwen 2020 to 2023 inclusive
        //2020-->1,2,3,4..12
        //2021 -->1,..12
      int k =1;
      OUTER:
        for (int i=2020; i<=2023;i++){
            System.out.println("Year " +i);
            if (k ==3){
                break OUTER;
            }

            for (;k<=12; k++){

                switch (k){
                    case 1 :
                        System.out.println("January ");
                        break;
                    case 2:
                        System.out.println("February ");
                        break;
                    case 3:
                        System.out.println("March ");
                        break;
                    case 4:
                        System.out.println("April");
                    case 5:
                        System.out.println("May");
                    case 6:
                        System.out.println("Jun");
                    case 7:
                        System.out.println("Jul");
                    case 8 :
                        System.out.println("Aug");
                    case 9 :
                        System.out.println("Sep");

                }


                }
            }

        }
    }

