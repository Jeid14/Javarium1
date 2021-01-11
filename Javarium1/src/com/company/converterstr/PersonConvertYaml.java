package com.company.converterstr;

import com.company.utils.ScanerFileName;
import com.company.model.Person;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;


import java.io.File;
import java.io.IOException;
import java.util.List;

public class PersonConvertYaml implements IPersonConvertor {
    private final ObjectMapper mapper;

    public PersonConvertYaml() {
        mapper = new ObjectMapper(new YAMLFactory());
    }

    @Override
    public String convertPersonToStr(List<Person> personList) throws JsonProcessingException {
        return mapper.writeValueAsString(personList);
    }

    @Override
    public List<Person> convertStrToPerson(String personStr) throws IOException {

        return mapper.readValue(new File(ScanerFileName.getInputFileName()), new TypeReference<List<Person>>() {
        });
    }
}
