import vehiclerentalsystem.Bike;
import vehiclerentalsystem.Car;

public class Q5
{
    public static void main(String args[])
    {
        Car c1 = new Car("Maruti",5000,8);
        Bike b1 = new Bike("Honda",4000,6);
        c1.showVehicle();
        c1.showCar();
        b1.showVehicle();
        b1.showBike();
    }
}