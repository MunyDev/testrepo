import java.awt.event.*;
import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        // Schedule the GUI creation to run on the Event Dispatch Thread
        SwingUtilities.invokeLater(() -> {
            // Create the frame
            JFrame frame = new JFrame("Simple Swing Example");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(300, 200);

            // Create a button
            JButton button = new JButton("Click Me");
            button.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    JOptionPane.showMessageDialog(frame, "Test");
                }
            });
            // Add the button to the frame's content pane
            frame.getContentPane().add(button);

            // Make the frame visible
            frame.setVisible(true);
        });
    }
}
