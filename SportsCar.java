class SportsCar extends Car {

  /**
   * SportsCar is a class that is an extension of the super. class Car
   */

  // Adding tires to SportsCar class
  private String tireType;

  // SportsCar method will inherit all data from Super class Car and add tires
  public SportsCar(int topSpeed, double zeroToSixty, String drivetrain, String tireType) {
    super(topSpeed, zeroToSixty, drivetrain);
    this.setTireType(tireType);
  }

  // constructors for tires
  public String getTireType() {
    return this.tireType;
  }

  public void setTireType(String tireType) {
    this.tireType = tireType;
  }
  // method carSpecs will be used to print the type of tires the Sports Car has

  public void carSpecs() {
    super.carSpecs();
    System.out.println("The BMW has " + getTireType() + " tires.");
  }
}

