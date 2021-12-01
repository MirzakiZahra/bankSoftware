import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Bank {
    Set<Person>personSet=new HashSet<>();
    List<Person> fine = new ArrayList<>();

    public double fineOfOnePerson(Person person, int amountOfFine) {
        double subtractionDay = person.getRefunds().getDay() - person.getReceived().getDay();
        double subtractionMonth = (person.getRefunds().getMonth() - person.getReceived().getMonth()) * 30;
        double subtractionYear = (person.getRefunds().getYear() - person.getReceived().getYear()) * 365;
        double temp = subtractionDay + subtractionMonth + subtractionYear;
        temp = temp - 7;
        Double fine = temp * amountOfFine;
        person.setFine(fine);
        return fine;


    }

    public Double fineOfEveryOne(int amountOfFine) {
        fine.stream().forEach(i -> this.fineOfOnePerson(i, amountOfFine));
        Double sum = fine.stream().map(i -> i.getFine()).reduce(0.0, (i, j) -> i + j);
        return sum;

    }

    public List<String> listNameOfDisk() {

        List<String> nameList = fine.stream().
                flatMap(person -> person.getDiskListOfFine().stream()).
                map(Disk::getName).collect(Collectors.toList());
        return nameList;
    }

  
}
