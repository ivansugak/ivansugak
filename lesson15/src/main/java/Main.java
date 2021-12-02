import com.tms.homework.task1.Tasks;
import com.tms.homework.task4.Car;
import com.tms.homework.task5.Person;
import com.tms.homework.task6.Book;
import com.tms.homework.task6.EmailAddress;
import com.tms.homework.task6.Library;
import com.tms.homework.task6.Reader;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Tasks tasks = new Tasks();
        tasks.getNumbers();
        tasks.getEvenNumbers();
        tasks.getNames();

        Car.cars = Arrays.asList(
                new Car("AA1111BX", 2007),
                new Car("AK5555IT", 2010),
                new Car(null, 2012),
                new Car("", 2015),
                new Car("AI3838PP", 2017));
        Car car = new Car();
        car.printCars();

        List<Person> personList = new ArrayList<>();
        Person person1 = new Person("Антонов", 21, Person.FEMALE);
        Person person2 = new Person("Детров", 35, Person.FEMALE);
        Person person3 = new Person("Дидоров", 45, Person.FEMALE);
        Person person4 = new Person("Александров", 50, Person.FEMALE);
        Collections.addAll(personList, person1, person2, person3, person4);

        Person.getNameD(personList);
//_________________________________________________________________________
        Library library = new Library(new ArrayList<>(), new ArrayList<>(), new ArrayList<>()); //#6+
        Book book1 = new Book("Author1", "Сказки", 2021);
        Book book2 = new Book("Author2", "Приключения", 2018);
        Book book3 = new Book("Author3", "Детектив", 2020);
        Book book4 = new Book("Пушкин Александр Сергеевич", "Триллер", 2015);
        Collections.addAll(library.getListL(), book1, book2, book3, book4);
        System.out.println(library.getListBook(library.getListL()));

        Reader reader1 = new Reader("Гена", new EmailAddress("Гена@gmail.com"), true);
        Reader reader2 = new Reader("Кеша", new EmailAddress("Кеша@gmail.com"), true);
        Reader reader3 = new Reader("Себастьян", new EmailAddress("Себастьян@gmail.com"), true);
        Reader reader4 = new Reader("Джамшут", new EmailAddress("Джамшут@gmail.com"), false);
        Collections.addAll(library.getListR(), reader1, reader2, reader3, reader4);
        System.out.println(library.getListEmail(library.getListR()));

        reader1.getList().add(book1);
        reader1.getList().add(book2);
        reader4.getList().add(book3);
        reader4.getList().add(book4);

        System.out.println(library.getListEmailAndBooks(library.getListR()));

        System.out.println(library.getAllBooksFromReaders(library.getListR()));

        System.out.println(library.getCountReaderGetPushkin(library.getListR()));
    }
}
