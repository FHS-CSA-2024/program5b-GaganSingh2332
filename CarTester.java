
import java.util.Scanner;

public class CarTester {
    public static Car addCar() {
        Scanner elCaro = new Scanner(System.in);
        System.out.println("Enter Car Name");
        String carName = elCaro.nextLine();
        System.out.println("Enter Miles Driven");
        double mileDriven = elCaro.nextDouble();
        System.out.println("Enter Gallons Used");
        double gallonsUsed = elCaro.nextDouble();
        Car car1 = new Car(carName, mileDriven, gallonsUsed);
        return car1;
    }

    public static void main(String[] args) {
        Car car1 = addCar();
        Car car2 = addCar();
        String y = "";
        String x = "";
        x = car1.toString();
        y = car2.toString();
        System.out.println(x);
        System.out.println(y);

    
        
       
    }
}
