//Simple App to illustrate Swing Components
package swing_demo_g3;

import javax.swing.*; //Package to be used for adding in GUI components to the application 
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Swing_Demo_G3 {
    public static void main(String[] args) {
        //Create a JFrame (a window)
        JFrame frame = new JFrame("Simple Swing App Build"); //Text to display on the Title bar
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(450, 150); //Set the size of the window of the app
        
        //Create a JLabel (a text label to display on the app)
        JLabel label = new JLabel("Hello to Swing Components! ");
        
        //Create a JButton (a clickable button)
        JButton button = new JButton("Click here! "); 
        //Add an ActionListener to the button 
        button.addActionListener(new ActionListener(){
           @Override
          public void actionPerformed(ActionEvent e) //Will hold the behaviour of what has to happen when the button is clicked
          {
          label.setText("The Button has been clicked! "); //This code will execute when the button is clicked
           }
        
       });
        
        
        //Create a JPanel (a container for all of the above components)
        JPanel panel = new JPanel();
        panel.add(label); //Add the label to the panel
        panel.add(button); //Add the button to the panel
        
        //Add the panel to the Frame
        frame.add(panel); //The panel will now contain both the label & button to be displayed/placed on the JFrame
        
        //Make the JFrame visible
        frame.setVisible(true);
                  
    }
}
