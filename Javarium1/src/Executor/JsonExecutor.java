package Executor;

import com.company.ConvertStringToFormat.PersonConverterJson;
import com.company.Person;

import java.io.*;
import java.util.ArrayList;

public class JsonExecutor implements Executable {
    PersonConverterJson personConverterJson = new PersonConverterJson();



    @Override
    public void write(Person person) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter("1.json"));
        writer.write(personConverterJson.convertPersonToStr(person));


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
