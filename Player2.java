package tronproject;
import java.awt.*;
import java.util.concurrent.TimeUnit;
public class Player2{
    private int xPos = 1700;
    private int yPos = 200;
    private int velo = 10;
    private int direction = 1;
    
    public int getxpos(){
        return xPos;
    }
    public void setxpos(int a){
        xPos = a;
    }
    public int getypos(){
        return yPos;
    }
    public void setypos(int b){
        yPos = b;
    }
    public int getDirection1() {
        return direction;
    }
    public void setDirection(int a) {
        direction = a;
    }
    public void move2()throws InterruptedException {
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
