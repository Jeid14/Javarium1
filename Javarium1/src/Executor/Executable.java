package Executor;

import com.company.Person;

import java.io.IOException;
import java.util.ArrayList;


public interface Executable {
    void write(Person person);

    ArrayList<Person> read() throws IOException;
    boolean update(Person person);
    boolean delete(int id);
}
