package tronproject;
import javax.swing.JFrame;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JPanel;
public class TronGame extends JPanel implements KeyListener {
    Player1 player1 = new Player1();
    Player2 player2 = new Player2();
    @Override
    public void keyTyped(KeyEvent ke) {
        if (ke.getKeyChar()== 37){
            player2.setDirection(1);
        }else if (ke.getKeyChar()== 38){
            player2.setDirection(2);
        }else if (ke.getKeyChar()== 39){
            player2.setDirection(3);
        }else if (ke.getKeyChar()== 40){
            player2.setDirection(4);
        }else if (ke.getKeyChar()== 65){
            player1.setDirection(1);
        }else if (ke.getKeyChar()== 87){
            player1.setDirection(2);
        }else if (ke.getKeyChar()== 68){
            player1.setDirection(3);
        }else if (ke.getKeyChar()== 83){
            player1.setDirection(4);
        }
    }

    @Override
    public void keyPressed(KeyEvent ke) {
        
    }

    @Override
    public void keyReleased(KeyEvent ke) {
        
    }
}
