import java.util.Random;

public class Parrot extends Bird {
    //память фраз - то свойство каждого отдельного объекта Попугая
    String[] arr_sound = {"Тысяча чертей", "Штиль, ветер молчит", "Чик чирик", "Упал белой чайкой на дно", "Карамба капитан"};
    String name="";

    public Parrot(String featherColoring) {
        super(featherColoring);
    }

    public Parrot(String featherColoring, String[] sounds) {
        super(featherColoring);
        arr_sound = sounds;
    }

    public Parrot( String name, String featherColoring, String[] arr_sound) {
        super(featherColoring);
        this.arr_sound = arr_sound;
        this.name = name;
    }

    @Override
    public void makeSound() {
        Random random = new Random();
        int n = random.nextInt(arr_sound.length);
        System.out.println(arr_sound[n]);
    }

    @Override
    public void move() {
        fly();
    }

    public void fly(){
        System.out.println(name+" улетел, но обещал вернуться");
    }
}
