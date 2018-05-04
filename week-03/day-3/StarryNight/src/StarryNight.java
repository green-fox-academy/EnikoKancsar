import javax.swing.*;
import java.awt.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;


public class StarryNight {
    public static void mainDraw(Graphics graphics) {
        graphics.setColor(Color.BLACK);
        graphics.fillRect(0, 0, WIDTH, HEIGHT);
        int size;
        for (int i = 0; i < 70; i++) {
            graphics.setColor(Color.getHSBColor((float)Math.random(),0, (float)Math.random()));
            size = (int)(Math.random() * 10 + 1);
            graphics.fillRect((int)(Math.random() * (WIDTH - 10)), (int)(Math.random() * (HEIGHT - 10)), size, size);
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