package GUI;

import javax.swing.*;
import java.awt.*;

public class main {


    public static void main(String[] args) {
        Dimension scale = Toolkit.getDefaultToolkit().getScreenSize();
        JFrame frame = new JFrame();
        frame.preferredSize();
        frame.setSize(scale.width, scale.height);
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(new BorderLayout());
        frame.setBackground(Color.red);
        frame.setVisible(true);
    }
}
