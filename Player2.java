package tronproject;
import java.awt.event.*;
import java.util.concurrent.TimeUnit;
public class Player2{
    public int xPos = 400;
    public int yPos = 100;
    public int velo;
    public int direction = 1;
    
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
        }else if (direction == 2) {
            yPos -= velo;
        }else if (direction == 3) {
            xPos += velo;
        }else if (direction == 4) {
            yPos += velo;
        }
    }
}
