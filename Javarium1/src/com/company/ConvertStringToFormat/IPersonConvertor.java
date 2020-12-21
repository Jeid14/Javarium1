package com.company.stringformat;

import com.company.Person;

import java.util.List;

public interface IPersonConvertor {

    String convertPersonToStr(List<Person> personList);
    List<Person> convertStrToPerson(String personStr);
}
