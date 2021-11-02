import java.util.Scanner;
import java.util.Random;

/*
  This file is not part of your project.
  It is here to demonstrate a helper method you should use
  to check your code against the output test.

  The output test compares actual results to expected results,
  but struggles to account for expected RANDOM results.

  ...thus this helper method suspends the random behavior.
*/

class Main {

  public static boolean works = true;

  public static void main(String[] args) {
    System.out.println();
    System.out.println("Type in a number, you will be told whether your number is higher or lower than the chose number, continue guessing numbers until you guess the correct one");
    System.out.println();
    Random word = new Random(100);
    int a = word.nextInt(100);
    System.out.println(a);
  }
}