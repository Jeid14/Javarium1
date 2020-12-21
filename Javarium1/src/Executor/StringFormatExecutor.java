package Executor;

import com.company.Person;

import java.util.List;

public class StringFormatExecutor implements Executable{

    @Override
    public void write(Person person) {

    }

    @Override
    public List<Person> read() {
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
