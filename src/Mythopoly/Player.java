package Mythopoly;

public class Player {
    private int money;
    private String counter;
    private String name;
    private int position;
    public boolean missAGo = false;

    
    public Player(String vCounter, String vName) {
        position = 0;
        money = 2500;
        counter = vCounter;
        name = vName;        
    }
    
    public char GetCounter() {
        return counter.toCharArray()[0];
    }
    
    public void increasePosition(int increaseBy) {
        position = (position + increaseBy);
        if (position > 26) {
            System.out.println("You got £500 for passing start.");
            money += 500;
        }
        else if (position == 26) {
            System.out.println("You got £1000 for landing on start.");
            money += 1000;
        } 
        position = position % 26;
    }
    
    public int GetPosition() {
        return position;
    }

    public String GetName(){
        return name;
    }
    public int GetMoney(){
        return money;
    }
    public void PrintPlayer(){
        System.out.println(this);
    }
    
    public String PlayerDrawsChanceCard (){
        ChanceCard tPickCard = Mythopoly.MythopolyGame.AllChanceCards.GetTopCard();    //Use static to access List in Mythopoly
        money += tPickCard.GetValue();
        return tPickCard.toString();
    }
    
    public void addMoney(int tMoney) {
        money += tMoney;
    }
    
    @Override
    public String toString() {
      return String.format("Player %s [%s] Cash £%d",name,counter,money);
    }
}
