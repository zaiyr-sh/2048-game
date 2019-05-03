package src;
import src.PlayMusic;

import javax.swing.*;
import java.awt.*;

public class MainPage extends JFrame {
    public MainPage(){
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        JFrame mainPage = new MainPage();
        JButton button = new JButton(new ImageIcon("E:\\IAAU\\2048-game\\src\\Button image.jpg"));
        button.setBounds(150,400,105, 40);//125 300 100 40
        mainPage.setTitle("2048");
        mainPage.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        mainPage.setSize(440, 500);
        mainPage.setResizable(false);
        mainPage.add(button);
        mainPage.setLayout(null);
        mainPage.setVisible(true);
        //mainPage.add(new MainPage());


        PlayMusic.playMusic("src\\background music.wav");
    }
}
