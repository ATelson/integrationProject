//Hello my name is Allen Telson
//This is my Super Class Car used to demonstrate inheritance, and polymorphism
public class Car{
  //create private values
  private int topSpeed;
  private double zeroToSixty;
  private String drivetrain;
  
  //method will be used to print the private values
  public Car(int topSpeed, double zeroToSixty, String drivetrain) {
    System.out.println("Top Speed: " + topSpeed);
    System.out.println("0 - 60: " + zeroToSixty);
    System.out.println("Drivetrain: " + topSpeed);
  }
  //constructors for TopSpeed
  public int getTopSpeed() {
    return topSpeed;
  }
  public void setTopSpeed(int topSpeed) {
    this.topSpeed = topSpeed;
  }
  
  //constructors for zeroToSixty
  public double getZeroToSixty() {
    return zeroToSixty;
  }
  public void setZeroToSixty(int zeroToSixty) {
    this.zeroToSixty = zeroToSixty;
  }
  
  //constructors for Drivetrain
  public String getDrivetrain() {
    return drivetrain;
  }
  public void setDrivetrain(String drivetrain) {
    this.drivetrain = drivetrain;
  }
  
  public void carSpecs() {
    System.out.println();
    
  }
  
  
}