package com.company.ConvertStringToFormat;

import com.company.Person;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PersonConvertBinary implements com.company.stringformat.IPersonConvertor {
    @Override
    public String convertPersonToStr(List<Person> personList) {
        byte[] bytes = String.valueOf(personList).getBytes();
        StringBuilder binary = new StringBuilder();
        for (byte b : bytes) {
            int val = b;
            for (int i = 0; i < 8; i++) {
                binary.append((val & 128) == 0 ? 0 : 1);
                val <<= 1;
            }
            binary.append(' ');

        }

        return String.valueOf(binary);
    }

    @Override
    public List<Person> convertStrToPerson(String personStr) {
        List<Person> personList = new ArrayList<>();
        String s = " ";
        for (int index = 0; index < personStr.length(); index += 9) {
            String temp = personStr.substring(index, index + 8);
            int num = Integer.parseInt(temp, 2);
            char letter = (char) num;
            s = s + letter;
        }

        return null;
    }
}
