package com.company.stringformat;

import com.company.Person;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import java.io.FileNotFoundException;
import java.util.List;

public interface IPersonConvertor {

    String convertPersonToStr(List<Person> personList) throws ParserConfigurationException, TransformerException, FileNotFoundException;
    List<Person> convertStrToPerson(String personStr);
}
