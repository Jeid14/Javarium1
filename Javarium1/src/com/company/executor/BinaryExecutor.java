package com.company.executor;

import com.company.model.Person;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class BinaryExecutor implements Executable, Serializable {

    @Override
    public void write(String fileName, List<Person> personList) throws IOException {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName))) {
            for (Person person : personList) {
                oos.writeObject(person);

            }
        } catch (Exception ex) {

            System.out.println(ex.getMessage());
        }


    }

    @Override
    public List<Person> read(String fileName) throws IOException {
        ArrayList<Person> newPerson = new ArrayList<Person>();
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName))) {

            return newPerson= ((ArrayList<Person>) ois.readObject());
        } catch (Exception ex) {

            System.out.println(ex.getMessage());


            return newPerson;
        }
    }
}
