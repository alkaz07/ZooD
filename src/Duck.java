public class Duck extends Bird implements Flyable, Swimmable{
    public Duck(String featherColoring) {
        super(featherColoring);
    }

    @Override
    public void makeSound() {
        System.out.println("Кря");
    }

    @Override
    public void move() {
        fly();
        swim();
    }


    @Override
    public void fly() {
        System.out.println("Утка летает кое-как");
    }

    @Override
    public void swim() {
        System.out.println("Утка хорошо плавает");
    }
}
