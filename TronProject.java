package tronproject;

import javax.swing.JFrame;

public class TronProject {
    public static void main(String[] args) throws InterruptedException {
        boolean gameOn = true;
        TronGame game = new TronGame();
        game.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        game.setVisible(true);
        game.setSize(9999,9999);
        while (gameOn == true) {
            game.player1.move1();
            game.player2.move2();
        }
    }
    
}
