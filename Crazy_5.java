import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;
import java.io.IOException;
import javax.sound.sampled.*;
import java.util.*;

public class Crazy_5 {

    public static void main(String[] args) {
        createNewRandomOptionPane();
    }

    public static void createNewRandomOptionPane() {
        JDialog dialog = new JDialog();
        dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
        dialog.setSize(300, 150);

        Random random = new Random();
        int x = random.nextInt(Toolkit.getDefaultToolkit().getScreenSize().width - dialog.getWidth());
        int y = random.nextInt(Toolkit.getDefaultToolkit().getScreenSize().height - dialog.getHeight());
        dialog.setLocation(x, y);

        dialog.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 45));
        dialog.setVisible(true);

        dialog.addWindowListener(new WindowAdapter() {
            @Override
            public void windowOpened(WindowEvent e) {
                // Play airhorn sound when the dialog is opened
                playAirhornSound();
            }

            @Override
            public void windowClosing(WindowEvent e) {
                createNewRandomOptionPane();
            }
        });

        JButton closeButton = new JButton("Crazy?");
        closeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dialog.dispose();
                createNewRandomOptionPane();
            }
        });

        
        dialog.add(closeButton);
    }

    // Method to play the airhorn sound
    public static void playAirhornSound() {
        try {
            File soundFile = new File("crazy.wav");
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(soundFile);
            Clip clip = AudioSystem.getClip();
            clip.open(audioInputStream);
            clip.start();
        } catch (UnsupportedAudioFileException | LineUnavailableException | IOException ex) {
            ex.printStackTrace();
        }
    }
}