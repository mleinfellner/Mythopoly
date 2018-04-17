package Mythopoly;

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
        boolean tQuit=false;
        Dice die1 = new Dice(6);
        Dice die2 = new Dice(6);
        while(!tQuit) {
            for(int tPlayerIndex =0;tPlayerIndex<4;tPlayerIndex++) {
                Player  tPlayer=AllPlayers.GetPlayer(tPlayerIndex);
                if(tPlayer!=null && tPlayer.missAGo == false) {
                    Helpers.ReadString("Press key: ");
                    int dieValue1 = die1.roll();
                    int dieValue2 = die2.roll();
                    int total = dieValue1 + dieValue2;
                    tPlayer.increasePosition(total); 
                    System.out.println("You rolled " + total);
                    System.out.println("Balance: "+tPlayer);
                    if (dieValue1 == dieValue2) {
                        System.out.println("You rolled a double!");
                        String tCard = tPlayer.PlayerDrawsChanceCard();
                        System.out.println("Card: " +tCard + " " +tPlayer);
                    }
                    if (tPlayer.GetPosition() == 13) {
                        tPlayer.missAGo = true;
                        System.out.println(tPlayer.GetName() + " will miss a turn.");
                    }
                    theBoard.printBoard();
                }
                else {
                    tPlayer.missAGo = false;
                }
                
            }
        }
    }
}


