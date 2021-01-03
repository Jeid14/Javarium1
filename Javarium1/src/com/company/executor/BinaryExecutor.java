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
        List<Person> newPerson = new ArrayList();
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName))) {
            Object object = ois.readObject();
            if (object instanceof Person) {
                Person person = (Person) object;
                newPerson.add(person);
//                for(Person p : newPerson) {
//                    //System.out.printf("Id: %s \t FirstName: %s \tLastName: %s \t City: %s \t  Age: %d \n",p.getId(), p.getFirstName(),p.getLastName(),p.getCity(), p.getAge());
//                }
                ois.close();
            }
        } catch (Exception ex) {

            System.out.println(ex.getMessage());
        }


        return newPerson;
    }

    @Override
    public void update(String fileName, List<Person> person) {

    }

    @Override
    public void delete(String fileName) {

    }
}
