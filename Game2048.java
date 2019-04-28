import javax.swing.*;
import java.awt.*;
public class Game2048 extends JPanel {
    private static final Color BR_COLOR = new Color(0x801C0A);

    public static void main(String[] args) {
        JFrame game = new JFrame();
        game.setTitle("2048");
        game.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        game.setSize(340, 400);
        game.setResizable(false);

        game.add(new Game2048());

        game.setLocationRelativeTo(null);
        game.setVisible(true);
    }
}
