import javax.swing.*;
import java.awt.*;

import java.util.ArrayList;

public class Choicespanel extends JPanel
{
    private JCheckBox itfood;   //italian food
    private JCheckBox burfoood;   //burgers
    private JCheckBox delifood;   // Deli and Diners
    private JCheckBox halfood;   // Halal 
    private JCheckBox chinfood;   // ChineseFood
    private JCheckBox fastfood;   // fastfood places
    private JCheckBox helfood;   // healthy places
    private JCheckBox barfood;   // wings and bar food 
    private JCheckBox hisfood;  //Hispanic Food
    private JCheckBox greekfood;  //Greek Food
    private JCheckBox sushfood;  //Sushi
    private JCheckBox bffood;  //breakfast 
    private JCheckBox icefood;  //Ice cream and dessert 

    private String[] italian = {"La Piazza","Victor's Pizzaria","Marios","Pizzaiola","Uncle G's","Little Vincents","Giusesppes Pizza","Vespa","Veronias"};
    private String[] burgers = {"Buger Village","Burgerology","Five Guys","Shake Shack","All American","Mr Beast Burger","Applebees","Miller Ales House","Smash Burger"};
    private String[] deli = {"Panera","Stage Door","Bocconcinis","Emma's Deli","Bagel Biz","Uncle G's","Any Diner"};
    private String[] halal = {"Naz Halal","Halal Guys","Shahs Halal", "King Halal"};
    private String[] chinese = {"PF Changs","China House","New Fortune","New China","China Delight Kitchen","Mogu","Wok n Roll"};
    private String[] fast = {"McDonalds","Chipotle","Wendys","Burger King","Papa Johns","Dominos","Five Guys","Shake Shack","Taco Bell","Checkers","Arbys","Chick Fil A","Popeyes","DQ"};
    private String[] healthy = {"Chipotle","Core Life","Panera","Stage Door","Bocconcinis","Bagel Biz","Uncle G's","Make Something at Home!"};
    private String[] wingsAndBar = {"Buffalo Wild Wings"," Croxleys","Dark Horse","Wing Stop","Mary Carrolls","Checkers","Applebees","Chilis","Miller Ales House","TGIF"};
    private String[] hispanic = {"Tonys Tacos","Bubbas Buritto","Chipotle","Papusa","Taco Bell","Chilis","Qdoba","Moes","Del Fuego"};
    private String[] greek = {"Greekrave","Cava","Greek Cove","Olympic Diner","Greek Grill"};
    private String[] sushi = {"Mizu","Aki","Yahama","Akebono","110 Japan","Samuri","Toa","PokeWorks","Maui Poke Bowl","Kai Poke"};
    private String[] breakfast = {"Starbucks","Dunkin Donuts","Emmas Deli","Bocconcinis","McDonalds","Diner","Stage Door","IHOP","Bagel Biz", "Stuff a Bagel"};
    private String[] icecream = {"McFlurries","Frosties","Baskin Robins","DQ","Applebees","Five Guys Shakes","Yo Go","Ritas Ices","Ralphs","Sonics", "Haagen Dazs","Target Ice cream","711","FroYo"};




public Choicespanel()
{
    setLayout(new GridLayout(12,2));
    itfood = new JCheckBox(" Italian Food ");
    burfoood = new JCheckBox(" Burgers ");
    delifood = new JCheckBox(" Deli / Diner  ");
    halfood = new JCheckBox(" Halal  ");
    chinfood = new JCheckBox(" Chinese Food ");
    fastfood = new JCheckBox(" Fast Food ");
    helfood = new JCheckBox(" Healthy Food Places  ");
    barfood = new JCheckBox(" Bar Food  ");
    hisfood = new JCheckBox(" Hispanic  ");
    greekfood = new JCheckBox(" Greek ");
    sushfood = new JCheckBox(" Sushi ");
    bffood = new JCheckBox(" Breakfast ");
    icefood = new JCheckBox(" Ice cream and Dessert ");

    setBorder(BorderFactory.createTitledBorder("Categories"));
    add(itfood);
    add(burfoood);
    add(delifood);
    add(fastfood);
    add(helfood);
    add(halfood);
    add(barfood);
    add(hisfood);
    add(greekfood);
    add(sushfood);
    add(bffood);
    add(chinfood);
    add(icefood);
}


public ArrayList<String> getTotalCategories()
{
    ArrayList<String> allSelected = new ArrayList<String>();

    if(itfood.isSelected() ){
        for(int i = 0; i < italian.length;i++){
             allSelected.add(italian[i]);}

    }


    if(burfoood.isSelected() ){
        for(int i = 0; i < burgers.length;i++){
            allSelected.add(burgers[i]);}
    }
    
    
    if(delifood.isSelected() ){
        for(int i = 0; i < deli.length;i++){
            allSelected.add(deli[i]);}
    }
    
    
    if(halfood.isSelected() ){ 
        for(int i = 0; i < halal.length;i++){
            allSelected.add(halal[i]);}}
    
    
    if(chinfood.isSelected() ){
        for(int i = 0; i < chinese.length;i++){
            allSelected.add(chinese[i]);}
    }
    
    
    if(fastfood.isSelected() ){
        for(int i = 0; i < fast.length;i++){
            allSelected.add(fast[i]);}
    }
    
    
    if(helfood.isSelected() ){
        for(int i = 0; i < healthy.length;i++){
            allSelected.add(healthy[i]);}
    }
    
    
    if(barfood.isSelected() ){
        for(int i = 0; i < wingsAndBar.length;i++){
            allSelected.add(wingsAndBar[i]);}
    }
    
    
    if(hisfood.isSelected() ){
        for(int i = 0; i < hispanic.length;i++){
            allSelected.add(hispanic[i]);}
    }
    
    
    if(greekfood.isSelected() ){
        for(int i = 0; i < greek.length;i++){
            allSelected.add(greek[i]);}
    }
    
    
    if(sushfood.isSelected() ){
        for(int i = 0; i < sushi.length;i++){
            allSelected.add(sushi[i]);}
    }
    
    
    if(bffood.isSelected() ){
        for(int i = 0; i < breakfast.length;i++){
            allSelected.add(breakfast[i]);}
    }
    
    if(icefood.isSelected() ){
        for(int i = 0; i < icecream.length;i++){
            allSelected.add(icecream[i]);}
    }
    
//Calc the random number
   



return allSelected;


}

}









