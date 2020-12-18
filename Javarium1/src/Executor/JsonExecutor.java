package Executor;

import com.company.Person;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.List;

public class JsonExecutor implements Executable {
    @Override
    public void write(Person person) {
        GsonBuilder builder = new GsonBuilder();
        Gson gson = builder.create();
        System.out.println(gson.toJson(person));
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
