public class Disk {
    private String name;
    private final static int count=1;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCount() {
        return count;
    }

    public Disk(String name) {
        this.name = name;
    }

    public Disk() {
    }

    @Override
    public String toString() {
        return "Disk{" +
                "name='" + name + '\'' +
                '}';
    }
}
