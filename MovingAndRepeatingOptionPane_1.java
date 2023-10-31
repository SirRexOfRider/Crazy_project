import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Random;

public class MovingAndRepeatingOptionPane_1 {

    public static void main(String[] args) {
        
        createNewRandomOptionPane();
    }

    public static void createNewRandomOptionPane() {

        String[] crazy ={"Crazy?","I was crazy once","They locked me in a room","A rubber room","A ruuber room with rats","And rats make me crazy..;"};
        

        JDialog dialog = new JDialog();
        dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
        dialog.setSize(300, 150);

        // Generate random coordinates for the dialog's location
        Random random = new Random();
        int x = random.nextInt(Toolkit.getDefaultToolkit().getScreenSize().width - dialog.getWidth());
        int y = random.nextInt(Toolkit.getDefaultToolkit().getScreenSize().height - dialog.getHeight());
        dialog.setLocation(x, y);

        dialog.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 45)); // Center align the components

        dialog.setVisible(true);

        dialog.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                createNewRandomOptionPane();
            }
        });

 
        
        JButton closeButton = new JButton(crazy[0]);
        closeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                

                dialog.dispose();
                createNewRandomOptionPane();
            }
        });

        
        dialog.add(new JLabel());
        dialog.add(closeButton);
        
    }
}