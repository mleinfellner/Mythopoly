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
        Player tNewPlayer=new Player(2000,'#');
        System.out.println(tNewPlayer);
        
       
        tNewPlayer.AddAnimal(new Animal("Kraken"));
        tNewPlayer.AddAnimal(new Animal("Cyclops"));
        tNewPlayer.AddAnimal(new Animal("Dragon"));
        tNewPlayer.AddAnimal(new Animal("Boromir"));

        tNewPlayer.PrintAnimals();
    }
    
}
