public final class Supervisor extends Worker {
    private String department;

    public Supervisor(String name, int age, Location location, JobTitle jobTitle, String department) {
        super(name, age, location, jobTitle);
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    @Override
    public String getInfo(String additionalInfo) {
        return "Supervisor{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", location=" + getLocation() +
                ", jobTitle=" + getJobTitle() +
                ", department='" + department + '\'' +
                ", additionalInfo='" + additionalInfo + '\'' +
                '}';
    }

    @Override
    public String toString() {
        return "Supervisor{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", location=" + getLocation() +
                ", jobTitle=" + getJobTitle() +
                ", department='" + department + '\'' +
                '}';
    }
}
