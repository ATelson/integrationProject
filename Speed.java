/**
 * Author: Allen Telson.
 *  This class demonstrates the creation if-else statements for a method used to
 *  determine the speed in which you are currently going 
 */
public class Speed {

  static String watchYourSpeed(int velocity) throws Exception {
    if (velocity > 45) {
      System.out.println("Watch your speed!");
    } else if (velocity < 45) {
      /**
       * from 0 to 45, the program will say "You can increase your speed.".
       */
      System.out.println("You can increase your speed.");
    } else if (velocity == 45) {
      System.out.println("You are going the speed limit.");
    }

    return null;
  }
}