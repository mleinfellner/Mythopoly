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
    private int numPlayers = 0;
    
    public Players(){
         Counters.add("#"); //adding possible counters
         Counters.add("@");
         Counters.add("!");
         Counters.add("+");
         Counters.add("&");
         Counters.add("$");

    }
     
    void DisplayAvailableCounters(){  //displays the counter that are left to choose
        int     tIndex = 1;
        for(String tCounter : Counters)  {
            System.out.println(String.format("%d = %s", tIndex++,tCounter));
        }
    }
    
    public void AddPlayer() {  //adds a player to the game
        String tPlayerName = Helpers.ReadStringNotEmpty("Please enter your name:");
        DisplayAvailableCounters();
        int tCounterChoice = Helpers.ReadNumber(1,Counters.size());
        String tCounter = Counters.remove(tCounterChoice-1);  //get the string at index and remove it from list
        Player tPlayer = new Player(tCounter, tPlayerName);  //make a new player
        Players.add(tPlayer);  //add player to list of players
        numPlayers ++;
    }
    
    public void PrintPlayers(){  //prints the players details after every player is setup
        for(Player tPlayer : Players){
            tPlayer.PrintPlayer();
            
        }
    }

    public Player GetPlayer(int vIndex){
        if(vIndex<0 || vIndex>=Players.size())  return null; //player index is wrong
        return Players.get(vIndex);
    }
    
    public int getNumPlayers() {
        return numPlayers;
    }
    
}

