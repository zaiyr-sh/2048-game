package src;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainPage extends JFrame{
    private static final Color bgColor = new Color(155, 62, 151);

    public static void main(String[] args) {
        JFrame mainPage = new JFrame();
        mainPage.setTitle("2048");
        mainPage.setResizable(false);
        mainPage.setLayout(null);
        mainPage.setSize(340, 400);



        JButton button = new JButton(new ImageIcon("E:\\IAAU\\2048-game\\src\\Button image.jpg"));
        mainPage.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        mainPage.getContentPane().add(button);
        button.setBounds(125,300,100, 40);//125 300 100 40


        JButton quit = new JButton("Quit Game");
        quit.setBounds(125,200,100, 40);//125 300 100 40
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



        button.addActionListener(new ActionListener() {
                @Override
            public void actionPerformed(ActionEvent e) {
//                MainPage mainPage = new MainPage();
//                System.out.println("button clicked");
//                mainPage.remove(button);
//                mainPage.remove(quit);
//                mainPage.add(new Game2048());

                    Game2048 game2048 = new Game2048();
                    game2048.setLocationRelativeTo(null);
                    game2048.setVisible(true);
//                game2048.setMinimumSize(new Dimension(200, 200));



                PlayMusic.playMusic("Ship Wrek_.wav");
//                game2048.setLocation(null);
            }
        });
        mainPage.setVisible(true);




        mainPage.setLocationRelativeTo(null); // the same(null) position of the game
        PlayMusic.playMusic("src\\background music.wav");

    }
}

