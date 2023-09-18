
package demosugarsmash_g3;

//Subclass of the SugarSmashPlayer
//This will be the behaviour for the Premium player who has access to additional 40 levels of game play
//keyword for inheritance: extends
public class PremiumSugarSmashPlayer extends SugarSmashPlayer {
    //exclusive field for the child class 
    private int [] premiumScores;
    
    public PremiumSugarSmashPlayer(int playerID, String screenName) {
        super(playerID, screenName); //Constructor call to the Parent class; this is a needed call 
        this.premiumScores = new int [40]; //field to hold the additional 40 levels of game play score
    }
    
//Getter & setter for the premiumScore levels
    
        //Method to get a score for a specific game level
    @Override
    public int getScore(int level){
        if(level <1 || level >40){
            System.out.println("Error: Invalid Level request");
            return -1; //returns invalid due to a game level outside of range 1 to 40
        }
    return premiumScores[level-1]; //returns the corresponding level score based on its subscript position
    }
    
    //Method to set a score for specific game level
    @Override
    public void setScore(int score, int level)
    {
        if(level <1 || level >40){
            System.out.println("Error: Invalid Level! ");
            return;
        }
        if(level!=1 && score <100){
            System.out.println("Error: Minimum 100 points required to unlock this level.");
            return;
        }
        if(level>1 && premiumScores[level-2] <100){
            System.out.println("Error: Previous level must have at least 100 points to unlock this level.");
            return;
        }
        premiumScores[level - 1] = score;
            }
}
