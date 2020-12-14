package com.company;


import com.google.gson.*;
import com.sun.corba.se.spi.orbutil.threadpool.Work;
import jdk.nashorn.internal.parser.JSONParser;
import sun.rmi.runtime.Log;


import java.io.*;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class Main extends Object {
    private Executable executor;

    public static void main(String[] args) {
//       start();
//        workJson workJson = new workJson();
//        workJson.addINJson();

        new Main().startApp();

        // write your code here
    }

    public void startApp() {
//        System.out.println("Выберете формат файла:");
        Scanner scanner = new Scanner(System.in);
//        String format = scanner.nextLine(); // binary
//        switch (format) {
//            case "binary": executor = new BinaryExecutor(); break;
//            case "json": executor = new JsonExecutor(); break;
//            default:
//                System.out.println("неправильно введен формат");
//                System.exit(0);
//        }
        String personData = scanner.nextLine(); // 1 Vasya Pupkin 23 Ganduras
        String[] array = personData.split(" ");
        Person userPerson = new Person(Integer.parseInt(array[0]), array[1], array[2], Integer.parseInt(array[3]), array[4]);
        executor.write(userPerson);
        List<Person> persons = executor.read();
        for (Person person: persons) {
            System.out.println(person.toString());
        }
    }


    public static void start() {
        ScanerFileName scanerFileName = new ScanerFileName();
        try {
            scanerFileName.scannerFileNameAndCreateFile();
        } catch (IOException e) {
            System.out.println("Что то не так");
        }




        }




    ;

}
