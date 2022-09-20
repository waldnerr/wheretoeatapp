import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.Random;

public class WhereYouWannaEatAt extends JFrame 
{
    private GreetingsPanel banner;
    private Choicespanel choices;
    private JPanel buttonPanel;
    private JButton goButton;
    private JButton exitButton;


    public WhereYouWannaEatAt(){
        setTitle("Where Do You Wanna Eat?");

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setLayout(new BorderLayout());
        ////// creating panels
        banner = new GreetingsPanel();
        choices = new Choicespanel();

        buildButtonPanel();

        add(banner, BorderLayout.NORTH);
        add(choices, BorderLayout.CENTER);
        add(buttonPanel, BorderLayout.SOUTH);

        pack();
        setVisible(true);


    }

    private void buildButtonPanel(){
        buttonPanel = new JPanel();

        goButton = new JButton("I am Hungry!");
        exitButton = new JButton("NeverMind...");

        exitButton.addActionListener(new ExitButtonListener());
        goButton.addActionListener(new GoButtonListener());
        

        buttonPanel.add(goButton);
        buttonPanel.add(exitButton);

    }
    private class ExitButtonListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e){
            System.exit(0);
        }
    }

    private class GoButtonListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e){
            ArrayList<String> allchoices = choices.getTotalCategories();
            Random rand = new Random();
             int lim = allchoices.size();
            int lim_num = rand.nextInt(lim + 1);


            JOptionPane.showMessageDialog(null, "Your Food Choice is.... : " + allchoices.get(lim_num));
        }

    }
   
    public static void main(String[] args) {
        new WhereYouWannaEatAt();
    
}
 



}
