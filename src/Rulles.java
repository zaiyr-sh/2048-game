package src;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Rulles extends JFrame {
    public Rulles() {
        setSize(new Dimension(340, 400));
        rulle();
    }

    public void rulle() {
        setSize(new Dimension(340, 400));
        setFocusable(true); // move of figures
        setResizable(false);
        add(new JLabel());
    }

    public void paint(Graphics g){
        g.drawString("Hello to JavaTutorial.net", 10, 10);
    }

    public static void main(String[] args) {
        JFrame rullesGame = new JFrame();
        rullesGame.setTitle("Rulles");
        rullesGame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        rullesGame.setSize(340, 400);
        rullesGame.setResizable(false);

        rullesGame.getContentPane().setBackground(Color.cyan);


        JButton back = new JButton("Back");
        back.setLayout(null);
        back.setBounds(125,300,100, 40);//125 300 100 40
        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Quit the program
                System.exit(0);
            }
        });
        back.setBackground(Color.LIGHT_GRAY);
        rullesGame.add(back);

        String rullesOfGame = "<html><body width='%1s'><h1 align=\"center\">How to play?</h1>"
                + "2048 is an addictive puzzle game based on simple addition. The objective of the game is to reach 2048 by merging adjacent similar number tiles on a 4x4 board. The game starts with two tiles of 2 random positions on the board, and continues to add new tiles of 2 or 4 on random tiles after every move. The game ends when your board is completely filled with numbers and you don’t have any move left.";

        JLabel rulLabel = new JLabel(rullesOfGame,JLabel.CENTER);
        rulLabel.setFont((new Font("Times New Roman", Font.CENTER_BASELINE, 15)));
        rulLabel.setAlignmentX(0);
        rulLabel.setAlignmentY(0);
        rullesGame.add(rulLabel);



//        rullesGame.add(new Rulles());
        rullesGame.setLocationRelativeTo(null);
        rullesGame.setVisible(true);


    }
}

