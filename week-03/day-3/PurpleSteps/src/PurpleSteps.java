import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class PurpleSteps {
    public static void mainDraw(Graphics graphics) {
        graphics.setColor(new Color(180,0,200,200));
        for (int i = 0; i < 20; i++) {
            graphics.fillRect(10 + i * 10, 10 + i * 10, 10, 10);
        }
        graphics.setColor(Color.BLACK);
        for (int i = 0; i < 20; i++) {
            graphics.drawRect(10 + i * 10, 10 + i * 10, 10, 10);
        }
    }

    // Don't touch the code below
    static int WIDTH = 320;
    static int HEIGHT = 343;

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Drawing");
        jFrame.setSize(new Dimension(WIDTH, HEIGHT));
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        jFrame.add(new ImagePanel());
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
    }

    static class ImagePanel extends JPanel {
        @Override
        protected void paintComponent(Graphics graphics) {
            super.paintComponent(graphics);
            mainDraw(graphics);
        }
    }
}