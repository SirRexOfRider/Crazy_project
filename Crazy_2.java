/*
 * Name:Crazy_2.java
 * Author:Rex
 * Date:9/13/23
 * Purpose:This is getting two crazy 
 */




//Import JOptionsPane
import javax.swing.JOptionPane;

public class Crazy_2 {
    public static void main(String[] args) {
        String phrase;

        //Start for loop at -1 (Because we techinically start at 0 because of the i++. I could've moved the counter somewhere else,
        //but this works too)
        for (int i = -1; i < 6; i++) {
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
                i = -1;
            }
        } 
    }
}
