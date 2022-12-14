package com.tlglearning.animals;

public class Dog extends Wolf {

  static {
    System.out.println("Dog initialization block");

  }

  private static int intializeValue() {
    System.out.println("Dog.initializeValue");
    return -2;
  }
  private static final int My_Constant = intializeValue();

  @Override
  public void vocalize() {
    System.out.println("Bark like a dog!");
  }

  @Override
  public void hunt() {
    System.out.println("Hunt for balls, bones, leaves, etc.");
  }

  public static void whoAmI() {

    System.out.println("I am a dog/puppy!");
  }

  public void rollOver() {
    System.out.println("I'm rolling over, the best dog ever!");
  }


}
