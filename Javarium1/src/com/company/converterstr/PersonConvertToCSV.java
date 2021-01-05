package com.company.converterstr;

import com.company.model.Person;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.MappingIterator;
import com.fasterxml.jackson.databind.ObjectReader;
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
    public String convertPersonToStr(List<Person> personList) throws JsonProcessingException {
            return mapper.writer(schema.withUseHeader(true)).writeValueAsString(personList);
    }

    @Override
    public List<Person> convertStrToPerson(String personStr) throws IOException {
        List<Person> users = new ArrayList<>();
        ObjectReader oReader = mapper.reader(Person.class).with(schema);
        mapper.enable(CsvParser.Feature.WRAP_AS_ARRAY);
        MappingIterator<List<Person>> rows = oReader.readValues(personStr);
        users.add(mapper.readValue(personStr, Person.class));

        return users;
    }
}
