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
public class ChanceCard {
    public String name;
    
    public ChanceCard(String vName) {
        name=vName;
    }
    
    @Override
    public String toString() {
    return String.format("Card: %s",name);
  }
}
