import java.util.ArrayList;
import java.util.List;

public class Model implements Comparable<Model>{
    private int id;
    private double age;
    private int height;
    private String name;
    private String surname;

    public Model(int id, double age, int height, String name, String surname) {
        this.id = id;
        this.age = age;
        this.height = height;
        this.name = name;
        this.surname = surname;
    }

    @Override
    public int compareTo(Model o) {
        return 0;
    }

    public int getId() {
        return id;
    }

    public double getAge() {
        return age;
    }

    public int getHeight() {
        return height;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setAge(double age) {
        this.age = age;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }


}
