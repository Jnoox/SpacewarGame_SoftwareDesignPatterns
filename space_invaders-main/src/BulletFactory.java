import java.util.HashMap;

public class BulletFactory {
    private static final HashMap<String, Bullet> bulletMap = new HashMap<>();

    public static Bullet getBullet(int x, int y) {
        String key = x + "," + y;
        Bullet bullet = bulletMap.get(key);

        if (bullet == null) {
            bullet = new Bullet(x, y);
            bulletMap.put(key, bullet);
        }

        return bullet;
    }

    public static class Bullet {
        private String key;
        private int x;
        private int y;

        private Bullet(int x, int y) {
            this.x = x;
            this.y = y;
            this.key = x + "," + y;
        }

        public int getX() {
            return x;
        }

        public int getY() {
            return y;
        }
    }
}