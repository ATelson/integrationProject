//Hello, my name is Allen Telson and this project shows the skills
//that I have learned throughout the course of the semester.

import java.util.*;
import java.util.concurrent.TimeUnit;
import java.time.*;
import java.time.format.*;

//Lambda Expression that will be used within main class
interface Greeting {
  String name(String surname);
}
// This class represents the Legendary Pokemon Lugia
// By using inheritance and gaining access to the Pokemon class
class LegendaryPokemon extends Pokemon {

  // Below represents the process of overriding methods within
  // The pokemon class in order to provide characteristics of Lugia
  @Override
  String get_appearance() {
    return "From a group of incredibly rare and often very powerful Pokémon,"
     + " generally featured prominently in the legends and myths of the Pokémon world. ";
  }

  @Override
  String get_color() {
    return "Silver with navy blue and light accents.";
  }

  @Override
  String get_name() {
    return "Lugia";
  }

  @Override
  String get_typeOfPokemon() {
    return "Psychic and Flying";
  }

  @Override
  double get_weight() {
    return 476.2;
  }
}

// This class demonstrates the creation if-else statements for a method used to
//determine the speed in which you are currently going
class Speed {

  static String watchYourSpeed(int velocity) throws Exception {
    if (velocity > 45) {
      System.out.println("Watch your speed!");
    } else if (velocity < 45) {
      System.out.println("You can increase your speed.");
    } else if (velocity == 45) {
      System.out.println("You are going the speed limit.");
    }

    return null;
  }
}

// A class that demonstrates inheritance and Polymorphism
class SportsCar extends Car { // Sports car is a class that is an extension of the super
                             // class Car
 
  //adding tires to Sports car class
  private String tireType;

  //SportsCar method will inherit all data from Super class Car and add tires
  public SportsCar(int topSpeed, double zeroToSixty, String drivetrain, String tireType) {
    super(topSpeed, zeroToSixty, drivetrain);
    this.setTireType(tireType);
  }
  
  //constructors for tires
  public String getTireType() {
    return this.tireType;
  }

  public void setTireType(String tireType) {
    this.tireType = tireType;
  }
  //method carSpecs will be used to print the type of tires the Sports Car has
  public void carSpecs() {
    super.carSpecs();
    System.out.println("The BMW has " + getTireType() + " tires.");
  }
}

public class Main {
  public static void main(String[] args) throws Exception {

    // sysout + cntrl + space

    // A variable is a location in memory

    // 8 primitive data types:
    // byte: 8 bit value, minimum of -128 and max of 127
    // short: 16 bit value, minimum of -32,768 and a max of 32,767
    // int: 32 bit, used for non decimal numbers
    // long: twice the size of an int
    // float: 32 bit, used for floating point numbers or decimals
    // double: 64 bit, same as float, but double the range of values
    // boolean: 2 possible values, True or False
    // char: 16 bit unicode, minimum is 0 and max is 65,535

    /*
     * STATIC: The static keyword denotes that a member variable, or method, can be
     * accessed without requiring an instantiation of the class to which it belongs.
     * Basically, it means that you can call a method, even if you've never created
     * the object to which it belongs.
     */
    
    //provide the date and time at the start of program
    DateTimeFormatter setting = DateTimeFormatter.ofPattern("yyyy/MM/dd hh:mm a");
    LocalDateTime now = LocalDateTime.now();
    System.out.println(setting.format(now));

    //Greet user and create username
    System.out.print("Hello user! Create your own username: ");
    Scanner input = new Scanner(System.in);
    String userName = input.next();

    // Lambda Expression used to say Good Day + surname
    Greeting dayGreeting = (surname) -> "Good Day " + surname + "!";
    System.out.println(dayGreeting.name(userName));
    System.out.println("\t");
    System.out.println("Awesome " + userName + ", now lets begin!");
    String s1 = "Awesome " + userName + ", now lets begin!";
    System.out.println("From within the sentence above, your"
    + " name begins on character number: " + s1.indexOf(userName));
    String s2 = "And here is your name all lower cased: " + userName.toLowerCase() + ".";
    System.out.println(s2);
    try {
      TimeUnit.SECONDS.sleep(1);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    String s3 = "Alright       ";
    System.out.println(s3 + userName + "Lets go through some programs.");
    try {
      TimeUnit.SECONDS.sleep(1);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    System.out.println("Whoops! Looks like I made a slight error.");
    try {
      int x = 0;
      while (x < 3) {

        TimeUnit.SECONDS.sleep(1);
        System.out.println("One moment...");
        x = x + 1;
      }
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    System.out.println(s3.trim() + " " + userName + " Let's go through some tests.");
    System.out.println("\t");
    System.out.println("\t");
    
    //Speed limit test
    System.out.println("The speed limit here is 45mph.");
    System.out.print("Enter the speed in which the car is going (in MPH): ");
    int carSpeed = 0;
    
    //create boolean to allow user to try again if there is an invalid input
    boolean goodInput = false;
    while (goodInput == false) {
      
      //create try-catch statements that will be used if the user enters an invalid input
      try {
        carSpeed = input.nextInt();
        //call watchYourSpeed using what the user entered
        Speed.watchYourSpeed(carSpeed);
        goodInput = true;
      } catch (InputMismatchException ex) { //exception will make sure that the user
                                            //cannot entered a non-numeric value
        System.out.println("Requires an integer, please try again.");
        input.nextLine();
      }
    }
    try {
      TimeUnit.SECONDS.sleep(1);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    System.out.println("\t");
    
    //Swtich statement used to show months out of the year
    int month = 0;
    goodInput = false;
    while (goodInput == false) {
      try {
        System.out.print("Please enter the numeric value of this month:");
        month = input.nextInt();
        goodInput = true;
        String currentMonth;
        switch (month) {

          case 1:
            currentMonth = "January";
            break;
          case 2:
            currentMonth = "February";
            break;
          case 3:
            currentMonth = "March";
            break;
          case 4:
            currentMonth = "April";
            break;
          case 5:
            currentMonth = "May";
            break;
          case 6:
            currentMonth = "June";
            break;
          case 7:
            currentMonth = "July";
            break;
          case 8:
            currentMonth = "August";
            break;
          case 9:
            currentMonth = "September";
            break;
          case 10:
            currentMonth = "October";
            break;
          case 11:
            currentMonth = "November";
            break;
          case 12:
            currentMonth = "December";
            break;

          default:
            currentMonth = "Invalid day";
        }
        System.out.println(currentMonth);

      } catch (InputMismatchException ex) {
        System.out.println("Please Enter an Integer from 1-12");
        input.nextLine();
      }
    }
    try {
      TimeUnit.SECONDS.sleep(1);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }

    // mathematical operation using division method
    // this math operation is used to change dollar bills into quarters
    System.out.println("\t");
    int dollar = 0;
    boolean greatInput = false;
    while (greatInput == false) {
      try {
        System.out.print("Please enter dollar amount: ");
        dollar = input.nextInt();
        double quarter = 0.25;
        greatInput = true;
        if (dollar > 0) {
          // I could use the division method created below
          // System.out.println("Amount of quarters: " + divisionCalc(dollar, quarter));
          // or I could use:
          double change;
          change = dollar / quarter;
          System.out.println("\t");
          System.out.println("The amount of quarters to be received: " + (int) change);
        }
      } catch (InputMismatchException ex) {
        System.out.println("Requires an integer. Please try again");
        input.nextLine();
      }
    }
    try {
      TimeUnit.SECONDS.sleep(1);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    
    //Flip a coin uses the Random tool that Java provides to randomize the number 1 or 2
    //in order to make the chances truly random
    int userIn = 0;
    boolean correctNums = false;
    while (correctNums == false) {
      System.out.print("Hey " + userName + " Heads or Tails? (1 = Heads, 2 = Tails): ");
      try {
        userIn = input.nextInt();
        correctNums = true;
        
        //userIn must be 1 or 2
        if (userIn == 1 || userIn == 2) {
          int coinFlip = flipACoin(userIn);
          if (coinFlip % userIn == 0) {
            System.out.println("It's Heads");
          } else {
            System.out.println("It's Tails");
          }
        } else if (userIn > 2) {
          System.out.println("Please use 1 or 2");
        }
      } catch (Exception e) {
        System.out.println("Requires 1 for Heads or 2 for Tails. Try Again");
        input.nextLine();
      }
    }

    System.out.println("\t");

    // the purpose of this portion of code that gives you the number of hours and
    // minutes you have given the number of days
    System.out.println("Okay " + userName);
    System.out.println("This portion of code provides you with the amount of hours and"
        + " minutes you have" + " based on the number of days you enter.");
    System.out.print("Start by entering the amount of days you would like to enter:");
    int days = input.nextInt();
    System.out.println("\t");
    System.out.println("Days entered: " + days);
    if (days <= 0) {
      int status = 1;
      System.out.println("Invalid input. Please enter amount of days");
      System.exit(status);
    } else {
        System.out.println("The amount of hours in " + days + " days: " 
            + (hrsPerDay(days)) + " hours.");
        System.out.println("The amount of minutes in " + days + " days: " 
            + minsPerDay(days) + " minutes.");
        System.out.println("The amount of seconds in " + days + " days: " 
            + secsPerDay(days) + " seconds.");
        System.out.println("\t");
    }
      try {
        TimeUnit.SECONDS.sleep(1);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
      //////////////////////////// Arrays an
      //////////////////////////// Loops///////////////////////////////////////
      // This program uses for loop uses an array to create a schdule for Doctors
      // Schedule is for Monday, Wednesday, and Friday

      int[][] patientData = { { 3, 4, 2 }, // Dr. Patterson's schedule
          { 4, 3, 1 }, // Dr. Michaels' schedule
          { 2, 2, 4 } }; // Dr. Goldstein's schedule

      System.out.println("---SCHEDULE THIS WEEK---");
      // total number of patients this week
      printTotalPatients(patientData, 0);

      // two arrays used to store data from patientData Array
      int[] totalPerDay = new int[patientData[0].length];
      int[] totalPerDoc = new int[patientData.length];
      int sumOfPatients = 0;

      // nested for loops used to access locations within 2-D array
      for (int i = 0; i < patientData.length; i++) {
        for (int j = 0; j < patientData[i].length; j++) {

          // these values are the sum of data collected from within the patientData Array
          totalPerDay[i] += patientData[i][j];
          totalPerDoc[j] += patientData[i][j];
          sumOfPatients += patientData[i][j];
        }
      }
      System.out.println("The total number of patients this week: " + sumOfPatients);
      System.out.println("Monday: " + totalPerDay[0] + " , Wednesday: " + totalPerDay[1]
          + " , Friday: " + totalPerDay[2]);
      System.out.println("Dr. Patterson: " + totalPerDoc[0] + ", Dr. Michaels: " + totalPerDoc[1]
          + ", Dr. Goldstein: " + totalPerDoc[2] + ".");
      System.out.println("Max patients per day: " + maxPatientsPer(totalPerDay) + ".");
      System.out.println("Max patients per doctor:" + maxPatientsPer(totalPerDoc) + ".");
      System.out.println("\t");

      /// the use of a while loop in order to speed or slow car down to the speed
      /// limit
      System.out.print("The speed limit is 55mph. How fast are you going?:");
      int answer = input.nextInt();
      if (answer >= 55) {
        while (answer > 55) {
          System.out.println("Slowing down..." + answer + "mph.");
          answer--;
          try {
            TimeUnit.SECONDS.sleep(1);
          } catch (InterruptedException e) {
            e.printStackTrace();
          }
        }
      } else if (answer < 55) {
        while (answer <= 55) {
          System.out.println("Speeding up..." + answer + "mph.");
          answer++;
          try {
            TimeUnit.SECONDS.sleep(1);
          } catch (InterruptedException e) {
            e.printStackTrace();
          }
        }
      } else {
        System.out.println("Invalid Number");
      }
    System.out.println("\t");
    
    // An array of Grades in the classroom
    System.out.println("An array of students submitted their exams.");
    System.out.print("Of all 20 of them, the lowest grade is: ");
    int[] grades = { 82, 68, 78, 94, 97, 86, 58, 63, 75, 92,
                     88, 67, 78, 96, 80, 71, 60, 98, 82, 77 };
    
    //called lowestGrade method to find what is the lowest test Grade is
    lowestGrade(grades);
    System.out.println("\t");
    
    //Demonstrate total amount of points students got
    System.out.println("The total amount of points that the class has accumulated"
        + "from the test is: " + sumOfAllGrades(grades) + "/" + "2000 pts");
    System.out.println("\t");
    
    //Finding average
    double avg = divisionCalc(sumOfAllGrades(grades), 2000);
    System.out.println("Which brings you the Grade average of: " + (avg * 100) + "%");
    System.out.println("\t");
    
    //Find highest test grade
    System.out.println("The highest test grade ever recorded for this test is 98.");
    System.out.println("Upon checking, it looks like test number " 
    + (searchArray(grades, 98) + 1) + " has been graded a 98!");
    System.out.println("\t");
    
    //Print grades
    displayGrades(grades);
    
    System.out.println("\t");

    try {
      TimeUnit.SECONDS.sleep(1);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    System.out.println("\t");
    
    // New string to use String builder methods
    String palindrome = "DOG = GOD";
    System.out.println(
        "Did you know that the sentence: " + palindrome + ", spelled backwards is itself?");

    // Using a String builder to reverse the String order
    StringBuilder mySB = new StringBuilder(palindrome);
    int timer = 0;
    while (timer < 2) {//using while loop to create Reversing effect to show
                       //that the computer is processing
      
      System.out.println("Reversing...");
      timer++;
      try {
        TimeUnit.SECONDS.sleep(1);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
    //now reverse StringBuilder
    mySB.reverse();
    System.out.println("Reversed: " + mySB);
    
    System.out.println("\t");
    
    try {
      TimeUnit.SECONDS.sleep(1);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    
    // Using a StringBuilder to delete and add to the string
    StringBuilder myPOTUS = new StringBuilder(palindrome);
    myPOTUS.delete(4, 9);
    myPOTUS.append("FOR PRESIDENT!");

    System.out.println(myPOTUS);
    System.out.println("\t");
    // Using a String builder to replace a part of the string
    StringBuilder hero = new StringBuilder(palindrome);
    hero.replace(0, 4, "Thor ");
    hero.append(" OF THUNDER!");
    System.out.println(hero);
    System.out.println("\t");
    ////////////////////// MY POKEMON OBJECTS////////////////////////////////////////////
    try {
      TimeUnit.SECONDS.sleep(1);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    System.out.println("Guess what " + userName + "!");
    System.out.println("I just caught my very first pokemon. Check out my PokeDex:");
    
    // access to my pokemon class
    Pokemon poke_001 = new Pokemon(); // creation of new object named poke_001
    poke_001.set_appearance("The Pokemon has the resemblance of a turtle."
        + " They have brown shells and are of blue color.");
    poke_001.set_typeOfPokemon("Water");
    poke_001.set_name("Squirtle");
    poke_001.set_weight(12.7);
    String var01 = "The pokemon name is: ";
    String var02 = "Appearance: ";
    String var03 = "The pokemon type is: ";
    String var04 = "The pokemon's weight is: ";
    
    // Displaying values of the variables
    System.out.println(var01 + poke_001.get_name());
    System.out.println(var02 + poke_001.get_appearance() + ".");
    System.out.println(var03 + poke_001.get_typeOfPokemon() + ".");
    System.out.println(var04 + poke_001.get_weight() + " lbs.");
    System.out.println("\t");
    try {
      TimeUnit.SECONDS.sleep(1);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    System.out.println("Woah! It's Lugia!");
    System.out.println(userName + " use your Pokedex!");
    System.out.println("*" + userName + " uses Pokedex..." + "*");
    
    //create new legendary pokemon
    LegendaryPokemon lugia = new LegendaryPokemon();
    System.out.println(lugia.get_name());
    System.out.println(lugia.get_appearance());
    System.out.println(lugia.get_color());
    System.out.println(lugia.get_typeOfPokemon());
    System.out.println(lugia.get_weight());

    ///////////////////// Fishing Rod Object///////////////////
    // access to my Fishing Rod Class
    while (timer < 2) {
      System.out.println("Searching...");
      timer++;
      try {
        TimeUnit.SECONDS.sleep(1);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
    System.out.println("!");
    System.out.println(userName + " just found a new fishing rod!");
    System.out.println("\t");
    FishingRod rodOne = new FishingRod();
    rodOne.setName("Ole Yeller");
    rodOne.setDurability(2); // the durability of the rod
    rodOne.setPwr(1); // the power of the rod
    rodOne.setColor("Moonshine-y Gray"); // the color of the rodName
    System.out.println("Type: " + rodOne.getName());
    System.out.println("Durability: " + rodOne.getDurability());
    System.out.println("Power: " + rodOne.getPwr());
    System.out.println("Color: " + rodOne.getColor());
    System.out.println("\t");
    
    //Using Super Class Car and creating BMW from sportsCar subclass
    System.out.println("Man " + userName + " today just keeps getting better!");
    System.out.println("GUESS WHAT?!");
    int countdown = 0;
    while (countdown < 2) {
      System.out.println("Guessing...");
      countdown++;
      try {
        TimeUnit.SECONDS.sleep(1);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
    System.out.println("I just got a new car!");
    System.out.println("Its a BMW. Here are the specs: ");
    Car BMW = new SportsCar(190, 3.4, "Rear-Wheel Drive", "High Performance");
    BMW.carSpecs();
    
    System.out.println("\t");
    
    System.out.println("--NBA TOP 10 LEADING SCORERS--");
    //Hashtable that represents data from the top NBA Athletes
    Hashtable<String, Double> nbaStats = new Hashtable<String, Double>();
    nbaStats.put("James Harden", new Double(30.4));
    nbaStats.put("Anthony Davis", new Double(28.1));
    nbaStats.put("LeBron James", new Double(27.5));
    nbaStats.put("Damian Lillard", new Double(26.9));
    nbaStats.put("Giannis Antetokounmpo", new Double(26.9));
    nbaStats.put("Kevin Durant", new Double(26.4));
    nbaStats.put("Russell Westbrook", new Double(25.4));
    nbaStats.put("Kyrie Irving", new Double(24.4));
    nbaStats.put("LaMarcus Aldridge", new Double(23.1));
    nbaStats.put("Victor Oladipo", new Double(23.1));
    
    //Now to create an enum called NBA that uses the nbaStats
    Enumeration<String> NBA = nbaStats.keys();
    double stat;
    
    //use while loop to print each element within Hashtable
    while (NBA.hasMoreElements()) {
     String key = (String) NBA.nextElement();
      System.out.println(key + ": " + nbaStats.get(key));
    }
    System.out.println("\t");
    
    //Now include first round of playoff numbers
    System.out.println("---POINTS PER GAME INCLUDING PLAYOFF GAMES---");
    
    //create enum called Playoffs
    Enumeration<String> Playoffs = nbaStats.keys();
    
    //Now add the extra points per game from the 4 games played so far for each player
    
    stat = ((Double) nbaStats.get("James Harden")).doubleValue();
    nbaStats.put("James Harden", new Double(stat + 0.0));
 
    stat = ((Double) nbaStats.get("Anthony Davis")).doubleValue();
    nbaStats.put("Anthony Davis", new Double(stat + 0.3));
    
    stat = ((Double) nbaStats.get("LeBron James")).doubleValue();
    nbaStats.put("LeBron James", new Double(stat + 0.2));
    
    stat = ((Double) nbaStats.get("Damian Lillard")).doubleValue();
    nbaStats.put("Damian Lillard", new Double(stat - 0.5));
    
    stat = ((Double) nbaStats.get("Giannis Antetokounmpo")).doubleValue();
    nbaStats.put("Giannis Antetokounmpo", new Double(stat + 0.6));
    
    stat = ((Double) nbaStats.get("Kevin Durant")).doubleValue();
    nbaStats.put("Kevin Durant", new Double(stat + 0.1));
   
    stat = ((Double) nbaStats.get("Russell Westbrook")).doubleValue();
    nbaStats.put("Russell Westbrook", new Double(stat - 0.2));
    
    stat = ((Double) nbaStats.get("LaMarcus Aldridge")).doubleValue();
    nbaStats.put("LaMarcus Aldridge", new Double(stat + 0.0));
    
    stat = ((Double) nbaStats.get("Victor Oladipo")).doubleValue();
    nbaStats.put("Victor OladiVictor Oladipopo", new Double(stat + 0.0));
    
    //use while loop to call modified elements
    while (Playoffs.hasMoreElements()) {
      String key = (String) Playoffs.nextElement();
       System.out.println(key + ": " + nbaStats.get(key));
    
     }
    
    //side note
    System.out.println("Kyrie Irving will miss the entire playoffs," 
        + " therefore his points per game remains the same at: "
                + nbaStats.get("Kyrie Irving"));
    
    input.close();
  }

  //////////////////////////////////// METHODS////////////////////////////////////////////

  // mathematical division method
  // HEADER
  private static double divisionCalc(double number1, double number2) {
    // this method contains two
    // double datatype parameters
    double division;
    division = number1 / number2;
    return division;
  }

  // mathematical multiplication method
  // HEADER
  
  /* just in case there needs to be a multiplication method
  private static double mulitplicationCalc(double number1, double number2) {
    // this method contains two
    // double datatype parameters
    double product;
    product = number1 * number2;
    return product;
  }
*/
  
  // this method is used to obtain the amount of hours that are in the
  // amount of days entered
  // HEADER
  private static int hrsPerDay(int daysIn) { // the method name is hrsPerDay
                                             // with a single int datatype parameter
    int hours = 24;
    int dailyHours;
    dailyHours = daysIn * hours;
    return dailyHours;
  }

  // this method is used to obtain the amount of minutes that are in the
  // amount of days entered
  // HEADER
  private static int minsPerDay(int daysIn) { // the method name is minsPerDay
                                              // with a single int datatype parameter
    int dailyMins;
    int minutes = 60;
    int hours = 24;
    dailyMins = daysIn * hours * minutes;
    return dailyMins;
  }

  // this method is used to obtain the amount of seconds that are in the
  // amount of days entered
  // HEADER
  private static int secsPerDay(int daysIn) { // the method name is secsPerDay
                                              // with a single int datatype parameter
    int secs = 60;
    int mins = 60;
    int hrs = 24;
    int dailySeconds;
    dailySeconds = daysIn * hrs * mins * secs;
    return dailySeconds;
  }

  // method used to create weekly schedule for Doctors
  public static void printTotalPatients(int[][] input, int x) {// this method contains an
    // int array and an int parameter

    String[] drNames = { "Dr. Patterson", "Dr. Michaels", "Dr. Goldstein" };
    if (x < input.length) {
      for (int i = 0; i < input.length; i++) {
        System.out.println(drNames[i] + ": " + input[i][0] + " Monday, " + input[i][1]
            + " Wednesday, " + input[i][2] + "and Friday .");
      }
    }
  }

  // method used to sum up all data from within the array
  public static int maxPatientsPer(int[] totalPer) {// this method contains an int array
                                                    // parameter

    int sum = 0;
    for (int j = 0; j < totalPer.length; j++) {
      if (sum < totalPer[j]) {
        sum = totalPer[j];
      }
    }
    return sum;
  }

  // this method uses the Random class to randomize a number which will be used
  // when
  // determining whether the coin is filped to heads or tails
  public static int flipACoin(int x) { // contains an int parameter
    // declare new random variable
    Random rand = new Random();
    x = rand.nextInt(50) + 1;
    return x;
  }

  // method used to search for the lowest value within an int array
  public static void lowestGrade(int[] grades) {
    int smallest = grades[0];
    for (int i = 0; i < grades.length; i++) {
      if (grades[i] <= smallest)
        smallest = grades[i];
    }
    System.out.println(smallest);
  }

  // This method is used to add up all values within an int array
  public static int sumOfAllGrades(int[] numbersArray) {// uses an int array as
                                                        // its parameter
    int sum = 0;
    for (int i = 0; i < numbersArray.length; i++) {
      sum += numbersArray[i];
    }
    return sum;
  }

  // This method searches an int array for a value entered by the user
  public static int searchArray(int[] numbersArray, int x) {// the method has two
                                                            // parameters int array and
                                                            // int variable
    for (int i = 0; i < numbersArray.length; i++) {
      if (x == numbersArray[i]) {
        return i;
      }
    }
    System.out.println("Value not found.");
    return -1;
  }

  // This method is used to display all the values within array spaced in a
  // uniform manner
  public static void displayGrades(int[] grades) {// uses int array as parameter
    System.out.println("The grades of each test:");
    for (int x : grades) {
      System.out.print(x + " ");
    }
  }
}