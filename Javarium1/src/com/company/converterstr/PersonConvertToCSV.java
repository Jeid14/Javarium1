package com.company.converterstr;

import com.company.model.Person;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.MappingIterator;
import com.fasterxml.jackson.dataformat.csv.CsvMapper;
import com.fasterxml.jackson.dataformat.csv.CsvParser;
import com.fasterxml.jackson.dataformat.csv.CsvSchema;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PersonConvertToCSV implements IPersonConvertor {
    final CsvMapper mapper = new CsvMapper();
    final CsvSchema schema = mapper.schemaFor(Person.class);


    @Override
    public String convertPersonToStr(List<Person> personList) {
        try {
            return mapper.writer(schema.withUseHeader(true)).writeValueAsString(personList);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public List<Person> convertStrToPerson(String personStr) throws JsonProcessingException {
        mapper.enable(CsvParser.Feature.WRAP_AS_ARRAY);
            return mapper.readValue(personStr, new TypeReference<List<Person>>() {
            });



    }


}

