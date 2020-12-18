package Executor;

import com.company.Person;

import java.io.IOException;
import java.util.List;

public interface Executable {
    void write(Person person); // create
    List<Person> read() throws IOException;
    boolean update(Person person);
    boolean delete(int id);
}
