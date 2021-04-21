package swing;
/* to import all class from the package javax.swing
 ---------like JFrame, JLabel..
 */
import javax.swing.*;

public class SwingExample {
    public static void main(String[] args) {


        JFrame frame = new JFrame(" MA PREMIERE INTERFACE ... ");
        // first set a size of the windows
        frame.setSize(280,300);
        // create the JLabel object
        JLabel label = new JLabel("Bonjour");
        // create the textfield object....
        JTextField textField= new JTextField("               ");

        //mow create 3 boutons objects.............

        JButton bouton1 = new JButton("Ajouter");
        JButton bouton2 = new JButton("Supprimer");
        JButton bouton3 = new JButton("Modifer");

        // now create the JPanel object to add the components

        JPanel panel =new JPanel();

        panel.add(bouton1);
        panel.add(bouton2);
        panel.add(bouton3);
        panel.add(label);
        panel.add(textField);


        // adding panel to frame....

        frame.add(panel);

        // display the frame
        frame.show();

    }

}
