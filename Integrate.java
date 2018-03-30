import java.util.*;
import java.util.concurrent.TimeUnit;
//Hello, my name is Allen Telson and this project shows the skills
//that I have learned throughout the course of the semester.

public class Integrate {
  public static void main(String[] args) {

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

    System.out.println("Hello user! Create your own username:");
    Scanner input = new Scanner(System.in);
    String userName = input.next();
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

    ////// An if statement that determines whether you are speeding or
    ////// not///////////////////
    System.out.println("The speed limit here is 35mph.");
    System.out.println("Enter the speed in which the car is going (just the number):");
    int carSpeed = input.nextInt();
    int speedLimit = 35;

    if (carSpeed > speedLimit) {

      System.out.println("Caution: watch your speed!");
    } else if (carSpeed < speedLimit) {
      System.out.println("Please Increase your speed.");
    } else if (carSpeed == speedLimit) {
      System.out.println("Appropriate Speed.");
    }
    try {
      TimeUnit.SECONDS.sleep(1);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    ///////////////////// Switch Statement for a weekly
    ///////////////////// schedule////////////////////////////
    System.out.println("\t");
    System.out.println("Enter work day (numeric format from 1-7):");
    int day = input.nextInt();
    String currentDay;
    switch (day) {

      case 1:
        currentDay = "Sunday";
        break;
      case 2:
        currentDay = "Monday";
        break;
      case 3:
        currentDay = "Tuesday";
        break;
      case 4:
        currentDay = "Wednesday";
        break;
      case 5:
        currentDay = "Thursday";
        break;
      case 6:
        currentDay = "Friday";
        break;
      case 7:
        currentDay = "Saturday";
        break;

      default:
        currentDay = "Invalid day";
    }
    System.out.println(currentDay);
    try {
      TimeUnit.SECONDS.sleep(1);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }

    ///////////////////////////// methods for
    ///////////////////////////// mathematics/////////////////////////////////////

    // mathematical operation using division method
    // this math operation is used to change dollar bills into quarters
    System.out.println("\t");
    System.out.println("Please enter dollar bill");
    Scanner in = new Scanner(System.in);
    int dollar = in.nextInt();
    double quarter = 0.25;
    if (dollar > 0) {
      // I could use the division method created below
      // System.out.println("Amount of quarters: " + divisionCalc(dollar, quarter));
      // or I could use:
      double change;
      change = dollar / quarter;
      System.out.println("\t");
      System.out.println("The amount of quarters to be received: " + (int) change);
    }
    try {
      TimeUnit.SECONDS.sleep(1);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
///////////////////////////////// Flip A Coin////////////////////////////////////////////

    System.out.println("Hey " + userName + " Heads or Tails? (1 = Heads, 2 = Tails)");
    Scanner option = new Scanner(System.in);
    int userIn = option.nextInt();
    int coinFlip = flipACoin(userIn);

    if (coinFlip % userIn == 0) {
      System.out.println("It's Heads.");
    } else if (coinFlip % userIn == 1) {
      System.out.println("It's Tails.");
    }
    System.out.println("\t");
    option.close();
////////////// a major mathematical operation with the use of methods////////////////////

    // the purpose of this portion of code that gives you the number of hours and
    // minutes you have given the number of days
    System.out.println("Okay " + userName);
    System.out.println("This portion of code provides you with the amount of hours and"
                      + " minutes you have" + " based on the number of days you enter.");
    System.out.println("Start by entering the amount of days you would like to enter:");
    int days = input.nextInt();
    System.out.println("\t");
    System.out.println("Days entered: " + days);
    if (days <= 0) {
      int status = 1;
      System.out.println("Invalid input. Please enter amount of days");
      System.exit(status);
    } else {
      int hrs = 24;
      System.out.println("The amount of hours in " + days + " days: "
                          + (hrsPerDay(days)) + " hours.");
      System.out.println("The amount of minutes in " + days + " days: " 
                          + minsPerDay(days) + " minutes.");
      System.out.println("The amount of seconds in " + days + " days: "
                          + secsPerDay(days) + " seconds.");
      System.out.println("\t");
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

      System.out.println("SCHEDULE THIS WEEK:");
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
      System.out.println("Dr. Patterson: " + totalPerDoc[0] + ", Dr. Michaels: "
                          + totalPerDoc[1] + ", Dr. Goldstein: " + totalPerDoc[2] + ".");
      System.out.println("Max patients per day: " + maxPatientsPer(totalPerDay) + ".");
      System.out.println("Max patients per doctor:" + maxPatientsPer(totalPerDoc) + ".");
      System.out.println("\t");

      /// the use of a while loop in order to speed or slow car down to the speed
      /// limit
      System.out.println("The speed limit is 55mph. How fast are you going?");
      Scanner enter = new Scanner(System.in);
      int answer = enter.nextInt();

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
      }

      else {
        System.out.println("Invalid Number");
      }
      enter.close();

    }
    //////////////////////////// An array of Grades in the
    //////////////////////////// classroom//////////////////////////
    System.out.println("An array of students submitted their exams.");
    System.out.print("Of all 20 of them, the lowest grade is: ");
    int[] grades = { 82, 68, 78, 94, 97, 86, 58, 63, 75, 92,
                     88, 67, 78, 96, 80, 71, 60, 98, 82,77 };

    lowestGrade(grades);
    System.out.println("The total amount of points that the class have accumulated"
        + "from the test is: " + sumOfAllGrades(grades) + "/" + "2000 pts");
    double avg = divisionCalc(sumOfAllGrades(grades), 2000);
    System.out.println("Which brings you the Grade average of: " + (avg * 100) + "%");
    System.out.println("The highest test grade ever recorded for this test is 98.");
    System.out.println("Upon checking, it looks like test number "
                        + (searchArray(grades, 98) + 1) + " has been graded a 98!");
    displayGrades(grades);
    System.out.println("\t");

    //////////////////////////////////// String
    //////////////////////////////////// Builder///////////////////////////////////////
    // New string to use String builder methods
    String palindrome = "DOG = GOD";
    System.out.println("Did you know that the sentence: " + palindrome
                        + ", spelled backwards is itself?");

    // String builder to reverse the String order
    StringBuilder mySB = new StringBuilder(palindrome);
    int timer = 0;
    while (timer < 2) {
      System.out.println("Reversing...");
      timer++;
      try {
        TimeUnit.SECONDS.sleep(1);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
    mySB.reverse();

    System.out.println("Reversed: " + mySB);
    System.out.println("\t");

    // String builder to delete a part of the string
    StringBuilder myPOTUS = new StringBuilder(palindrome);
    myPOTUS.delete(4, 9);
    myPOTUS.append("FOR PRESIDENT!");

    System.out.println(myPOTUS);

    // String builder to replace a part of the string
    StringBuilder hero = new StringBuilder(palindrome);
    hero.replace(0, 4, "Thor ");
    hero.append(" OF THUNDER!");

    System.out.println(hero);

    ////////////////////// MY POKEMON OBJECT////////////////////////////////////////////
    System.out.println("Guess what " + userName + "!");
    System.out.println("I just caught my very first pokemon. Check out my PokeDex.");
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
  }
  ////////////////////////////////////METHODS////////////////////////////////////////////

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
  private static double mulitplicationCalc(double number1, double number2) {
    // this method contains two
    // double datatype parameters
    double product;
    product = number1 * number2;
    return product;

  }

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
    for (int i = 1; i < grades.length; i++) {
      if (grades[i] < smallest)
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
