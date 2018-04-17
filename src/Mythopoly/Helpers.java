package Mythopoly;

import java.util.Scanner;

public class Helpers {
       public   static   int ReadNumber(int vLow, int vHigh) {  // reads the number input in a certain range
        int tNumber = -1;
        String tLine = "Nothing";
        Scanner tReader = new Scanner(System.in);
        boolean tSuccess = false;
        while(!tSuccess) {
            System.out.print(String.format("Type in a number between %d and %d: ",vLow, vHigh));
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
    
    public  static  String  ReadStringNotEmpty(String vPrompt) {  //reads the string so it can be used later in the code 
        String  tValue = null;
        Scanner tReader = new Scanner(System.in);
        do {
            System.out.print(vPrompt);
            tValue = tReader.nextLine();  //gets next line in input buffer
        } while(tValue.length()==0);
        return  tValue;
    }
    
    public  static  String  ReadString(String vPrompt) {  //reads the string so it can be used later in the code 
        String  tValue = null;
        Scanner tReader = new Scanner(System.in);
        System.out.print(vPrompt);
        tValue = tReader.nextLine();  //gets next line in input buffer
        return  tValue;
    }    
}
