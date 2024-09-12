 public class Car {
     private String carName = "";
     private double  mileDriven = 0.0;
     private double gallonsUsed = 0.0;
     
     
     public Car() {
       this.carName = carName;
       this.mileDriven = mileDriven;
       this.gallonsUsed = gallonsUsed;
     }
     
     public Car(String newName, double newMiles, double newGallons) {
        this.carName = newName;
        this.mileDriven = newMiles;
        this.gallonsUsed = newGallons;
     }
     
     public String getName() {
         return carName;
     }
     public double getMileDriven() {
         return mileDriven;
     }
     public double getGallonsUsed() {
         return gallonsUsed;
     }
     //more getters
     public void setName(String newName) {
         this.carName = newName;
     }
     public void setMileDriven(double newMileDriven) {
         this.mileDriven = newMileDriven;
     }
     public void setGallonsUsed(double newGallonsUsed) {
         this.gallonsUsed = newGallonsUsed;
     }
     //more setters
     public double calculateAverage() {
        double average = mileDriven / gallonsUsed;
    
        int average1 = (int)(average * 10);
        average = (double) average1 / 10;
        
        
        return average;
        
     }
     public String toString() {
        
         return carName + " averaged " + calculateAverage() + " m/g.";
     }
 }

