package com.company.converterstr;

import com.company.model.Person;
import java.util.List;

public interface IPersonConvertor {

    String convertPersonToStr(List<Person> personList);
    List<Person> convertStrToPerson(String personStr);
}
