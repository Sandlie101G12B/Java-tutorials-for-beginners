
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EventHandlingInGUI {

    public static void main(String[] args) {
        // Creating a JFrame window
        JFrame frame = new JFrame("Event Handling Example");
        JButton button = new JButton("Click Me");

        // Adding an ActionListener to the button
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Displaying a message dialog when the button is clicked
                JOptionPane.showMessageDialog(frame, "Button Clicked!");
            }
        });

        // Setting up the JFrame window
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        frame.setLayout(new java.awt.FlowLayout());
        frame.add(button);
        frame.setVisible(true);
    }
}
