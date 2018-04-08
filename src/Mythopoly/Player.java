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
    private int money;
    private String counter;
    private String name;

    
    public Player(String vCounter, String vName) {
        money=2000;
        counter=vCounter;
        name=vName;        
    }


    public String GetName(){
        return name;
    }
    public int GetMoney(){
        return money;
    }
    public void PrintPlayer(){
        System.out.println(this);
    }
    
    public String PlayerDrawsChanceCard (){
        ChanceCard tPickCard=Mythopoly.MythopolyGame.AllChanceCards.GetTopCard();    //Use static to access List in Mythopoly
        money += tPickCard.GetValue();
        return  tPickCard.toString();
    }
    
    @Override
    public String toString() {
      return String.format("Player %s [%s] Cash £%d",name,counter,money);
    }
}
