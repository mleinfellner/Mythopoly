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

    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Players tPlayers = new Players();
        
        Player tNewPlayer1=new Player(2000,'#');
        tNewPlayer1.AddAnimal(new Animal("Kraken"));
        tNewPlayer1.AddAnimal(new Animal("Cyclops"));
        tPlayers.AddPlayer(tNewPlayer1);
        
        
        Player tNewPlayer2=new Player(2000,'@');
        tNewPlayer2.AddAnimal(new Animal("Dragon"));
        tNewPlayer2.AddAnimal(new Animal("Boromir"));
        tPlayers.AddPlayer(tNewPlayer2);

        tPlayers.PrintPlayers();
    }
    
}
