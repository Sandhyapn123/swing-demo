// Main.java
import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Swing Demo");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel label = new JLabel("Hello from Swing!", SwingConstants.CENTER);
        frame.add(label);
        frame.setVisible(true);
    }
}
