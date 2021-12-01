import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

public class MyDateTest {
    MyDate myDate;


    @BeforeEach()
    void init() {
        System.out.println("each test");
        myDate = new MyDate();
    }




}
