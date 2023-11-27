import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;
import java.io.IOException;
import javax.sound.sampled.*;
import javax.imageio.ImageIO;
import java.util.*;

public class Crazy_6_FINAL {

    public static void main(String[] args) {
        createNewRandomOptionPane(); // Entry point of the program
    }

    // Method to create a new random dialog box with an image background
    public static void createNewRandomOptionPane() {
        // Create a new JDialog
        JDialog dialog = new JDialog();
        dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE); // Set close operation
        dialog.setSize(530, 400); // Set dialog size
        dialog.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

        // Generate random colors for the button
        Random random = new Random();
        Color buttonColor = new Color(random.nextInt(256), random.nextInt(256), random.nextInt(256));

        // Load the image for the background
        try {
            File imageFile = new File("rubber_room.jpg");
            Image backgroundImage = ImageIO.read(imageFile);
            // Create a JLabel with the image
            JLabel backgroundLabel = new JLabel(new ImageIcon(backgroundImage));
            // Set layout to null to position components manually
            backgroundLabel.setLayout(null);
            dialog.setContentPane(backgroundLabel); // Set the label as the content pane

            // Generate random x and y coordinates to position the dialog on the screen
            
            int x = random.nextInt(Toolkit.getDefaultToolkit().getScreenSize().width - dialog.getWidth());
            int y = random.nextInt(Toolkit.getDefaultToolkit().getScreenSize().height - dialog.getHeight());
            dialog.setLocation(x, y);

            dialog.setLayout(new FlowLayout(FlowLayout.CENTER, 50, 100)); // Set layout
            dialog.setVisible(true); // Make the dialog visible

            // Add a window listener to the dialog
            dialog.addWindowListener(new WindowAdapter() {
                @Override
                public void windowOpened(WindowEvent e) {
                    // Play audio when the dialog is opened
                    crazy();
                }

                @Override
                public void windowClosing(WindowEvent e) {
                    createNewRandomOptionPane(); // Create a new random dialog when closing the current one
                }
            });
            
            // Create and configure 'Crazy?' button
            JButton closeButton = new JButton("C R A Z Y ?");
            closeButton.setBackground(buttonColor);
            
           
            closeButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    dialog.dispose(); // Close the current dialog
                    createNewRandomOptionPane(); // Create a new random dialog
                }
            });

            dialog.add(closeButton); // Add 'Crazy?' button to the dialog

        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    // Method to play the audio file
    public static void crazy() {
        try {
            // Load audio file
            File soundFile = new File("crazy.wav");
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(soundFile);
            Clip clip = AudioSystem.getClip();
            clip.open(audioInputStream);
            clip.start(); // Play the audio
        } catch (UnsupportedAudioFileException | LineUnavailableException | IOException ex) {
            ex.printStackTrace(); // Print stack trace if there's an issue with audio playback
        }
    }
}