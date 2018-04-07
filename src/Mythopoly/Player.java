/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mythopoly;

/**
 *
 * @author maxle
 */
public class Player {
    public int money;
    public String counter;
    public String name;

    
    public Player(String vCounter, String vName) {
        money=2000;
        counter=vCounter;
        name=vName;        
    }

    
    public void PrintPlayer(){
        System.out.println(this);
    }
    
    @Override
    public String toString() {
      return String.format("Player %s [%s] Cash £%d",name,counter,money);
    }
}
