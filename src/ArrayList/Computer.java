package ArrayList;

public class Computer {
    String model;

    public String getModel() {//Generate --getters and setters
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    double price;
    double screensize;

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    String make;

    public Computer(String model, double price, double screensize, String make) {

        this.make = make;
        this.price = price;
        this.screensize = screensize;
        this.model = model;
    }

    public String toString() {

        return "Make " + make + " Model " + model + " Price " + price + " Screen size " + screensize;
    }


}

