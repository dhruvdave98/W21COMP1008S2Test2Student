//Name : Dhruv Dave
//Student number : 200456157

import java.util.Arrays;
import java.util.List;

public class Car {
    private String make, model;
    private int mileage;
    private double price;

    public Car(String make, String model, int mileage, double price) {
        setMake(make);
        setModel(model);
        setMileage(mileage);
        setPrice(price);
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getMileage() {
        return mileage;
    }

    public double getPrice() {
        return price;
    }

    public void setMake(String make) {
        if(make.equals("Ford") || make.equals("Honda") || make.equals("Porsche"))
            this.make = make;
        else
            throw new IllegalArgumentException("argument is not valid, it should be 'Ford', 'Honda', 'Porsche'");
    }

    public void setModel(String model) {
        if(make.equals("Ford")){
            if(model.equals("F150") || model.equals("Escort") || model.equals("Explorer"))
                this.model = model;
        }
        else if(make.equals("Honda")){
            if(model.equals("Accord") || model.equals("Civic") || model.equals("Pilot"))
                this.model = model;
        }
        else if(make.equals("Porsche")){
            if(model.equals("911") || model.equals("Cayman") || model.equals("718 Boxster"))
                this.model = model;
        }
        else
            throw new IllegalArgumentException("it is not valid model");
    }

    public void setMileage(int mileage) {
        if(mileage>=0 && mileage<=5000000)
            this.mileage = mileage;
        else
            throw new IllegalArgumentException("Mileage is not valid, it should be between 0 to 5 million");
    }

    public void setPrice(double price) {
        if(price>=0 && price<=2000000)
            this.price = price;
        else
            throw new IllegalArgumentException("Price is not valid, it should be between 0 to 2 million");
    }

    public String toString()
    {
        return make+" "+model+", with "+mileage+" km - asking $"+price;
    }
}
