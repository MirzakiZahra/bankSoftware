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



}
