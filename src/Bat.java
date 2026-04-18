public class Bat extends Mammal implements Flyable{

    public Bat(double height, double length) {
        super(height, length);
    }

    @Override
    public void move() {
        fly();
    }

    public void fly(){
        System.out.println("Вжух");
    }
}
