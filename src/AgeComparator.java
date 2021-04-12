import java.util.Comparator;

public class AgeComparator implements Comparator<Model> {

    @Override
    public int compare(Model o1, Model o2) {
        return (int) (o1.getAge() - o2.getAge());
    }
}