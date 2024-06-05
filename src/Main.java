public class Main {
    public static void main(String[] args) {
        Location location1 = new Location("123 A St", "Springfield", "11111");
        Location location2 = new Location("456 B St", "Springfield", "22222");
        Location location3 = new Location("789 C St", "Springfield", "33333");

        Worker objectA = new Worker("A", 30, location1, JobTitle.ENGINEER);
        Supervisor objectB = new Supervisor("B", 40, location2, JobTitle.SUPERVISOR, "HR");
        Supervisor objectC = new Supervisor("C", 35, location3, JobTitle.SUPERVISOR, "IT");

        System.out.println(objectA);
        System.out.println(objectA.getInfo());

        System.out.println(objectB);
        System.out.println(objectB.getInfo("Overseeing HR operations"));

        System.out.println(objectC);
        System.out.println(objectC.getInfo("Managing IT infrastructure"));
    }
}
