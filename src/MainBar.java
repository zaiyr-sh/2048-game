package src;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainBar {
    static JFrame mainPage;
    public static void main(String[] args) {
        mainPage = new JFrame();
        mainPage.setTitle("2048");
        mainPage.setResizable(false);
        mainPage.setLayout(null);
        mainPage.setSize(340, 400);

        mainPage.setVisible(true);

        JPanel jPanel = new JPanel(new FlowLayout(4));

        mainPage.setContentPane(jPanel);

        JButton button = new JButton(new ImageIcon("E:\\IAAU\\2048-game\\src\\Button image.jpg"));
        mainPage.getContentPane().add(button);
        button.setBounds(125,300,100, 40);


        JButton quit = new JButton("Quit Game");
        quit.setBounds(125,200,100, 40);

        mainPage.getContentPane().add(quit);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("button clicked");
                mainPage.getContentPane().removeAll();
                mainPage.getContentPane().add(new Game2048());
            }
        });
        mainPage.setVisible(true);
    }
}
