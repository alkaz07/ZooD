import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
    static void main() {
        task2();

    }

    public static void task2(){
        Mammal[] arr = {
                new Dolphin(50, 320),
                new Dolphin(40, 300),
                new Bat(4, 5),
                new Bat(3.5, 3.7)
               };

        RulerMammalLengthComparator rul1 = new RulerMammalLengthComparator("желтая", 250);
        RulerMammalLengthComparator rul2 = new RulerMammalLengthComparator("красная", 400);
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                int c = rul2.compare(arr[i],arr[j]);
                System.out.println("Сравниваем "+arr[i]+" и "+ arr[j]+" результат = " + c);
            }
        }
        System.out.println("--------сортируем с помощью rul1--------");
        Arrays.sort(arr, rul1);
        System.out.println(Arrays.toString(arr));
        System.out.println("--------сортируем с помощью rul2--------");
        Arrays.sort(arr, rul2);
        System.out.println(Arrays.toString(arr));
        System.out.println("--------сортируем с помощью Неизвестного компаратора--------");
//        Arrays.sort(arr, (o1, o2) -> {
//            System.out.println("волшебным образом получаем рост "+o1+" И "+o2);
//            double x = o1.height;
//            double y = o2.height;
//            return -Double.compare(x, y);
//        });
        Arrays.sort(arr, (o1, o2)-> -Double.compare(o1.height, o2.height));
        System.out.println(Arrays.toString(arr));

    }

    public static void task1(){
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
