
package demosugarsmash_g3;

public class DemoSugarSmash_G3 {

   public static void main(String[] args) {
    //create an instance for both the Parent & child class; set/get score levels & error handling
    
    //Create a regular SugarSmashPlayer (free play)
    SugarSmashPlayer player1 = new SugarSmashPlayer(1, "Player1");
    player1.setScore(150, 1);
    player1.setScore(200, 2);
       System.out.println(player1.getScreenName() + " 's Scores: ");
       System.out.println("Level 1: " + player1.getScore(1));
       System.out.println("Level 2: " + player1.getScore(2));
       
       //Child class
       PremiumSugarSmashPlayer premiumPlayer = new PremiumSugarSmashPlayer(10, "Premium Player");
       premiumPlayer.setScore(300, 35);
       premiumPlayer.setScore(20, 25);
       System.out.println(premiumPlayer.getScreenName() + " 's Scores: ");
       System.out.println("Level 35: " + premiumPlayer.getScore(35));
       System.out.println("Level 20 " + premiumPlayer.getScore(20));
   
   
   }
    
}
