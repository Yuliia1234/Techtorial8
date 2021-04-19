package ArrayList;

import java.util.ArrayList;

public class ComputerStore {
    public static void main(String[] args) {
        //  ArrayList<String> computer = new ArrayList();
        Computer device1 = new Computer("Mcpro", 2000, 16.5, "Applle");
        Computer device2 = new Computer("McAir", 1900, 16, "Applle");
        Computer device3 = new Computer("Thinkbad", 1200, 15.2, "Lenovo");
        Computer device4 = new Computer("EEE", 1400, 14, "HP");
        Computer device5 = new Computer("AAA", 1500, 12, "Lenovo");
        Computer device6 = new Computer("Thinkbad", 1300, 15.2, "Lenovo");
        ArrayList<Computer> computers = new ArrayList<>();

        System.out.println(computers);//Empty list

        //device1.make="AAA";  -->we can change device.make value

        computers.add(device1);
        computers.add(device2);
        computers.add(device3);
        computers.add(device4);
        computers.add(device5);
        computers.add(device6);
        System.out.println(computers.get(0));//to get result we need to  create a method override to be able to see value
        System.out.println(computers.get(1));
        System.out.println(computers.get(0).make.concat(" is good option to choose from  "));
        System.out.println(computers.get(0).make.replace("p", "P"));
        System.out.println(computers.get(0).model.toUpperCase());


        double Lowestprice = computers.get(0).getPrice();
        for (int i = 0; i < computers.size() - 1; i++) {
            if (computers.get(i).getPrice() < Lowestprice) {
                Lowestprice = computers.get(i).getPrice();
            }
        }
        System.out.println(Lowestprice + " Lowest price");

        int count = 0;
        for (int i = 0; i < computers.size(); i++) {
            if (computers.get(i).getMake().equals("Lenovo") && computers.get(i).getPrice() >= 1000 &&
                    computers.get(i).getPrice() <= 1500) {
                String a = computers.get(i).getMake();
                count++;
                System.out.println("Yes we do have this item " + a + " in our store.We have version "
                        + count + " With the prise " + computers.get(i).getPrice());
            }
        }

    }


}

