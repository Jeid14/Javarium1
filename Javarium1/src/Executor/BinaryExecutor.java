package Executor;

import com.company.ConvertStringToFormat.PersonConvertBinary;
import com.company.ConvertStringToFormat.PersonConverterJson;
import com.company.Person;
import com.company.ScanerFileName;
import com.company.utils.FileHelper;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class BinaryExecutor implements Executable {
    FileHelper fileHelper = new FileHelper();
    ScanerFileName scanerFileName = new ScanerFileName();
    String fileName = scanerFileName.getInputFileName();
    PersonConvertBinary personConvertBinary =new PersonConvertBinary();
    @Override
    public void write(List<Person> personList) {
        try {
            fileHelper.saveToFile(personConvertBinary.convertPersonToStr(personList),fileName);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @Override
    public List<Person> read() {

        return null;
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
