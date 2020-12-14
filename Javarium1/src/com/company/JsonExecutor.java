package com.company;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.codehaus.jackson.map.ObjectMapper;

import java.util.List;

public class JsonExecutor implements Executable {
    @Override
    public void write(Person person) {
        GsonBuilder builder = new GsonBuilder();
        Gson gson = builder.create();
        gson.toJson(person); // src/resources/data.json
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
