package Mythopoly;

import java.util.Arrays;

public class Animals {
    
    /*  Name, rent price, level, buy price, owned, board position, player owner index*/

   String[][] animals = {
       {"NULL", "0","0","0","0","0","0"},
       {"Chupacabra", "50", "0","300","0","0","0"},
       {"Kaijin", "50", "0","300","0","2","0"},
       {"Black Shuck", "50", "0","300","0","3","0"},
       {"Kelpie", "50", "0","300","0","4","0"},
       {"Igopogo", "50", "0","300","0","5","0"},
       {"Kappa", "50", "0","300","0","6","0"},
       {"Bunyip", "125", "0","450","0","7","0"},
       {"Monkey Man of Delhi", "125", "0","450","0","8","0"},
       {"Minotaur", "125", "0","450","0","9","0"},
       {"Himalayan Yeti", "125", "0","450","0","10","0"},
       {"Leviathan", "125", "0","450","0","11","0"},
       {"Basilisk", "125", "0","450","0","12","0"},
       {"NULL","0","0","0","0","0","0"},
       {"Thunderbird", "200", "0","600","0","14","0"},
       {"Bigfoot", "200", "0","600","0","15","0"},
       {"Cyclops", "200", "0","600","0","16","0"},
       {"Pegasus", "200", "0","600","0","17","0"},
       {"Werewolf", "200", "0","600","0","18","0"},
       {"Kraken", "200", "0","600","0","19","0"},
       {"Loch Ness Monster", "300", "0","800","0","20","0"},
       {"Griffin", "300", "0","800","0","21","0"},
       {"Mongolian Death Worm", "300", "0","800","0","22","0"},
       {"Unicorn", "300", "0","800","0","23","0"},
       {"Phoenix", "300", "0","800","0","24","0"},
       {"Dragon", "300", "0","800","0","25","0"}
   };

   public String name(int position) {
       return animals[position][0];
   }
   
   public int rent(int position) {
       int cost = Integer.parseInt(animals[position][1]);
       return cost;
    }

    public int level(int position) {
        int animalLevel = Integer.parseInt(animals[position][2]);
        return animalLevel;
    }

    public int upgradePrice(int position) {
       return buy(position);
    }
    
    public void upgrade(int position) {
        animals[position][2] = String.valueOf(level(position) + 1);
        animals[position][1] = String.valueOf(rent(position) * 2);
    }

    public int buy(int position) {
       int animalBuy = Integer.parseInt(animals[position][3]);
       return animalBuy;
    }

    public int owned(int position) {
       int animalOwned = Integer.parseInt(animals[position][4]);
       return animalOwned;
    }
    
    public int owner(int position) {
       int animalOwner = Integer.parseInt(animals[position][6]);
       return animalOwner;
    }

     public int bposition(int position) {
        int animalBPosition = Integer.parseInt(animals[position][5]);
        return animalBPosition;
    }
     
    public void setOwned(int position, int owner) {
        animals[position][4] = "1";
        animals[position][6] = String.valueOf(owner);
    }

}
