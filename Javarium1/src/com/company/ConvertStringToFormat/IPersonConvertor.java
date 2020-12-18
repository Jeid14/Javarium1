package com.company.stringformat;

import com.company.Person;

import java.util.List;

public interface IPersonConvertor {

    String convertPersonToStr(Person person);
    List<Person> convertStrToPerson(String personStr);
}
