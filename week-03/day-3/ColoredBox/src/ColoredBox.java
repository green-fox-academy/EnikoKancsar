import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class ColoredBox {
    public static void mainDraw(Graphics graphics) {
        // Draw a box that has different colored lines on each edge.

        graphics.setColor(Color.RED);
        graphics.drawLine(WIDTH / 3, HEIGHT / 3, WIDTH * 2 / 3,  HEIGHT / 3);

        graphics.setColor(Color.GREEN);
        graphics.drawLine(WIDTH * 2 / 3, HEIGHT / 3, WIDTH * 2 / 3, HEIGHT * 2 / 3);

        graphics.setColor(Color.BLUE);
        graphics.drawLine(WIDTH * 2 / 3, HEIGHT * 2 / 3, WIDTH / 3,  HEIGHT * 2 / 3);

        graphics.setColor(Color.ORANGE);
        graphics.drawLine(WIDTH / 3,  HEIGHT * 2 / 3, WIDTH / 3, HEIGHT / 3);
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