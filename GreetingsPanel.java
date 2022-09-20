import javax.swing.*;

//Greetings Panel bc cant decide where to eat

public class GreetingsPanel extends JPanel
{
    private JLabel hello; 
    private JLabel desc; 

//construct

public GreetingsPanel(){
    hello = new JLabel("Cant Decide where to Eat? Lets Figure It Out!");
    desc = new JLabel("Click the Boxes and it will only include those types of food!");

    add(hello);
    add(desc);
}




}
