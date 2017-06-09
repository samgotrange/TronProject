package tronproject;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.*;

public class TronGame extends JPanel implements KeyListener {

    Player1 player1;
    Player2 player2;
    private int xPos1;
    private int yPos1;
    private final int VELO = 10;
    private int xPos2;
    private int yPos2;
    private int direction1;
    private int direction2;
    private Timer timer;
    private JPanel j;
    
    public TronGame() {
        player1 = new Player1();
        player2 = new Player2();
        
        player1.xPos = xPos1;
        player1.yPos = yPos1;
        player1.velo = VELO;
        player1.direction = direction1;
        
        player2.xPos = xPos2;
        player2.yPos = yPos2;
        player2.velo = VELO;
        player2.direction = direction2;
    }

    public JPanel setPanel(){
        j = this;
        return j;
    }
    
    public void Start(){
        timer = new Timer(25, (ActionListener) this);
        timer.start();
        setPanel();
        
        
        
    }
    
    // method for overriding paintComponent
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.fillRect(0, 0, 10, 10);
    }
    
    @Override
    public void keyTyped(KeyEvent ke) {

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
    public void keyPressed(KeyEvent ke) {

    }

    @Override
    public void keyReleased(KeyEvent ke) {

    }

    // timer event / method
    

}
