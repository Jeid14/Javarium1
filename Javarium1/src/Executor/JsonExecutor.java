package Executor;

import com.company.ConvertStringToFormat.PersonConverterJson;
import com.company.Person;
import com.company.ScanerFileName;
import com.company.utils.FileHelper;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class JsonExecutor implements Executable{
    FileHelper fileHelper = new FileHelper();
    ScanerFileName scanerFileName = new ScanerFileName();
    PersonConverterJson personConverterJson = new PersonConverterJson();
    String fileName = scanerFileName.getInputFileName();
    @Override
    public void write(List<Person> personList)  {
        try {
            fileHelper.saveToFile(personConverterJson.convertPersonToStr(personList),fileName);
        } catch (IOException e) {
            System.out.println("");
        }


    }

    @Override
    public List<Person> read() throws IOException {
        return personConverterJson.convertStrToPerson(fileHelper.readFromFile(fileName));
    }

    @Override
    public boolean update(Person person) {
        return false;
    }

    @Override
    public boolean delete(int id) {
        return false;
    }
}
