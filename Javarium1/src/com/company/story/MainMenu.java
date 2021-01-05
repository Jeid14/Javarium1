package com.company.story;

import com.company.ScanerFileName;
import com.company.model.Create;

import java.io.IOException;
import java.util.Scanner;

public class MainMenu {
    Scanner scanner = new Scanner(System.in);
    public void mainMenu(){
        System.out.println(ConstantString.WELCOME);
        System.out.println("Для начала введите название вайла");
        ScanerFileName scanerFileName = new ScanerFileName();
        System.out.println("Доступны 4 команды:");

        System.out.println(ConstantString.CREATE_COMMAND);
        System.out.println(ConstantString.UPDATE_COMMAND);
        System.out.println(ConstantString.DELETE_COMMAND);
        System.out.println(ConstantString.READ_COMMAND);

        System.out.println("Вводите команду!");
        if(scanner.nextLine().equalsIgnoreCase(ConstantString.CREATE)){
            Create create = new Create();
            try {
                create.createPerson();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }

    }

}
