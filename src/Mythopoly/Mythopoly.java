package Mythopoly;

import java.util.Scanner;

public class Mythopoly {

    public static Mythopoly MythopolyGame;
    
    public Players AllPlayers; 
    public ChanceCards AllChanceCards;
    public Board theBoard;
    
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
        
        theBoard = new Board(AllPlayers);   //this sets up the board
        
        //Initialise Cards
        AllChanceCards=new ChanceCards();  //this sets up chance cards
        AllChanceCards.Initialise();   //adds 20 cards & Shuffles
    }
    
    void Play() {
        boolean tQuit = false;
        Animals animals = new Animals();
        Dice die1 = new Dice(6);
        Dice die2 = new Dice(6);
        while(!tQuit) {
            for(int tPlayerIndex = 0; tPlayerIndex < 4; tPlayerIndex ++) {
                Player  tPlayer=AllPlayers.GetPlayer(tPlayerIndex);
                if(tPlayer!=null && tPlayer.missAGo == false) {
                    Helpers.ReadString("Press key: ");
                    int dieValue1 = die1.roll();
                    int dieValue2 = die2.roll();
                    int total = dieValue1 + dieValue2;
                    theBoard.printBoard();
                    tPlayer.increasePosition(total);
                    System.out.println("Balance: "+tPlayer);
                    System.out.println("You rolled " + total + ".");
                    int position = tPlayer.GetPosition();
                    
                    if (position != 0 && position != 13)
                        System.out.println("You've landed on the " + animals.name(position) + ".");
                    
                    if (dieValue1 == dieValue2) {
                        System.out.println("You rolled a double!");
                        String tCard = tPlayer.PlayerDrawsChanceCard();
                        System.out.println("Card: " +tCard + " " +tPlayer);
                    }
                    
                    if (position == 13) {
                        tPlayer.missAGo = true;
                        System.out.println(tPlayer.GetName() + " will miss a turn.");
                    }
                    
                    if (animals.owned(position) == 1) {
                        System.out.println("This animal is on level " + animals.level(position));
                        if (animals.owner(position) != tPlayerIndex) {
                            tPlayer.addMoney(-animals.rent(position));
                            System.out.println("You have been charged £" + animals.rent(position) + " rent for landing on the " + animals.name(position) + ".");
                            System.out.println("Your balance is now £" + tPlayer.GetMoney() + ".");
                            AllPlayers.GetPlayer(animals.owner(position)).addMoney(animals.rent(position));
                            System.out.println(AllPlayers.GetPlayer(animals.owner(position)));
                        }
                        else {
                            if (animals.level(position) < 3) {
                                System.out.print("Would you like to upgrade " + animals.name(position) + " for £" + animals.upgradePrice(position) + "? Enter Y/N: ");
                                Scanner reader = new Scanner(System.in);
                                char choice = reader.next().charAt(0);
                                if (choice == 'y' || choice == 'Y') {
                                    if(tPlayer.StopUpgrade(animals.upgradePrice(position)))
                                    {
                                        System.out.println("You can't afford the upgrade");
                                    }
                                    else{
                                        tPlayer.addMoney(-animals.upgradePrice(position));
                                        animals.upgrade(position);
                                        System.out.println("You have been charged £" + animals.upgradePrice(position) + " for the upgrade to level " + animals.level(position) + ".");
                                        System.out.println("Your balance is now £" + tPlayer.GetMoney() + ".");
                                    }
                                    
                                } 
                            }
                        }
                    }
                    else if (position != 0 && position != 13){
                        System.out.print("Would you like to buy the " + animals.name(position) + " for £" + animals.buy(position) + "? Enter Y/N: ");
                        Scanner reader = new Scanner(System.in);
                        char choice = reader.next().charAt(0);
                        if (choice == 'y' || choice == 'Y') {
                        if(tPlayer.StopBuy(animals.buy(position)))
                            {
                                System.out.println("You can't afford this animal");
                            }
                            else
                            {
                                tPlayer.addMoney(-animals.buy(position));
                                System.out.println("Congrats you have successfully purchased " + animals.name(position) + ".");
                                animals.setOwned(position, tPlayerIndex);
                                System.out.println("Your balance is now £" + tPlayer.GetMoney() + ".");
                            }                            
                        }
                    }
                }
                else {
                    tPlayer.missAGo = false;
                }
            }
        }
    }
}


