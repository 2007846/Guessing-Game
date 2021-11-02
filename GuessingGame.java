class GuessingGame{
  
  public static final int[] TESTNUMS = {55,56,11};
  
  public static void main(String[] args){
    System.out.println();
    System.out.println("I AM GUESSING_GAME!");
    System.out.println();

  }
  
  // This method takes a game counter, starting at 1 
  // and uses that number to chose from a constant set of 3
  // presumed guess answers that match the output test.
  // use this method to pass your tests, then swap it for 
  // a method that produces an actual random number.
  
  public static int randTester(int gameCount ){
    return TESTNUMS[(gameCount-1)%3];
  }


}