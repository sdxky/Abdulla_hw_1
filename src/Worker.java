public class Worker extends Human {
    private JobTitle jobTitle;

    public Worker(String name, int age, Location location, JobTitle jobTitle) {
        super(name, age, location);
        this.jobTitle = jobTitle;
    }

    public JobTitle getJobTitle() {
        return jobTitle;
    }

    public final String getInfo() {
        return getInfo("No additional info");
    }

    public String getInfo(String additionalInfo) {
        return "Worker{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", location=" + getLocation() +
                ", jobTitle=" + jobTitle +
                ", additionalInfo='" + additionalInfo + '\'' +
                '}';
    }

    @Override
    public String toString() {
        return "Worker{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", location=" + getLocation() +
                ", jobTitle=" + jobTitle +
                '}';
    }
}
