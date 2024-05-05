import javax.swing.*;
import java.awt.*;

public class Alien implements Enemy {
    private int x;
    private int y;
    private Image img;

    public Alien(int x, int y) {
        this.x = x;
        this.y = y;
        img = new ImageIcon("src/alien.png").getImage();
    }

    private Alien (Alien alien) {
        this.x = alien.x;
        this.y = alien.y;
        this.img = alien.img;
    }

    public void move(int dir) {
        this.x += dir * 5;
    }

    public void moveDown() {
        this.y += 20;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public Image getImg() {
        return img;
    }

    @Override
    public Enemy makeCopy() {
        Alien obj= null;
        try {
         obj = (Alien) super.clone();
        }catch(CloneNotSupportedException e){
            e.printStackTrace();
        }
        return obj;
    }
}