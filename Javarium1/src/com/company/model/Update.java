package com.company.model;

import com.company.ScanerFileName;
import com.company.story.ConstantString;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Update {
    Scanner scanner = new Scanner(System.in);

    public List<Person> updatePerson(List<Person> personList, int id) {
        for (Person p : personList) {
            if (p.getId() == id) {
//                p.setId(id);
                System.out.println(ConstantString.ENTER_FIRST_NAME);
                p.setFirstName(scanner.nextLine());
                System.out.println(ConstantString.ENTER_LAST_NAME);
                p.setLastName(scanner.nextLine());
                System.out.println(ConstantString.ENTER_CITY);
                p.setCity(scanner.nextLine());
                System.out.println(ConstantString.ENTER_AGE);
                p.setAge(scanner.nextInt());

            }
//

        }
        return personList;
    }
}
