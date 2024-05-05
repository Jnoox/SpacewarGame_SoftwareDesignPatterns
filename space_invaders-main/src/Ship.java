import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class Ship {

    private static Ship instance;
    
    private int x;
    private int y;
    private Image img;
    private ArrayList<Bullet> bullets;


    private Ship(int x, int y) {
        this.x = x;
        this.y = y;
        bullets = new ArrayList<>();
        img = new ImageIcon("src/ship.png").getImage();
    }

    public static Ship getInstance(int x, int y) {
        if (instance == null) {
            instance = new Ship(x, y);
        }
        return instance;
    }

    public void shot(){
        bullets.add(new Bullet(this.x+23,this.y));
    }

    public ArrayList<Bullet> getBullets() {
        return bullets;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }


    public Image getImg() {
        return img;
    }

}