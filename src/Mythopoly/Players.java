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
public class Players {
    public LinkedList<Player> Players;
    
    public Players(){
        Players=new LinkedList<>();
    }
    
    public void AddPlayer(Player vPlayer) {
        Players.add(vPlayer);
    }
    
    public void PrintPlayers(){
        for(int i=0; i<Players.size(); i++){
            Players.get(i).PrintPlayer();
        }
    }
    
}
