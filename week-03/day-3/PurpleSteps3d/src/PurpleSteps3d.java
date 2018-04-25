import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class PurpleSteps3d {
    public static void mainDraw(Graphics graphics) {
        int coordinates = 10;
        graphics.setColor(new Color(180,0,200,200));
        for (int i = 1; i < 7; i++) {
            coordinates += (i -  1) * 10;
            graphics.fillRect(coordinates, coordinates,i * 10, i * 10);
        }
        coordinates = 10;
        graphics.setColor(Color.BLACK);
        for (int i = 1; i < 7; i++) {
            coordinates += (i - 1) * 10;
            graphics.drawRect(coordinates, coordinates, i * 10, i * 10);
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