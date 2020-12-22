package Executor;

import com.company.ConvertStringToFormat.PersonConvertBinary;
import com.company.ConvertStringToFormat.PersonConverterJson;
import com.company.Person;
import com.company.ScanerFileName;
import com.company.utils.FileHelper;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class BinaryExecutor  {
    FileHelper fileHelper = new FileHelper();
    ScanerFileName scanerFileName = new ScanerFileName();
    String fileName = scanerFileName.getInputFileName();
    PersonConvertBinary personConvertBinary =new PersonConvertBinary();

    public void write(List<Person> personList) {
        try {
            fileHelper.saveToFile(personConvertBinary.convertPersonToStr(personList),fileName);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


    public void read() {
        try {
            System.out.println( personConvertBinary.convertStrToPerson(fileHelper.readFromFile(fileName)));
        } catch (IOException e) {
            e.printStackTrace();
        }


    }


    public boolean update(Person person) {
        return false;
    }


    public boolean delete(int id) {
        return false;
    }
}
