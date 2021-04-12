import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

public class Program {
    public static final String line = "-------------------------------------------------------";
    public static void main(String[] args) throws IOException {
        File file = new File("file.txt");
        List <Model> list = new ArrayList<>();
        fill(list);
        list.sort(new AgeComparator());
        writeToFile(file, list);
        readFromFile(file);
    }

    static void fill(List<Model> list) {
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

    public  static  void writeToFile( File file, List<Model> list) {
        try (PrintStream ps = new PrintStream(file)) {
            ps.println("|   id   | Вік  | Ріст |    Ім'я    |    Прізвище     |");
            ps.println(line);
            for (Model a : list) {
                ps.print("|");
                ps.printf("%7s | %2s | %4s | %10s | %15s ", a.getId(), a.getAge(), a.getHeight(), a.getName(), a.getSurname());
                ps.print("|\n");
                ps.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void readFromFile(File file) throws IOException {
        int b;
        FileInputStream fs;
        InputStreamReader isr;
        fs = new FileInputStream(file);
        isr = new InputStreamReader(fs, StandardCharsets.UTF_8);
        while ((b = isr.read()) != -1) {
            System.out.print((char) b);
        }
        fs.close();
        isr.close();
    }
}

