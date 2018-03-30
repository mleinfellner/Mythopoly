/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mythopoly;

import java.util.LinkedList;

/**
 *
 * @author maxle
 */
public class Player {
    public int money;
    public char counter;
    public LinkedList<Animal> Animals;
    
    public Player(int vMoney,char vCounter ) {
        money=vMoney;
        counter=vCounter;
        Animals=new LinkedList<>();
    }
    
    public void AddAnimal(Animal vAnimal) {
        Animals.add(vAnimal);
    }
    
    public void PrintAnimals(){
        for(int i=0; i<Animals.size();i++) {
            System.out.println(Animals.get(i));
        }
    }
    
    
  @Override
  public String toString() {
    return String.format("Player %c Cash £%d",counter,money);
  }
}
