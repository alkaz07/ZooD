import java.util.ArrayList;

public class Main {
    static void main() {

        Animal[] arr = {new Parrot("Арнольд", "Сине-красный", new String[]{"Ола", "Fhbdtlthxb"}),
        new Parrot("Белый"),
        new Dolphin(40, 300),
        new Bat(4, 5),
        new Penguin(),
        new Duck("Серый")};

        for (Animal a: arr) {
            a.move();
        }
        System.out.println("---------------------------------");
        int countF=0;
        for(Animal a: arr)
            if (a instanceof Flyable)
                countF++;

        Flyable[] fliers = new Flyable[countF];
        int k=0;
        for(Animal a: arr){
            if (a instanceof Flyable){
                fliers[k] = (Flyable) a;
                k++;
            }
        }

        for (Flyable f: fliers)
            f.fly();
        System.out.println("+++++++++++++++++++++++++++++++++++++");
        for (Animal a: arr){
            if (a instanceof Swimmable){
                System.out.println(a + " - пловец");
            }
            if (a instanceof Flyable){
                System.out.println(a + " - летун");
            }
        }

        Flyable x = new Flyable() {
            @Override
            public void fly() {
                System.out.println("летающее нечто");
            }
        };
        x.fly();
        if (x instanceof Flyable)
            System.out.println(x + " - летун");  //Main$1@38af3868 - летун
                                                //x -это объект АНОНИМНОГО класса, описанного внутри Main, реализующего интерфейс Flyable

        Swimmable y = () -> {System.out.println("не знаю что это, но оно не тонет"); };
        if (y instanceof Swimmable)
            System.out.println(y + " - пловец");    //y -это объект АНОНИМНОГО класса, описанного внутри Main при помощи лямбда-выражения, реализующего интерфейс Flyable

    }
}
