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
    
    public static void main(String[] args) {
        // TODO code application logic here
        MythopolyGame=new Mythopoly();  //creates a new mythopoly class
        MythopolyGame.Play();  //this plays the game
    }
    
    Mythopoly() {
        AllPlayers=new Players();  //this sets up players
    }
    
    void    Play() {
        boolean tQuit=false;
        
        
        
        while(!tQuit) {
            
        }
    }
}
