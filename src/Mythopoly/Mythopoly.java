/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mythopoly;

/**
 *
 * @author rlein
 */
public class Mythopoly {

    public  static  Mythopoly   MythopolyGame;
    
    public  Players AllPlayers; 
    public ChanceCards AllChanceCards;
    
    public static void main(String[] args) {
        // TODO code application logic here
        MythopolyGame=new Mythopoly();  //creates a new mythopoly class
        MythopolyGame.Play();  //this plays the game
    }
    
    Mythopoly() {
        AllPlayers=new Players();  //this sets up players
        
        //Test by adding 4 players
        for(int i = 1; i <= 4; i++) {  //allows upto 4 players
             System.out.println(String.format("Player %d", i));
            AllPlayers.AddPlayer();  //call this to ask user for name and counter choice, sets up player
         }
        
        //Initialise Cards
        AllChanceCards=new ChanceCards();  //this sets up chance cards
        AllChanceCards.Initialise();   //adds 20 cards & Shuffles
 

    }
    
    void    Play() {
        boolean tQuit=false;
     
        while(!tQuit) {
            for(int tPlayerIndex =0;tPlayerIndex<4;tPlayerIndex++) {
                Player  tPlayer=AllPlayers.GetPlayer(tPlayerIndex);
                if(tPlayer!=null) {
                    Helpers.ReadString("Press key");
                    System.out.println("Before:"+tPlayer);
                    String tCard = tPlayer.PlayerDrawsChanceCard();
                    System.out.println("Card:" +tCard + " " +tPlayer);
                }
            }
        }
    }
}
