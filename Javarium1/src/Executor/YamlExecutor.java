package Executor;

import com.company.Person;

import java.io.IOException;
import java.util.List;

public class YamlExecutor implements Executable {

    @Override
    public void write(List<Person> personList) {

    }

    @Override
    public List<Person> read() throws IOException {
        return null;
    }

    @Override
    public boolean update(List<Person> person) {
        return false;
    }

    @Override
    public boolean delete(int id) {
        return false;
    }
}
