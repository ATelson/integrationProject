//Hello my name is Allen Telson
//This is my fishing Rod class used as a pokemon implimentation experiment

public class FishingRod {
  //fields for FishingRod class
  private String rodName;
  private int durability;
  private int pwr;
  private String color;
  

  //Getters and setters for Name
  public void setName(String name) {rodName = name;}
  public String getName() {return rodName;}

  // the rod has durability meaning it can break 
  //Getters and setters for Durability
  public void setDurability(int meter) {durability = meter;}
  public int getDurability() {return durability;}

  //getters and setters for power of fishing rod
  public void setPwr(int power) {pwr = power;}
  public int getPwr() {return pwr;}

  //getters and setter for color of fishing rod
  public void setColor(String hue) {color = hue;}
  public String getColor() {return color;}
}
