package Executor;

import com.company.Person;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class BinaryExecutor implements Executable {
    @Override
    public void write(List<Person> personList) {
        FileOutputStream os = null;

    }

    @Override
    public List<Person> read() {
        List<Person> personList = new ArrayList<>();
        try {
            FileInputStream is = new FileInputStream("path...");
           // personList = is.read(); // magic
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
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
