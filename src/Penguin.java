import java.util.Random;

public class Penguin extends Bird implements Swimmable{
    public Penguin() {
        super("черно-белое");
    }

    @Override
    public void makeSound() {
        System.out.println("криииик");
    }

    @Override
    public void move() {
        swim();
    }

    public void swim(){
        System.out.println("Пингвины очень хорошо плавают");
    }
}
