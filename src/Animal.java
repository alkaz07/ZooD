public abstract class Animal {
    boolean isAlive = true;
    public void die(){
        isAlive=false;
    }

    public abstract void move();
}
