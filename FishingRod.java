//Hello my name is Allen Telson
//This is my fishing Rod class used as a pokemon implimentation experiment

public class FishingRod {
  // create a method that creates rod name
  public FishingRod(String name) {

    System.out.println("Rod: " + name);
  }

  // the rod has durability meaning it can break
  public int getDurability(int meter) {

    System.out.println("Meter Gauge: " + meter);

    return meter;
  }

  // create a method that is used to give information about the power of the
  // fishing rod
  public int getPwr(int power) {

    System.out.println("Power Gauge: " + power);

    return power;
  }

  // Create a method that will be used to the rod color
  public void getColor(String color) {

    System.out.println("Color: " + color);
  }
}
