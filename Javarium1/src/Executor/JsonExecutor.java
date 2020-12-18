package Executor;

import com.company.ConvertStringToFormat.PersonConverterJson;
import com.company.Person;
import com.company.ScanerFileName;

import java.io.*;
import java.util.ArrayList;

public class JsonExecutor implements Executable {
    ScanerFileName scanerFileName = new ScanerFileName();


    PersonConverterJson personConverterJson = new PersonConverterJson();
    BufferedWriter writer;

    {
        try {
            writer = new BufferedWriter(new FileWriter(scanerFileName.getInputFileName()));

        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    @Override
    public void write(Person person) throws IOException {
        writer.append(' ');
        writer.append(personConverterJson.convertPersonToStr(person));


    }

    @Override
    public ArrayList<Person> read() throws IOException {
        ArrayList<Person> result = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader("1.json"))) {
            while (br.ready()) {
                Person person = new Person(br.read(),br.readLine(),br.readLine(),br.read(),br.readLine());
                result.add(person);
            }
        }


        return result;
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
