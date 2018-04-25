import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class FourRectangles {

    public static void mainDraw(Graphics graphics){
        Color[] colors = {Color.BLACK, Color.BLUE, Color.GREEN, Color.RED};
        for (int i = 0; i < 4; i++) {
            graphics.setColor(colors[i]);
            graphics.drawRect((int)(Math.random() * WIDTH / 2), (int)(Math.random() * HEIGHT / 2), (int)(Math.random() * 91 + 10), (int)(Math.random() * 91 + 10));
            // The ranges have no particular meaning.
            // I just chose some numbers to make sure
            // the rectangles won't get out of the frame.
        }
    }

    //    Don't touch the code below
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
    static class ImagePanel extends JPanel{
        @Override
        protected void paintComponent(Graphics graphics) {
            super.paintComponent(graphics);
            mainDraw(graphics);

        }
    }

}