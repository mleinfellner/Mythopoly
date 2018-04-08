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
    private String name;
    private int value; 
    
    public ChanceCard(String vName, int vValue) {
        name=vName;
        value=vValue;
    }
    
    public int GetValue(){
        return value;
    }
    
    public String GetName(){
        return name;
    }
    
    @Override
    public String toString() {
        if (value<0){
            return String.format("%s Pay £%d",name, -value);  //used for negative payments
        } else {
            return String.format("%s Collect £%d",name, value);  //used for positive payments
        }
    }
}
