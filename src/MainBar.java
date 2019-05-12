package src;

import javax.swing.*;

public class MainBar extends JFrame {
    private JButton GameButton = new JButton();
    private JPanel MainBar = new JPanel();
    private JButton button1;


//    public MainBar() {
//        GameButton.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                if (e.getSource() == GameButton){
//                    JOptionPane.showMessageDialog(null, "Hello");
//                };
//            }
//        });
//    }

    public static void main(String[] args) {
        JFrame jFrame = new JFrame();
        jFrame.setContentPane(new MainBar().MainBar);
        jFrame.getContentPane().add(new JButton());
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.pack();
        jFrame.setVisible(true);
    }

}
