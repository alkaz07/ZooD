import java.util.Random;

public class Parrot extends Bird {

    public Parrot(String featherColoring) {
        super(featherColoring);
    }

    @Override
    public void makeSound() {
        Random random = new Random();
        int n = random.nextInt(5);
        String[] arr_sound = {"Тысяча чертей", "Штиль, ветер молчит", "Чик чирик", "Упал белой чайкой на дно", "Карамба капитан"};
        System.out.println(arr_sound[n]);

    }

    @Override
    public void move() {
        fly();
    }

    public void fly(){
        System.out.println("Он улетел, но обещал вернуться");
    }
}
