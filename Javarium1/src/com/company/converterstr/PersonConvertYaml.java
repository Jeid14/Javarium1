package com.company.converterstr;

import com.company.model.Person;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.type.CollectionType;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;
import com.google.gson.reflect.TypeToken;


import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class PersonConvertYaml implements IPersonConvertor {
    private final ObjectMapper mapper = new ObjectMapper(new YAMLFactory());
    private final  CollectionType listType = mapper.getTypeFactory().constructCollectionType(ArrayList.class,Person.class);
    @Override
    public String convertPersonToStr(List<Person> personList) {
        String res ="";

            try {
                res = mapper.writeValueAsString(personList);
                return  res;
            } catch (JsonProcessingException e) {
                e.printStackTrace();
            }

        return res;
    }

    @Override
    public List<Person> convertStrToPerson(String personStr) {
        List<Person> ts = new ArrayList<>();
        try {
            ts = mapper.readValue(personStr, listType);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return ts;
    }
}
