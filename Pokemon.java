import java.util.*;
//This is my pokemon class
//within here there will be multiple fields and behaviors
//that pokemon objects will have in the program
class Pokemon{
	//There will be private fields that are characteristics of fields and methods within the
  //class
	private String appearance;
	private double weight;
	private String color;
	private String name;
	private String typeOfPokemon;
  public String get_appearance;
	
	//all the setters and getters for each field
	public void	 set_appearance(String input){appearance = input;} 
	String	 get_appearance()			{return appearance;}
	
	public void  set_weight(double input)  {weight = input;}
  double   get_weight()     {return weight;}
  
  public void set_color(String input) {color = input;}
  String get_color()    {return color;}
  
  public void set_name(String input) {name = input;}
  String get_name()  {return name;}

  public void set_typeOfPokemon(String input) {typeOfPokemon = input;}    
  String get_typeOfPokemon() {return typeOfPokemon;}
  
  public static void resist(Pokemon input) {}
 }
