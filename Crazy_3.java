/*
 * Name:Crazy_2.java
 * Author:Rex
 * Date:9/13/23
 * Purpose:This is getting two crazy 
 */




//Import JOptionsPane
import javax.swing.JOptionPane;

public class Crazy_3 {
    public static void main(String[] args) {

        //Set phrase as an empty variable
        String phrase = "";

        //Call display method
        display(phrase);
        
    }

    static void display(String phrase) {

        //Fixed the loop. i++ increments AFTER checking the i varaible. I was just being dumb :)

         for (int i = 0; i < 6; i++) {
            if (i == 0) {
                phrase = "Crazy?";
                JOptionPane.showMessageDialog(null, phrase);
            } else if (i == 1) {
                phrase = "I was crazy once";
                JOptionPane.showMessageDialog(null, phrase); 
            } else if (i == 2) {
                phrase = "They locked me in a room";
                JOptionPane.showMessageDialog(null, phrase); 
            }else if (i == 3) {
                phrase = "A rubber room";
                JOptionPane.showMessageDialog(null, phrase); 
            }else if (i == 4) {
                phrase = "A rubber room with rats";
                JOptionPane.showMessageDialog(null, phrase); 
            }else if (i == 5) {
                phrase = "And rats make me crazy...";
                JOptionPane.showMessageDialog(null, phrase); 
                i = 0;
            }
        } 
    }
}
