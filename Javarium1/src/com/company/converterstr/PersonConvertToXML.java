package com.company.converterstr;

import com.company.model.Person;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import javax.xml.bind.JAXB;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;


public class PersonConvertToXML implements IPersonConvertor {
    private final XmlMapper mapper = new XmlMapper();


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
    public List<Person> convertStrToPerson(String personStr) {
        List<Person> newPerson = new ArrayList<Person>();
        try {
            Person person = mapper.readValue(personStr, Person.class);

            newPerson.add(person);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }


        return newPerson;
    }

}
