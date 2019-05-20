package src;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Rulles extends JFrame {
    public Rulles() {
        setSize(new Dimension(340, 400));
        rulles();
    }


    public void rulles() {

        setSize(new Dimension(340, 400));
        setResizable(false);
//        setFocusable(true); // move of figures
        add(new JLabel());

        setTitle("Rulles");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        getContentPane().setBackground(Color.cyan);


        JButton back = new JButton("Back");
        back.setLayout(null);
        back.setBounds(125,300,100, 40);//125 300 100 40
        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MainPage mainPage = new MainPage();
                mainPage.setLocationRelativeTo(null);
                setVisible(false);
            }
        });
        back.setBackground(Color.LIGHT_GRAY);
        add(back);

        String rullesOfGame = "<html><body width='%1s'><h1 align=\"center\">How to play?</h1>"
                + "2048 is an addictive puzzle game based on simple addition. The objective of the game is to reach 2048 by merging adjacent similar number tiles on a 4x4 board. The game starts with two tiles of 2 random positions on the board, and continues to add new tiles of 2 or 4 on random tiles after every move. The game ends when your board is completely filled with numbers and you don’t have any move left.";

        JLabel rulLabel = new JLabel(rullesOfGame,JLabel.CENTER);
        rulLabel.setFont((new Font("Times New Roman", Font.CENTER_BASELINE, 15)));
        rulLabel.setAlignmentX(0);
        rulLabel.setAlignmentY(0);
        add(rulLabel);

        setLocationRelativeTo(null);
        setVisible(true);
    }

}

