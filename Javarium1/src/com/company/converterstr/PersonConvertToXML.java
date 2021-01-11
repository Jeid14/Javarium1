package com.company.converterstr;

import com.company.model.Person;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import java.io.IOException;
import java.util.List;


public class PersonConvertToXML implements IPersonConvertor {
    private final XmlMapper mapper = new XmlMapper();
    private final TypeReference<List<Person>> typeReference = new TypeReference<List<Person>>() {
    };


    @Override
    public String convertPersonToStr(List<Person> personList) {
        String xml = "";
        try {
            xml = mapper.writeValueAsString(personList);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return xml;
    }

    @Override
    public List<Person> convertStrToPerson(String personStr) throws IOException {
        return mapper.readValue(personStr, new TypeReference<List<Person>>() {
        });

    }

}
