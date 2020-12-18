package Executor;

import com.company.Person;

import java.io.IOException;
import java.util.ArrayList;

public class YamlExecutor implements Executable {

    @Override
    public void write(Person person) {

    }

    @Override
    public ArrayList<Person> read() throws IOException {
        return null;
    }

    @Override
    public boolean update(Person person) {
        return false;
    }

    @Override
    public boolean delete(int id) {
        return false;
    }
}
