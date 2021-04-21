package swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginForm
{
    // methode pour activer les bouttons

    public  static boolean checkData(String userName, String passWord){
        if(userName.equals("makhlouf") && passWord.equals("jesuisla")){
           return true;
        }
        return false;
    }
    public static void addComponentsToPanel(JPanel panel){

        JLabel label1= new JLabel("USER NAME ");
        JTextField userText =new JTextField();
        JLabel label2= new JLabel("PASSWORD ");
        JPasswordField passwordField =new JPasswordField();
        //CREATION D`UN BOUTTON VALISER..
        JButton cancelButton =new JButton("ANNULER");
        JButton loginlButton =new JButton("LOGIN");

        // CREATION DE PANEL

        panel.add(label1);
        panel.add(userText);
        panel.add(label2);
        panel.add(passwordField);
        panel.add(cancelButton);
        panel.add(loginlButton);

        // ajouter une action sur les bouttons
//--------------------------------------------------------------------------------------
        loginlButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (checkData(userText.getText(),passwordField.getText())){
                    JOptionPane.showMessageDialog(panel,
                            "Bienvenue " +userText.getText(),
                            " LOGIN  ",JOptionPane.INFORMATION_MESSAGE);
                }
                else {
                    JOptionPane.showMessageDialog(panel, "User Name or Password incorrect!!",
                            "LOGIN ",JOptionPane.ERROR_MESSAGE );
                }
            }
        });
       cancelButton.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
               System.exit(0);
           }
       });
    }
//--------------------------------------------------------------------------------
    public static void main(String[] args) {
        JFrame frame =new JFrame("----------LOGIN---------");
        JPanel panel =new JPanel(new GridLayout(3,2,20,20));
        //appel des methodes
        addComponentsToPanel(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setSize(300,150);
        frame.getContentPane().add(panel);
        frame.setVisible(true);


    }
}
