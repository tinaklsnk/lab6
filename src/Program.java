import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;

public class Program {
    public static void main(String[] args) throws IOException {
        List <Model> list = new ArrayList<>();
        fill(list);
        show(list);
        Collections.sort(list, new AgeComparator());
        show(list);
        int b = 0;
        FileInputStream file = new FileInputStream("file.TXT");
        while((b = file.read()) != -1) {
            System.out.println((char)b);
        }
    }

    static void fill(List list) {
        list.add(new Model(87073, 17, 185, "Антон", "Пласконіс"));
        list.add(new Model(54997, 20, 190, "Данило", "Щербатюк"));
        list.add(new Model(12662, 44, 176, "Мирослав", "Пархомчук"));
        list.add(new Model(33611, 32, 181, "Владислав", "Борковський"));
        list.add(new Model(93186, 51, 179, "Богдан", "Шатковський"));
        list.add(new Model(36240, 22, 155, "Галина", "Брилинська"));
        list.add(new Model(77356, 19, 180, "Оксана", "Салко"));
        list.add(new Model(75770, 28, 168, "Тетяна", "Гулевич"));
        list.add(new Model(37846, 33, 171, "Стефанія", "Кавун"));
        list.add(new Model(79673, 25, 163, "Руслана", "Крамаренко"));
    }

    public static void show(List<Model> list) {
        for (Model a: list) {
            System.out.println(a.getId() + "\t" +a.getAge() + "\t" + a.getName() + "\t" + a.getSurname());
        }
        System.out.println();
    }
}

