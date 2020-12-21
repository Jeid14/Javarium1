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
    public void write(Person person)  {
        try {
            fileHelper.saveToFile(personConverterJson.convertPersonToStr(person),fileName);
        } catch (IOException e) {
            System.out.println("shit");
        }


    }

    @Override
    public List<Person> read() throws IOException {
        List<Person> list = new ArrayList<>();
        return person.createListPerson(person);
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
