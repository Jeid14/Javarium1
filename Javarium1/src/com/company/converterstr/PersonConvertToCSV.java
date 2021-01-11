package com.company.converterstr;

import com.company.model.Person;
import com.company.utils.FileHelper;
import com.company.utils.ScanerFileName;
import com.fasterxml.jackson.core.JsonProcessingException;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PersonConvertToCSV implements IPersonConvertor {

    @Override
    public String convertPersonToStr(List<Person> personList) throws JsonProcessingException {
        String[][] values = new String[personList.size() + 1][5];
        values[0] = new String[]{"id", "first name", "last name", "age", "city"};
        int i = 1;
        for (Person person : personList) {
            values[i] = new String[]{String.valueOf(person.getId()), person.getFirstName(),
                    person.getLastName(), String.valueOf(person.getAge()), person.getCity()};
            i++;
        }
        return Arrays.stream(values)
                .map(this::convertToCSV)
                .collect(Collectors.joining("\n"));

    }

    @Override
    public List<Person> convertStrToPerson(String personStr) throws IOException {
        List<Person> persons = new ArrayList<>();
        personStr = new FileHelper().readFromFile(ScanerFileName.getInputFileName());
        String[] strPerson = personStr.split("\n");
        List<String[]> personsArray = new ArrayList<>();
        for (String s : strPerson) {
            personsArray.add(s.split(","));
        }
        int i = 0;
        if (personsArray.get(0)[0].equals("id")) {
            i = 1;
        }
        while (i < personsArray.size()) {
            String[] value = personsArray.get(i);
            Person person = new Person(Integer.parseInt(value[0]), value[1], value[2], Integer.parseInt(value[3]), value[4]);
            persons.add(person);
            i++;
        }
        return persons;
    }

    public String convertToCSV(String[] data) {
        return Stream.of(data)
                .map(this::escapeSpecialCharacters)
                .collect(Collectors.joining(","));
    }

    public String escapeSpecialCharacters(String data) {
        String escapedData = data.replaceAll("\\R", " ");
        if (data.contains(",") || data.contains("\"") || data.contains("'")) {
            data = data.replace("\"", "\"\"");
            escapedData = "\"" + data + "\"";
        }
        return escapedData;
    }


}
