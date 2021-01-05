package com.company.model;

import com.company.ScanerFileName;
import com.company.executor.ExecutorFactory;
import com.company.executor.StringFormatExecutor;
import com.company.story.ConstantString;
import com.company.utils.FileHelper;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class Create {
    Scanner scanner = new Scanner(System.in);
    Scanner scanner2 = new Scanner(System.in);

    public List<Person> createPerson() throws IOException {
        Person person = new Person();
        List<Person> personList = new ExecutorFactory().getInstanceByFormat(ScanerFileName.getFileExtension(ScanerFileName.getInputFileName())).read(ScanerFileName.getInputFileName());

        System.out.println("Enter Id");
        person.setId(scanner.nextInt());
        for (Person p : personList) {
            if (p.getId() == person.getId()) {
                System.out.println("Персона с id: " + p.getId() + " существует!Обновить?");
                System.out.println("Ваш ответ:");
                String answer = scanner.nextLine();
                if (answer.equalsIgnoreCase("Yes")) {
                    Update update = new Update();
                    update.updatePerson(personList, p.getId());
                    break;
                }
            } else if(p.getId()!=person.getId()){

                System.out.println(ConstantString.ENTER_FIRST_NAME);
                person.setFirstName(scanner.nextLine());
                System.out.println(ConstantString.ENTER_LAST_NAME);
                person.setLastName(scanner2.nextLine());
                System.out.println(ConstantString.ENTER_CITY);
                person.setCity(scanner.nextLine());
                System.out.println(ConstantString.ENTER_AGE);
                person.setAge(scanner.nextInt());
                personList.add(person);
                System.out.println(personList);
                break;

            }
        }
        return personList;

    }
}
