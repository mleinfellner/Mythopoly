package Mythopoly;
public class Board {
    private Players players;
    public Board(Players gPlayers) {
        this.players = gPlayers;
    }
    public int printBoard() {
        int returnValue = -1; 
        int[] positions = {100,112,124,136,148,160,172,184,674,1164,1654,2144,2634,3124,3112,3100,3088,3076,3064,3052,3040,2550,2060,1570,1080,590};
        int[] playersOnSquares = new int[26];
        String boardText = (" ___________ ___________ ___________ ___________ ___________ ___________ ___________ ___________ \n" +
                            "|           |           |           |           |           |           |           |           |\n" +
                            "|           |           |           |           |           |           |           |           |\n" +
                            "|   Start   |     1     |     2     |     3     |     4     |     5     |     6     |     7     |\n" +
                            "|           |           |           |           |           |           |           |           |\n" +
                            "|___________|___________|___________|___________|___________|___________|___________|___________|\n" +
                            "|           |                                                                       |           |\n" +
                            "|           |                                                                       |           |\n" +
                            "|    25     |                                                                       |     8     |\n" +
                            "|           |                                                                       |           |\n" +
                            "|___________|                                                                       |___________|\n" +
                            "|           |                                                                       |           |\n" +
                            "|           |                                                                       |           |\n" +
                            "|    24     |                                                                       |     9     |\n" +
                            "|           |          ________________                                             |           |\n" +
                            "|___________|         |                |                                            |___________|\n" +
                            "|           |         |                |                                            |           |\n" +
                            "|           |         |                |                                            |           |\n" +
                            "|    23     |         |                |                                            |    10     |\n" +
                            "|           |         |                |                                            |           |\n" +
                            "|___________|         |      Deck      |                                            |___________|\n" +
                            "|           |         |                |                                            |           |\n" +
                            "|           |         |                |                                            |           |\n" +
                            "|    22     |         |                |                                            |    11     |\n" +
                            "|           |         |                |                                            |           |\n" +
                            "|___________|         |________________|                                            |___________|\n" +
                            "|           |                                                                       |           |\n" +
                            "|           |                                                                       |           |\n" +
                            "|    21     |                                                                       |    12     |\n" +
                            "|           |                                                                       |           |\n" +
                            "|___________|___________ ___________ ___________ ___________ ___________ ___________|___________|\n" +
                            "|           |           |           |           |           |           |           |           |\n" +
                            "|           |           |           |           |           |           |           |  Miss a   |\n" +
                            "|    20     |    19     |    18     |    17     |    16     |    15     |    14     |   turn    |\n" +
                            "|           |           |           |           |           |           |           |           |\n" +
                            "|___________|___________|___________|___________|___________|___________|___________|___________|\n" );
        char[] boardTextChars = boardText.toCharArray();
        //boardTextChars[590] = 'x';
        int numPlayers = players.getNumPlayers();
        for (int p = 0; p < numPlayers; p++) {
            int playerPosition = players.GetPlayer(p).GetPosition();
            boardTextChars[positions[playerPosition]+ playersOnSquares[playerPosition] * 2] = players.GetPlayer(p).GetCounter();
            playersOnSquares[playerPosition] ++; 
            if (playerPosition == 13) {
                returnValue = p;
                System.out.println(players.GetPlayer(p).GetName() + "will miss a go");
            }
        }
        boardText = String.valueOf(boardTextChars);
        System.out.println(boardText);
        return returnValue;
    }
        
}
