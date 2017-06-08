package tronproject;
import java.awt.event.*;
import java.util.concurrent.TimeUnit;
public class Player2{
    private int xPos;
    private int yPos;
    private int velo = 10;
    private int direction = 1;
    
    public int getxpos(){
        return xPos;
    }
    
    public int getypos(){
        return yPos;
    }
       
    public int getDirection1() {
        return direction;
    }
    public void setDirection(int a) {
        direction = a;
    }
    public void move2() throws InterruptedException {
        if (direction == 1) {
            xPos -= velo;
            TimeUnit.MILLISECONDS.sleep(100);
        }else if (direction == 2) {
            yPos -= velo;
            TimeUnit.MILLISECONDS.sleep(100);
        }else if (direction == 3) {
            xPos += velo;
            TimeUnit.MILLISECONDS.sleep(100);
        }else if (direction == 4) {
            yPos += velo;
            TimeUnit.MILLISECONDS.sleep(100);
        }
    }
}
