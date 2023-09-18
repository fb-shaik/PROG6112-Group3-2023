
package demosugarsmash_g3;
//SuperClass: SugarSmashPlayer (Free player)
//Base class that will contain methods for setting & getting info regarding the first 10 levels of the game
public class SugarSmashPlayer {

    //Fields to store player information & scores
    private int playerID;
    private String screenName;
    private int [] scores;
    
    //parameterized constructor to intialize playerID, screenName & scores array 
      public SugarSmashPlayer(int playerID, String screenName) {
        this.playerID = playerID;
        this.screenName = screenName;
        this.scores = new int[10]; //limit the base player to only the first 10 levels of the game
    }

      //Getter & setter methods for the PlayerID
    public int getPlayerID() {
        return playerID;
    }
    public void setPlayerID(int playerID) {
        this.playerID = playerID;
    }
//Getter & setter methods for the ScreenName
    public String getScreenName() {
        return screenName;
    }
    public void setScreenName(String screenName) {
        this.screenName = screenName;
    }
    
    //Method to get a score for a specific game level
    public int getScore(int level){
        if(level <1 || level >10){
            System.out.println("Error: Invalid Level request");
            return -1; //returns invalid due to a game level outside of range 1 to 10
        }
    return scores[level-1]; //returns the corresponding level score based on its subscript position
    }
    
    //Method to set a score for specific game level
    public void setScore(int score, int level)
    {
        if(level <1 || level >10){
            System.out.println("Error: Invalid Level! ");
            return;
        }
        if(level!=1 && score <100){
            System.out.println("Error: Minimum 100 points required to unlock this level.");
            return;
        }
        if(level>1 && scores[level-2] <100){
            System.out.println("Error: Previous level must have at least 100 points to unlock this level.");
            return;
        }
        scores[level - 1] = score;
            }
    
}
