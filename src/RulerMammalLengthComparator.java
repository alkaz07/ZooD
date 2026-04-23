import java.util.Comparator;

public class RulerMammalLengthComparator implements Comparator<Mammal> {
    String color;
    double maxLen = 200;

    public RulerMammalLengthComparator(String color, double maxLen) {
        this.color = color;
        this.maxLen = maxLen;
    }

    public int compare(Mammal one, Mammal two) {
        System.out.println("прикладываем " + color + " рулетку к " + one);
        double x, y;
        if (maxLen < one.length) {
            x = maxLen;
            System.out.println("рулетки не хватило, пока пишем "+x);
        } else
            x = one.length;
        System.out.println("прикладываем " + color + " рулетку к " + two);
        if (maxLen < two.length) {
            y = maxLen;
            System.out.println("рулетки не хватило, пока пишем "+y);
        }
        else
            y = two.length;
        return Double.compare(x,y);
    }
}
