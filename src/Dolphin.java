public class Dolphin extends Mammal{
    public Dolphin(double height, double length) {
        super(height, length);
    }

    @Override
    public void move() {
        swim();
    }

    public void swim(){
        System.out.println("Бульк");
    }
}
