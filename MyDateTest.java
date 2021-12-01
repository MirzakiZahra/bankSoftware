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
	    @ParameterizedTest
    @CsvSource({"10,5,32,false","16,7,31,false","13,12,30,false","10,2,-7,false"
    ,"11,4,20,true"})
    void givenValidDate_WhenValidDay_ThenAccurateResponseReturn
            (int year, int month, int day, boolean output) {

        boolean expected = myDate.valid_date(year, month, day);
        assertEquals(output, expected);
    }
    @ParameterizedTest
    @CsvSource({"10,-7,13,false","10,13,20,false","10,10,20,true"})
    void givenValidMonth_WhenValidMonth_ThenAccurateResponseReturn
            (int year, int month, int day, boolean output){

        boolean expected = myDate.valid_date(year, month, day);
        assertEquals(output, expected);
    }
	    @ParameterizedTest
    @CsvSource({"0,3,12,false","10000,3,12,false","-7,3,12,false","10,3,12,true"})
    void givenValidYear_WhenValidYear_ThenAccurateResponseReturn
            (int year, int month, int day, boolean output){

        boolean expected = myDate.valid_date(year, month, day);
        assertEquals(output, expected);
    }





}
