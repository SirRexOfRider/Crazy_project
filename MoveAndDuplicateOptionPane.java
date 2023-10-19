import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class MoveAndDuplicateOptionPane {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Move and Duplicate JOptionPane Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);

        JButton showButton = new JButton("Show Dialog");
        frame.add(showButton);

        showButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Generate random coordinates for the dialog location
                int x = new Random().nextInt(frame.getWidth());
                int y = new Random().nextInt(frame.getHeight());

                // Show a message dialog at the random location
                JOptionPane.showMessageDialog(frame, "This is a custom dialog.",
                        "Custom Dialog", JOptionPane.INFORMATION_MESSAGE);
                
                // Move the frame to a new random location
                frame.setLocation(x, y);
            }
        });

        frame.setVisible(true);
    }
}