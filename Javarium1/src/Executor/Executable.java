package Executor;

import com.company.Person;

import java.io.IOException;
import java.util.List;


public interface Executable {
    void write(List<Person> personList);

    List<Person> read() throws IOException;
    boolean update(List<Person> person);
    boolean delete(int id);
}
