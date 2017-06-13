package tronproject;

import java.awt.*;
import java.awt.event.*;
import javax.swing.Timer;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

public class TronGame extends JPanel implements KeyListener, ActionListener {

    Player1 player1;
    Player2 player2;
    private Timer timer;

    public TronGame() {
        player1 = new Player1();
        player2 = new Player2();
        addKeyListener(this);
    }

    public void Start() {
        timer = new Timer(25, this);
        timer.start();
    }

    public void actionPerformed(ActionEvent ae) {
        try {
            player1.move1();
        } catch (InterruptedException ex) {
            Logger.getLogger(TronGame.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            player2.move2();
        } catch (InterruptedException ex) {
            Logger.getLogger(TronGame.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.repaint();
    }

    // method for overriding paintComponent
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.fillRect(player1.getxpos(), player1.getypos(), 10, 10);
        g.fillRect(player2.getxpos(), player2.getypos(), 10, 10);

    }

    @Override
    public void keyTyped(KeyEvent ke) {

    }

    @Override
    public void keyPressed(KeyEvent ke) {
        System.out.println(ke.getKeyChar());
        if (ke.getKeyChar() == 37) {
            player2.setDirection(1);
        } else if (ke.getKeyChar() == 38) {
            player2.setDirection(2);
        } else if (ke.getKeyChar() == 39) {
            player2.setDirection(3);
        } else if (ke.getKeyChar() == 40) {
            player2.setDirection(4);
        } else if (ke.getKeyChar() == 65) {
            player1.setDirection(1);
        } else if (ke.getKeyChar() == 87) {
            player1.setDirection(2);
        } else if (ke.getKeyChar() == 68) {
            player1.setDirection(3);
        } else if (ke.getKeyChar() == 83) {
            player1.setDirection(4);
        }
    }

    @Override
    public void keyReleased(KeyEvent ke) {

    }
}
    // timer event / method

