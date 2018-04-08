/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mythopoly;

import java.util.LinkedList;
import java.util.Random;

/**
 *
 * @author maxle
 */
public class ChanceCards {
    
     private LinkedList<ChanceCard> ChanceCards = new LinkedList<>();       //List of possible chance cards
     
     private Random RandomGen=new Random();

     private void   AddDefaultCards() {
         ChanceCards.add(new ChanceCard("Mythical Vet Bill",-150));
         ChanceCards.add(new ChanceCard("Mythical Food Bill",-65));
         ChanceCards.add(new ChanceCard("Destruction of Property Bill",-250));
         ChanceCards.add(new ChanceCard("Mythical Tax",-100));
         ChanceCards.add(new ChanceCard("Pay A Fine For Not Cleaning Up After Your Animal",-20));
         ChanceCards.add(new ChanceCard("Speeding Fine",-75));
         ChanceCards.add(new ChanceCard("Bad placeholder1",-25));
         ChanceCards.add(new ChanceCard("Bad placeholder2",-25));
         ChanceCards.add(new ChanceCard("Bad placeholder3",-25));
         ChanceCards.add(new ChanceCard("Bad placeholder4",-25));
         ChanceCards.add(new ChanceCard("Good placeholder6",25));
         ChanceCards.add(new ChanceCard("Good placeholder5",25));
         ChanceCards.add(new ChanceCard("Good placeholder4",25));
         ChanceCards.add(new ChanceCard("Good placeholder3",25));
         ChanceCards.add(new ChanceCard("Good placeholder2",25));
         ChanceCards.add(new ChanceCard("Good placeholder1",25));
         ChanceCards.add(new ChanceCard("A Rich Entrepreneur Has Left You A Inheritence",250));
         ChanceCards.add(new ChanceCard("Bank Error In Your Favour",200));
         ChanceCards.add(new ChanceCard("Your Mythical Animal Won A Race",75));
         ChanceCards.add(new ChanceCard("Your Mythical Animal Has Won A Beauty Competition",50));
     }
     
     public void    Initialise() {
         AddDefaultCards();
         ShuffleCards();
     }
     
     private void ShuffleCards(){  //shuffles the chance cards
         LinkedList<ChanceCard> tShuffleCards = new LinkedList<>();
         while(true){
             ChanceCard tPickedCard = RemoveRandomCard();
             if(tPickedCard == null)  break;
             tShuffleCards.add(tPickedCard);
         }
         ChanceCards = tShuffleCards;
     }
     public void PrintCards(){  //prints out the chance cards
         System.out.printf("%d Cards\n", ChanceCards.size());
         for(ChanceCard tChanceCard : ChanceCards){
             System.out.println(tChanceCard);
         }
     }
     
     private ChanceCard RemoveRandomCard(){
        ChanceCard tChanceCard = null;
        int tCount = ChanceCards.size();
        if(tCount>0){
            int tPickIndex=RandomGen.nextInt(tCount);
            return ChanceCards.remove(tPickIndex);
        }
        return tChanceCard;
     }
     
     public ChanceCard GetTopCard(){
        ChanceCard tChanceCard = ChanceCards.removeFirst();
        ChanceCards.addLast(tChanceCard);
        return tChanceCard;
     }
}
