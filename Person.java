import java.util.ArrayList;
import java.util.List;

public class Person {
    private String name;
    List<Disk> diskListOfFine = new ArrayList<>();
    Disk disk = new Disk();
    private Double fine;
    MyDate received = new MyDate();
    MyDate refunds = new  MyDate ();

    public Person(String name, List<Disk> diskListOfFine) {
        this.name = name;
        this.diskListOfFine = diskListOfFine;
    }

    public Person(String name) {
        this.name = name;
    }

    public Person() {
    }

    public Disk getDisk() {
        return disk;
    }

    public void setDisk(Disk disk) {
        this.disk = disk;
    }

    public Double getFine() {
        return fine;
    }

    public void setFine(Double fine) {
        this.fine = fine;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Disk> getDiskListOfFine() {
        return diskListOfFine;
    }

    public void setDiskListOfFine(List<Disk> diskListOfFine) {
        this.diskListOfFine = diskListOfFine;
    }

    public MyDate getReceived() {
        return received;
    }

    public void setReceived(MyDate received) {
        this.received = received;
    }

    public MyDate getRefunds() {
        return refunds;
    }

    public void setRefunds(MyDate refunds) {
        this.refunds = refunds;
    }

    public void borrow( MyDate  date, Disk disk) {
        this.setReceived(date);
        this.setDisk(disk);
        this.diskListOfFine.add(disk);

    }
	 public void returnDisk( MyDate  date,Disk disk) {
        this.setRefunds(date);
        this.diskListOfFine.remove(disk);
        this.setDisk(null);

    }

   
}
