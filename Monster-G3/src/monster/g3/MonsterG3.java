
package monster.g3;
import javax.swing.*;

public class MonsterG3 {

   
    public static void main(String[] args) {
        // Welcome Message with the instructions
        String welcomeMessage = "Welcome to the Fantasy Monster Encyclopedia App!\n\n"
                + "In this app, you can create & display information about different fantasy monsters.\n"
                + "You will be prompted to enter the name & abilities of each monster\n"
                + "Please enter abilities separated by a comma.";

        JOptionPane.showMessageDialog(null, welcomeMessage, "Fantasy Monster Encyclopedia", JOptionPane.INFORMATION_MESSAGE);

        // Create an array to store the Monster info
        Monster[] monsters = new Monster[3];

        // Create and populate each monster
        monsters[0] = createMonster("Dragon");
        monsters[1] = createMonster("Unicorn");
        monsters[2] = createMonster("Troll");

        // Create a message to display in the dialog box the above user inputs
        StringBuilder message = new StringBuilder();
        message.append("Welcome to the Fantasy Monster Encyclopedia!\n");
        message.append("=============================================\n");

        // Display the array details (Category & User input)
        for (Monster monster : monsters) {
            message.append("Monster: ").append(monster.getName()).append("\n");
            message.append("Abilities:\n");
            for (String ability : monster.getAbilities()) {
                message.append("-- ").append(ability).append("\n");
            }
            message.append("\n");
        }

        // Display the message
        JOptionPane.showMessageDialog(null, message.toString(), "Fantasy Monster Encyclopedia", JOptionPane.INFORMATION_MESSAGE);
    }

    // Helper method to create a monster
    private static Monster createMonster(String type) {
        String name = JOptionPane.showInputDialog(null, "Enter the name of the " + type + ":");
        String abilitiesStr = JOptionPane.showInputDialog(null, "Enter abilities for the " + type + " (comma-separated):");
        String[] abilities = abilitiesStr.split(",");
        return new Monster(name, abilities);
    }
}