package com.company.CRUD;

import com.company.model.Person;
import com.company.story.ConstantString;
import com.company.story.MainMenu;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Delete {
    Scanner scanner = new Scanner(System.in);

    public List<Person> deleteOnePerson(List<Person> personList) throws IOException {
        int count = 0;
        Person personForDelete = new Person();
        List<Person> newPersons = new ArrayList<>();
        System.out.println(ConstantString.ENTER_ID);
        int id = scanner.nextInt();

        for (Person p : personList) {
            if (p.getId() == id) {
                personForDelete = p;
                count++;

            }

        }
        if (count == 0) {
            System.out.println("Такой персоны нет");
            MainMenu mainMenu = new MainMenu();
            mainMenu.doThis(ConstantString.READ);
            // newPersons = personList;
        }
        personList.remove(personForDelete);
        newPersons = personList;

        return newPersons;
    }
}
