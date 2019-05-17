package src;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Rulles extends JFrame {
    public Rulles() {
        setSize(new Dimension(340, 400));
        setResizable(false);

    }

    public static void main(String[] args) {
        JFrame rullesGame = new JFrame();
        rullesGame.setTitle("Rulles");
        rullesGame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        rullesGame.setSize(340, 400);
        rullesGame.setResizable(false);

        rullesGame.add(new Rulles());
        rullesGame.setLocationRelativeTo(null);
        rullesGame.setVisible(true);

        JButton back = new JButton("Back");
        rullesGame.getContentPane().add(back);
        back.setBounds(125,200,100, 40);
        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MainPage mainPage = new MainPage();
                mainPage.setLocationRelativeTo(null);
                mainPage.setVisible(true);
            }
        });
        back.setBackground(Color.LIGHT_GRAY);
    }
}
