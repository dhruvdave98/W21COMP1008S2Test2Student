//Name : Dhruv Dave
//Student number : 200456157

import java.util.ArrayList;
import java.util.Arrays;

public class CarLot {
    private ArrayList<Car> cars;

    public CarLot(){
        this.cars = new ArrayList<>();
    }

    public void addCar(Car car)
    {
        cars.add(car);
    }

    public double getInventoryValue()
    {
        for(Car cars: cars) {
            cars += cars.getPrice();
        }
        return -1;
    }

    public ArrayList<Car> getCarsByBrand(String manufacturer)
    {
        ArrayList<Car> make = new ArrayList<Car>();
        make.add("Ford");
        make.add("Honda");
        make.add("Porsche");
        return(make);
    }

    public ArrayList<Car> getCarsByModel(String model)
    {
        ArrayList<Car> model = new ArrayList<Car>();
        model.add("F150");
        model.add("Accord");
        model.add("911");
        model.add("Cayman");
        model.add("718 Boxster");
        return(model);
    }

    public ArrayList<Car> getCarsBelowPrice(double maxPrice)
    {
        return null;
    }

    public ArrayList<Car> getCarsBelowMileage(double maxkm)
    {
        return null;
    }

    public int getNumOfCarsUnderPrice(double maxPrice)
    {
        return -1;
    }

    public double getAvgPrice()
    {
        return -1;
    }

    public int getNumOfCarsInInventory()
    {
        return -1;
    }

    public String toString()
    {
        return "";
    }
}
