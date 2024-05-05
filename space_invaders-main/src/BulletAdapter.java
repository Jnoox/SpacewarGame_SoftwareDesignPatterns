class BulletAdapter implements ShotsTypes {
    private DeadlyBullet adaptee;

    public BulletAdapter(DeadlyBullet adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public int getX() {
        return BulletFactory.getBullet(adaptee.getPosX(), adaptee.getPosY()).getX();
    }

    @Override
    public int getY() {
        return BulletFactory.getBullet(adaptee.getPosX(), adaptee.getPosY()).getY();
    }
}