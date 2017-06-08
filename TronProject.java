package tronproject;

import java.awt.*;
import javax.swing.JFrame;

public class TronProject {

    public static void main(String[] args) throws InterruptedException {
        boolean gameOn = true;
        jframe j = new jframe();
        j.setSize(9999, 9999);
        j.setVisible(true);
        j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        TronGame game = new TronGame();
        game.setVisible(true);
        game.setLocation(0, 0);
        j.add(game);
        game.Start();
    }

}
