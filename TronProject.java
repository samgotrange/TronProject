package tronproject;

import java.awt.*;
import javax.swing.JFrame;

public class TronProject {

    public static void main(String[] args) throws InterruptedException {
        boolean gameOn = true;
        jframe j = new jframe();
        j.setSize(9999, 9999);
        j.setVisible(true);
        TronGame game = new TronGame();
        game.setVisible(true);
        game.setLocation(0,0);
        j.add(game);
        Graphics g = game.getGraphics();
        while (gameOn == true) {
            game.player1.move1();
            g.fillRect(game.player1.getxpos(), game.player1.getypos(), 5, 5);
            game.player2.move2();
            g.fillRect(game.player2.getxpos(), game.player2.getypos(), 5, 5);
        }
    }

}
