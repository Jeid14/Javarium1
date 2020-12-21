package Executor;

import com.company.Person;
import com.company.utils.FileHelper;

import java.io.IOException;
import java.util.ArrayList;

public class StringFormatExecutor implements Executable{

    @Override
    public void write(Person person) {

    }

    @Override
    public ArrayList<Person> read() {
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
