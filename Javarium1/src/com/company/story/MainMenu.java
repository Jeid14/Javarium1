package com.company.story;

import com.company.CRUD.Delete;
import com.company.ScanerFileName;
import com.company.executor.ExecutorFactory;
import com.company.CRUD.Create;
import com.company.model.Person;
import com.company.CRUD.Update;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class MainMenu {

    Scanner scanner = new Scanner(System.in);
    private String fileName;
    private String fileExtension;

    List<Person> newPersons = new ArrayList<>();

    public void mainMenu() throws IOException {
        System.out.println(ConstantString.WELCOME);
        System.out.println("Для начала введите название файла:");
        ScanerFileName scanerFileName = new ScanerFileName();
        fileName = scanerFileName.getInputFileName();
        fileExtension = scanerFileName.getFileExtension();
        scanerFileName.isEmpty(fileName);


        fourCommand();
        doThis(scanner.nextLine());


    }

    public void doThis(String command) throws IOException {

        List<Person> personList = new ExecutorFactory().getInstanceByFormat(fileExtension).read(fileName);
        if (command.equalsIgnoreCase(ConstantString.EXIT)) {
            System.exit(0);
        }

        while (!command.equalsIgnoreCase(ConstantString.EXIT)) {
            switch (command.toLowerCase(Locale.ROOT)) {
                case ConstantString.READ:
                    for (Person p : personList) {
                        System.out.println(p);
                    }
                    fourCommand();
                    doThis(scanner.nextLine());
                    break;
                case ConstantString.CREATE:
                    Create create = new Create();
                    newPersons = create.createPerson(personList);
                    System.out.println("Создание успешно!");

                    fourCommand();
                    doThis(scanner.nextLine());
                    break;
                case ConstantString.UPDATE:
                    System.out.println(ConstantString.ENTER_ID);
                    int id = scanner.nextInt();
                    Update update = new Update();
                    newPersons = update.updatePerson(personList, id);
                    System.out.println("Обновление успешно!");
                    fourCommand();
                    doThis(scanner.nextLine());
                    break;
                case ConstantString.DELETE:
                    Delete delete = new Delete();
                    newPersons = delete.deleteOnePerson(personList);
                    System.out.println("Удаление успешно!");
                    fourCommand();
                    doThis(scanner.nextLine());
                    break;
                case ConstantString.START:
                    saveChange();
                    fourCommand();
                    doThis(scanner.nextLine());
                    break;
                case ConstantString.SWITCH:
                    System.out.println("Введите имя название нового файлаЖ");
                    fileName = scanner.nextLine();
                    System.out.println("Вы уверены");
                    System.out.println("Введите еще раз имя файла на который хотите изменить:");
                    fileExtension = new ScanerFileName().getFileExtension(fileName);

                System.out.println("Теперь мы работаем с " + fileName);
                    fourCommand();
                    doThis(scanner.nextLine());
                    break;
                default:
                    System.out.println("Неправилься команда, попробуйте еще раз!");
                    doThis(scanner.nextLine());
                    break;

            }
        }
    }



    public void fourCommand() throws IOException {
        System.out.println("Доступны 4 команды:");
        System.out.println(ConstantString.CREATE.toUpperCase(Locale.ROOT) + "      " + ConstantString.UPDATE.toUpperCase(Locale.ROOT) + "      " + ConstantString.DELETE.toUpperCase(Locale.ROOT) + "      " + ConstantString.READ.toUpperCase(Locale.ROOT));

        System.out.println(ConstantString.CREATE_COMMAND);
        System.out.println(ConstantString.UPDATE_COMMAND);
        System.out.println(ConstantString.DELETE_COMMAND);
        System.out.println(ConstantString.READ_COMMAND);
        System.out.println("Вводите команду!");
    }

    public void saveChange() throws IOException {
        new ExecutorFactory().getInstanceByFormat(fileExtension).write(fileName, newPersons);
        System.out.println("Изменения сохранены!");


    }


}
