package com.company.ConvertStringToFormat;

import com.company.Person;
import com.company.stringformat.IPersonConvertor;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.List;

public class PersonConverterJson implements IPersonConvertor {

    private final Gson gson = new Gson();
    private final Type type = new TypeToken<List<Person>>(){ }.getType();

    @Override
    public String convertPersonToStr(Person person) {
        String str = gson.toJson(person);
        return  str;
    }

    @Override
    public List<Person> convertStrToPerson(String personStr) {
        return gson.fromJson(personStr, type);
    }
}
