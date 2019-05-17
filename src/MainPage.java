package src;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class MainPage extends JFrame{


    public static void main(String[] args){
        JFrame mainPage = new JFrame();
        mainPage.setTitle("2048");
        mainPage.setResizable(false);
        mainPage.setLayout(null);
        mainPage.setSize(340, 400);


//        mainPage.add(new JLabel(new ImageIcon("E:\\IAAU\\2048-game\\src\\vtr1a.jpg")));
        mainPage.getContentPane().setBackground(Color.cyan);

        JButton button = new JButton("Start"); //new ImageIcon("E:\\IAAU\\2048-game\\src\\Button image.jpg")
        mainPage.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        mainPage.getContentPane().add(button);
        button.setBounds(125,100,100, 40);//125 300 100 40

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Game2048 game2048 = new Game2048();
                game2048.setLocationRelativeTo(null);
                game2048.setVisible(true);
            }
        });
        button.setBackground(Color.LIGHT_GRAY);
        mainPage.add(button);


        JButton rules = new JButton("Rules");
        mainPage.getContentPane().add(rules);
        rules.setBounds(125,200,100, 40);//125 300 100 40

        rules.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Rulles rulles = new Rulles();
                rulles.setLocationRelativeTo(null);
                rulles.setVisible(true);
            }
        });
        rules.setBackground(Color.LIGHT_GRAY);
        mainPage.add(rules);


        JButton quit = new JButton("Quit Game");
        quit.setBounds(125,300,100, 40);//125 300 100 40
        quit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Quit the program
                System.exit(0);
            }
        });
        quit.setBackground(Color.LIGHT_GRAY);
        //mainPage.add(new MainPage());
        mainPage.add(quit);


        mainPage.setVisible(true);


        mainPage.setLocationRelativeTo(null); // the same(null) position of the menu
        PlayMusic.playMusic("src\\background music.wav");

    }

}
