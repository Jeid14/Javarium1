package com.company.ConvertStringToFormat;

import com.company.Person;

import javax.xml.bind.JAXB;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;

public class PersonConvertToXML implements com.company.stringformat.IPersonConvertor {


    @Override
    public String convertPersonToStr(List<Person> personList){
        String content = "";

        for(Person person:personList) {
            try {
                JAXBContext jaxbContext = JAXBContext.newInstance(Person.class);
                Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
                jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);

            } catch (JAXBException e) {
                e.printStackTrace();
            }

        }


        return content;
    }

    @Override
    public List<Person> convertStrToPerson(String personStr) {
         Person person = JAXB.unmarshal(new StringReader(personStr), Person.class);
         List<Person> personList = new ArrayList<>();
         personList.add(person);

        return personList;
    }
}
