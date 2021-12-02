import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Bank bank = new Bank();
        System.out.println("****welcome****");
        int choice=0;
        int numberOfDebt=0;

        do {
            System.out.println("1.enter event\n2.fine\n3.AccurateOutput\n4.exit");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:

                    System.out.println("please enter a number of event");
                    int input = scanner.nextInt();
                    System.out.println("please enter an amount of debt");
                    numberOfDebt = scanner.nextInt();
                    for (int i = 0; i < input; i++) {


                        System.out.println("please enter a date(day,month,year)" +
                                " & name of member & name of disk ");
                        int day = scanner.nextInt();
                        int month = scanner.nextInt();
                        int year = scanner.nextInt();
                        MyDate myDate = new MyDate();
                        Person person = new Person();
                        Disk disk = new Disk();
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
                            if (bank.existOfPerson(nameOfMember)==null) {
                                bank.personSet.add(person);
                            }else {
                                person=bank.existOfPerson(nameOfMember);
                            }
                            person.borrow(myDate, disk);

                        } else {
                            disk.setName(nameOfDisk);
                            bank.fine.remove(bank.existOfPerson(nameOfMember));
                            bank.fineOfOnePerson(bank.existOfPerson(nameOfMember), numberOfDebt);
                            bank.existOfPerson(nameOfMember).returnDisk(myDate, disk);
                        }
                    }
                    break;
                case 2:
                    System.out.println(bank.fineOfEveryOne(numberOfDebt));
                    break;
                case 3:
                    System.out.println("Fines:");
                    bank.fineOfEveryOne(numberOfDebt);
                    bank.personSet.stream().forEach(i-> System.out.println(i.getName()+": "+
                            i.getFine()));
                    System.out.println("Borrowed Disks:");
                    bank.listNameOfDisk().stream().forEach(i-> System.out.println(i));
                    break;
                case 4:
                    break;


            }
        }while (choice!=4);
    }


}
