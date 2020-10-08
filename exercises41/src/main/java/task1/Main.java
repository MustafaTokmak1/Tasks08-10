package task1;
public class Main {


    public static void main(String [] args){
        Driver driver1 = new Driver("Mustafa", 20);
        Car car1 = new Car("BMW", "320d", 2016,"Sport Line");
        Car car2 = new Car("Peugeot", "307i", 2010,"Cabriolet");

        car1.setDriver(driver1);
        car2.setDriver(driver1);
        System.out.println(car1 + " " + car1.getDriver());
        System.out.println(car2 + " " + car2.getDriver());

    }
}
