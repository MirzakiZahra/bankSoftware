import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;

public class PersonTest {
    Person person;
    Disk disk;
    MyDate myDate;
    @BeforeEach()
    void init() {
        System.out.println("each test");
        person = new Person();
        disk=new Disk("film");
        myDate =new MyDate(1400,8,20);
    }
    @Test
    //@CsvSource({"myDate,disk"})
    void givenDiskAndDate_WhenValidBorrowMethod_ThenSetDiskAndDate(){
        person.borrow(myDate,disk);
        assertEquals(myDate,person.getReceived());
        List<String> expectedDiskName = new ArrayList<>();
        expectedDiskName.add(disk.getName());
        assertEquals(expectedDiskName,person.getDiskListOfFine().stream().
                map(i->i.getName()).filter(j->j.equals(disk.getName())).collect(Collectors.toList()));
    }
  

  @Test
    void givenDiskAndDate_WhenValidReturnMethod_ThenSetDiskAndDate(){
        person.returnDisk(myDate,disk);
        assertEquals(myDate,person.getRefunds());
        List<String> expectedDiskName = new ArrayList<>();
        assertEquals(expectedDiskName,person.getDiskListOfFine().stream().
                map(i->i.getName()).filter(j->j.equals(disk.getName())).collect(Collectors.toList()));
    }
}
