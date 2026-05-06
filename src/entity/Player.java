package entity;

import Main.GamePanel;
import Main.KeyHandler;

import java.awt.*;

public class Player extends Entity{
    GamePanel gp;
    KeyHandler keyH;
    public Player(GamePanel gp, KeyHandler keyH){
        this.gp = gp;
        this.keyH = keyH;
        setDefaultValues();
    }
    public void setDefaultValues(){
        X=100;
        Y=100;
        speed = 4;
    }
    public void update(){
        if(keyH.upPressed == true){
            Y -= speed;
        }else if(keyH.downPressed == true){
            Y += speed;
        }else if(keyH.leftPressed == true){
            X -= speed;
        }else if(keyH.rightPressed == true){
            X += speed;
        }
    }
    public void draw(Graphics2D g2){
        g2.setColor(Color.white);
        g2.fillRect(X, Y, gp.tileSize, gp.tileSize);
    }
}
