/*
Mini Project 2
@author Group #5: Daniel Hoevener, Noah Hornback, Myron Rankins, Jillian Sizemore
@version 3/15/21

This class randomly sets up the color and content of the eggs.
*/

import java.util.Random;


class Egg {
  private String color;
  private String contents;

  Egg() {
    color = randomColor();
    contents = randomContents();
  }

  public String randomColor() {
    Random r = new Random();
    String colors[] = {"blue", "pink", "yellow", "green"};
    int color = r.nextInt(4);
    return colors[color];
  }

  public String randomContents() {
    Random r = new Random();
    String contents[] = {"Cadbury Egg", "Reese's Egg", "Pink Starbust", "Yellow Peep", "25 cents", "50 cents", "One dollar"};
    int content = r.nextInt(7);
    return contents[content];

  }

public String getColors() {
  return color;
}

public String getContents() {
  return contents;
}

public void printEgg() {
  System.out.println(color + " egg contains " + contents);
}
}