package Executor;

import com.company.ConvertStringToFormat.PersonConverterJson;
import com.company.Person;
import com.company.stringformat.IPersonConvertor;
import com.company.ScanerFileName;

import java.io.*;
import java.util.ArrayList;

public class JsonExecutor implements Executable{
   private final IPersonConvertor convertor;

    public JsonExecutor() {
        convertor = ;
    }


    @Override
    public void write(Person person) throws IOException {


    }

    @Override
    public ArrayList<Person> read() throws IOException {


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
