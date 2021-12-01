import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class BankTest {
    Bank bank;
    Person person;
    Disk disk;
    Person person1;
    Disk disk1;
    int amountOfFine;



    @BeforeEach()
    void init() {
        System.out.println("each test");
        bank = new Bank();
        person = new Person("ali");
        disk = new Disk("cd");
        person1 = new Person("amir");
        disk1 = new Disk("dvd");
        person.setReceived(new MyDate(1400, 3, 2));
        person.setRefunds(new MyDate(1400, 3, 11));
        person1.setReceived(new MyDate(1400, 11, 3));
        person1.setRefunds(new MyDate(1400, 12, 3));
        person.getDiskListOfFine().add(disk);
        amountOfFine = 10;
        bank.fine.add(person);


    }

    // @ParameterizedTest
    // @CsvSource({"63.0"})


}
