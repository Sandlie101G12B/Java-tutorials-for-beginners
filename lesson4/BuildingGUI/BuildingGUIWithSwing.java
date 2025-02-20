
import javax.swing.*;

public class BuildingGUIWithSwing {

    public static void main(String[] args) {
        // Creating a JFrame window
        JFrame frame = new JFrame("My GUI Application");
        JButton button = new JButton("Click Me");

        // Adding an ActionListener to the button using a lambda expression
        button.addActionListener(e -> JOptionPane.showMessageDialog(frame, "Button Clicked!"));

        // Setting up the JFrame window
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        frame.setLayout(new java.awt.FlowLayout());
        frame.add(button);
        frame.setVisible(true);
    }
}
