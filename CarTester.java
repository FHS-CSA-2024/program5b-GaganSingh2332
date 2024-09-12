import java.util.Scanner;
public class CarTester {
    public Car addCar() {
    Scanner elCaro = new Scanner(System.in);
    System.out.println("Enter Car Name");
    String carName = elCaro.nextLine();
    System.out.println("Enter Miles Driven");
    double mileDriven = elCaro.nextDouble();
    System.out.println("Enter Gallons Used");
    double gallonsUsed = elCaro.nextDouble();
    Car Car1 = new Car(carName, mileDriven, gallonsUsed);
    return Car1;
    }
    
    public static void main(String[] args) {
    

    
    
        
        
       
     
    }
}
