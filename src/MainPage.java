package src;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainPage extends JFrame {
    private static final Color bgColor = new Color(155, 62, 151);
    public MainPage(){
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        JFrame mainPage = new MainPage();
        mainPage.setTitle("2048");
        mainPage.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        mainPage.setResizable(false);
        mainPage.setLayout(null);
        mainPage.setSize(440, 500);

        JButton button = new JButton(new ImageIcon("E:\\IAAU\\2048-game\\src\\Button image.jpg"));
        button.setBounds(150,400,105, 40);//125 300 100 40
        mainPage.add(button);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Game2048 game2048 = new Game2048();
                game2048.setVisible(true);
            }
        });
        mainPage.setVisible(true);


        JButton quit = new JButton("Quit Game");
        quit.setBounds(300,100,105, 40);//125 300 100 40
        mainPage.add(quit);
        quit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Quit the program
                System.exit(0);
            }
        });
        quit.setBackground(Color.LIGHT_GRAY);
        //mainPage.add(new MainPage());

        mainPage.setLocationRelativeTo(null); // the same(null) position of the game
        PlayMusic.playMusic("src\\background music.wav");
    }
}
