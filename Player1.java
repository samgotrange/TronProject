package tronproject;
import java.awt.*;
import java.util.concurrent.TimeUnit;
public class Player1{
    private int xPos = 0;
    private int yPos = 100;
    private int velo = 10;
    private int direction = 3;
    
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
    public void move1()throws InterruptedException {
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
