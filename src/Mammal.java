public abstract class Mammal extends Animal{
    double height;
    double length;

    public Mammal(double height, double length) {
        this.height = height;
        this.length = length;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName()+
                "{" +
                "height=" + height +
                ", length=" + length +
                ", isAlive=" + isAlive +
                '}';
    }
}
