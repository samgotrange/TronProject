package tronendgameanimations;

import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class TronEndGameAnimations {
    public static void main(String[] args) throws InterruptedException {
        boolean p1Win = true;
        JFrame j = new JFrame();
        j.setSize(2000, 1000);
        JPanel p = new JPanel();
        j.add(p);
        JLabel l = new JLabel();
        if (p1Win == true) {
            l.setText("Player1 Wins!");
        }else {
            l.setText("Player2 Wins!");
        }
        l.setPreferredSize(new Dimension(200,100));
        p.add(l);
        j.setVisible(true);
    }
}
