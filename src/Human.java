public class Human {
    private String name;
    private int age;
    private Location location;

    public Human(String name, int age, Location location) {
        this.name = name;
        this.age = age;
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Location getLocation() {
        return location;
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", location=" + location +
                '}';
    }
}
