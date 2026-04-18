

public class Main {
    static void main() {
        Animal[] arr = {new Parrot("Арнольд", "Сине-красный", new String[]{"Ола", "Fhbdtlthxb"}),
        new Parrot("Белый"),
        new Dolphin(40, 300),
        new Bat(4, 5),
        new Penguin()};

        for (Animal a: arr) {
            a.move();
        }


    }
}
