package src;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainGame {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Menu");
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setSize(300, 300);
        JPanel panel = new JPanel();
        jFrame.add(panel);
        JButton button = new JButton("Click");
        panel.add(button);
        button.addActionListener(new Action());
    }

        static class Action implements ActionListener{
            public void  actionPerformed (ActionEvent e){
//                JFrame frame2 = new JFrame("!");
//                frame2.setVisible(true);
//                frame2.setSize(200, 200);
//                JPanel panel = new JPanel();
//                frame2.add(panel);


            }
        }
    }

