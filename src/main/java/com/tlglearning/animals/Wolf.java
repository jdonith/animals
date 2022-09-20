package com.tlglearning.animals;

public class Wolf {

  private static final int MY_CONSTANT = initializeValue();


  private static int initializeValue() {
    System.out.println("Wolf.initalizeValue");
    return -1;
  }

  public void vocalize() {
    System.out.println("Howl like a puppy dog!");
  }

  public void hunt() {
    System.out.println("hunt in packs for rabbits and bring it back to the master");
  }

  public static void whoAmI() {
    System.out.println("I am a WolfDog");
  }


}
