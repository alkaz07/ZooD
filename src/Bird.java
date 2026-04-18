public abstract class Bird extends Animal{
    String FeatherColoring;

    public Bird(String featherColoring) {
        FeatherColoring = featherColoring;
    }

    public abstract void makeSound();
}
