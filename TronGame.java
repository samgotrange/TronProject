package tronproject;

import java.awt.*;
import java.awt.event.*;
import static java.awt.event.KeyEvent.VK_A;
import static java.awt.event.KeyEvent.VK_D;
import static java.awt.event.KeyEvent.VK_DOWN;
import static java.awt.event.KeyEvent.VK_LEFT;
import static java.awt.event.KeyEvent.VK_RIGHT;
import static java.awt.event.KeyEvent.VK_S;
import static java.awt.event.KeyEvent.VK_UP;
import static java.awt.event.KeyEvent.VK_W;
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
        this.setFocusable(true);
        this.requestFocusInWindow();
        addKeyListener(this);
    }

    public void Start() {
        timer = new Timer(25, this);
        timer.start();
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        try {
            player1.move1();
        } catch (InterruptedException ex) {
            Logger.getLogger(TronGame.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (player1.getxpos() < 0) {
            player1.setxpos(0);
        }
        if (player1.getxpos() > this.size().width - 10) {
            player1.setxpos(this.size().width - 10);
        }
        if (player1.getypos() < 0) {
            player1.setypos(0);
        }
        if (player1.getypos() > this.size().height - 10) {
            player1.setypos(this.size().height - 10);
        }
        try {
            player2.move2();
        } catch (InterruptedException ex) {
            Logger.getLogger(TronGame.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (player2.getxpos() < 0) {
            player2.setxpos(0);
        }
        if (player2.getxpos() > this.size().width - 10) {
            player2.setxpos(this.size().width - 10);
        }
        if (player2.getypos() < 0) {
            player2.setypos(0);
        }
        if (player2.getypos() > this.size().height - 10) {
            player2.setypos(this.size().height - 10);    
        }
    this.repaint();
    }

    @Override
    public void paintComponent(Graphics g) {
        g.fillRect(player1.getxpos(), player1.getypos(), 10, 10);
        g.fillRect(player2.getxpos(), player2.getypos(), 10, 10);

    }

    @Override
    public void keyTyped(KeyEvent ke) {

    }

    @Override
    public void keyPressed(KeyEvent ke) {
        if (ke.getKeyCode() == VK_LEFT) {
            player2.setDirection(1);
        } else if (ke.getKeyCode() == VK_UP) {
            player2.setDirection(2);
        } else if (ke.getKeyCode() == VK_RIGHT) {
            player2.setDirection(3);
        } else if (ke.getKeyCode() == VK_DOWN) {
            player2.setDirection(4);
        } else if (ke.getKeyCode() == VK_A) {
            player1.setDirection(1);
        } else if (ke.getKeyCode() == VK_W) {
            player1.setDirection(2);
        } else if (ke.getKeyCode() == VK_D) {
            player1.setDirection(3);
        } else if (ke.getKeyCode() == VK_S) {
            player1.setDirection(4);
        }
    }

    @Override
    public void keyReleased(KeyEvent ke) {

    }
}
