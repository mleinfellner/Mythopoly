package Mythopoly;
import java.util.Random;
 
public class Dice {
     private int sides;
     Random rand = new Random();
   
    public Dice(int sides){
        this.sides = sides;
    }
    public int roll(){
        int die;
        die = rand.nextInt(sides);
        die++;
        return die;
    }
}
