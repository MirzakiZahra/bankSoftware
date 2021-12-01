import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Bank bank = new Bank();
        Person person = new Person();
        Disk disk = new Disk();
        MyDate myDate = new MyDate();
        System.out.println("****welcome****");
        int choice=0;

        do {
            System.out.println("1.enter event\n2.fine\n3.exit");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:

                    System.out.println("please enter a number of event");
                    int input = scanner.nextInt();
                    System.out.println("please enter an amount of debt");
                    int numberOfDebt = scanner.nextInt();
                    for (int i = 0; i < input; i++) {


                        System.out.println("please enter a date(day,month,year)" +
                                " & name of member & name of disk ");
                        int day = scanner.nextInt();
                        int month = scanner.nextInt();
                        int year = scanner.nextInt();
                        myDate.setDay(day);
                        myDate.setMonth(month);
                        myDate.setYear(year);

                        String nameOfMember = scanner.next();

                        String nameOfDisk = scanner.next();
                        if (bank.typeOfEvent(nameOfDisk).size() == 0) {
                            //دریافت
                            person.setName(nameOfMember);
                            disk.setName(nameOfDisk);
                            bank.fine.add(person);
                            bank.personSet.add(person);
                            person.borrow(myDate, disk);

                        } else {
                            disk.setName(nameOfDisk);
                            bank.fine.remove(person);
                            bank.personSet.add(person);
                            bank.fineOfOnePerson(person, numberOfDebt);
                            person.returnDisk(myDate, disk);
                        }
                    }
                    break;
                case 2:
                    System.out.println("enter amount of fine");
                    int number = scanner.nextInt();
                    bank.fineOfEveryOne(number);
                    break;
                case 3:
                    break;


            }
        }while (choice!=3);
    }


}
