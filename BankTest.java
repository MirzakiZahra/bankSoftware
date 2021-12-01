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
    @Test
    void givenAmountOfFineAndDate_WhenCalculateAccurateFine_ThenAccurateResponse() {

        assertEquals(20, bank.fineOfOnePerson(person, amountOfFine));
    }

    @Test
    void givenListOfPersonAndAmountOfFine_WhenCalculateFineForALL_ThenAccurateResponse() {
        bank.fine.add(person1);
        assertEquals(250, bank.fineOfEveryOne(amountOfFine));

    }
    @Test
    void givenListOfPerson_WhenListNameOfDiskOfGharz_ThenListNameOfDisk(){
        List<String> diskList=new ArrayList<>();
        diskList.add(disk.getName());
        assertEquals(diskList,bank.listNameOfDisk());

    }
	    @Test
    void givenNameOfDisk_WhenTypeOfEvent_ThenAccurateResponse() {

        bank.typeOfEvent(disk.getName());
        List<String> nameList = new ArrayList<>();
        nameList.add(disk.getName());
        assertEquals(nameList,bank.typeOfEvent(disk.getName()));
        List<String>expected=new ArrayList<>();
        assertEquals(expected, bank.typeOfEvent(disk1.getName()));


    }



}
