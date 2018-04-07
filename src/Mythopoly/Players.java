/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mythopoly;

import java.util.LinkedList;
import java.util.Scanner;

/**
 *
 * @author maxle
 */
public class Players {
    private LinkedList<Player> Players = new LinkedList<>();  //list of players
    private LinkedList<String> Counters = new LinkedList<>();  //list of counters
    
    
     public Players(){
         Counters.add("#"); //adding possible counters
         Counters.add("@");
         Counters.add("!");
         Counters.add("+");
         Counters.add("&");
         Counters.add("$");
         for(int i = 1; i <= 4; i++) {  //allows upto 4 players
             System.out.println(String.format("Player %d", i));
            AddPlayer();
         }
         
         PrintPlayers();
    }
     
    void DisplayAvailableCounters(){  //displays the counter that are left to choose
        int     tIndex = 1;
        for(String tCounter : Counters)  {
            System.out.println(String.format("%d = %s", tIndex++,tCounter));
        }
    }
    
    public void AddPlayer() {  //adds a player to the game
        String tPlayerName = ReadString("Please enter your name:");
        DisplayAvailableCounters();
        int tCounterChoice = ReadNumber(1,Counters.size());
        String tCounter = Counters.remove(tCounterChoice-1);  //get the string at index and remove it from list
        Player tPlayer = new Player(tCounter, tPlayerName);  //make a new player
        Players.add(tPlayer);  //add player to list of players
    }
    
    public void PrintPlayers(){  //prints the players details after every player is setup
        for(Player tPlayer : Players){
            tPlayer.PrintPlayer();
        }
    }
    
    int ReadNumber(int vLow, int vHigh) {  // reads the number input in a certain range
        int tNumber = -1;
        String tLine = "Nothing";
        Scanner tReader = new Scanner(System.in);
        boolean tSuccess = false;
        while(!tSuccess) {
            System.out.print(String.format("Type in a number between %d and %d:",vLow, vHigh));
            try {  //try tries the code out even if it might crash
                    tLine=tReader.nextLine();
                    tNumber = Integer.parseInt(tLine);
                    tSuccess = (tNumber>=vLow && tNumber<=vHigh); //this is true if it meets the paramaters 
            } catch (NumberFormatException vException) {  //the catch stops the code from crashing
                System.out.println(String.format("Error %s not a number",tLine));
            }
        }
        return tNumber;
    }
    
    String  ReadString(String vPrompt) {  //reads the string so it can be used later in the code 
        String  tValue = null;
        Scanner tReader = new Scanner(System.in);
        do {
            System.out.print(vPrompt);
            tValue = tReader.nextLine();  //gets next line in input buffer
        } while(tValue.length()==0);
        return  tValue;
        
    }
    
}

