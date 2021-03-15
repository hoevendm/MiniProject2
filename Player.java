/*
Mini Project 2
@author Group #5: Daniel Hoevener, Noah Hornback, Myron Rankins, Jillian Sizemore
@version Date: 3/15/21

This class decides the eggs that will be found by each player and builds the basket.
*/


import java.util.ArrayList;

class Player {
  private int eggs;
  private ArrayList<Egg> basket;

  Player() {
    eggs = 0;
    basket = new ArrayList<Egg>();
  }

  public int getNumEggs() {
    return eggs;
  }

  public ArrayList<Egg> getBasket() {
    return basket;
  }

  public void printBasket(){
    for(int i = 0; i<basket.size(); i++) {
      basket.get(i).printEgg();
    }
  }

  public void foundEgg(Egg foundAnEgg) {
    eggs++;
    basket.add(foundAnEgg);
  }

}