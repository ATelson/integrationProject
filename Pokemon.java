/**
 * Author: Allen Telson. This is my pokemon class within here there will be
 * multiple fields and behaviors that pokemon objects will have in the program
 */

class Pokemon {
  // Pirvate fields
  private String appearance;
  private double weight;
  private String name;
  private String typeOfPokemon;
  private String color;

  public Pokemon() {
    appearance = "Tall, dark, and handsome.";
    weight = 130.27;
    typeOfPokemon = "Dark, Ghost";
    color = "red, purple and black";
  }

  // all the setters and getters for each field
  public void set_appearance(String input) {
    appearance = input;
  }

  String get_appearance() { 
    return appearance;
  }

  public void set_weight(double input) {
    weight = input;
  }

  double get_weight() { 
    return weight;
  }

  public void set_color(String input) {
    color = input;
  }

  String get_color() {
    return color;
  }

  public void set_name(String input) {
    name = input;
  }

  String get_name() { 
    return name;
  }

  public void set_typeOfPokemon(String input) {
    typeOfPokemon = input;
  }

  String get_typeOfPokemon() {
    return typeOfPokemon;
  }
}
