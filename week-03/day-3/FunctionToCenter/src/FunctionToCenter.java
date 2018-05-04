import javax.swing.*;
import java.awt.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class FunctionToCenter {
    public static void mainDraw(Graphics graphics) {
        for (int i = 0; i < WIDTH; i += 20) {
            LineDrawingFunction(graphics, i, 0);
            LineDrawingFunction(graphics, i, HEIGHT);
        }
        for (int i = 0; i < HEIGHT; i += 20) {
            LineDrawingFunction(graphics, 0, i);
            LineDrawingFunction(graphics, WIDTH, i);
        }
    }

    public static void LineDrawingFunction(Graphics graphics, int x, int y) {
        graphics.drawLine(x, y, WIDTH / 2, HEIGHT / 2);

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