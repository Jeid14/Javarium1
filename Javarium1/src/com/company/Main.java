package com.company;

import java.util.*;
import Executor.Executable;
import Executor.JsonExecutor;
import com.company.ConvertStringToFormat.PersonConverterJson;

import java.io.IOException;

public class Main extends Object {
    private Executable executor;

    public static void main(String[] args) {
        Person person1 = new Person(11,"3ddd","a22a",12,"f2");
        PersonConverterJson personConverterJson = new PersonConverterJson();
    JsonExecutor jsonExecutor = new JsonExecutor();
    jsonExecutor.write(person1);




        }






    public static void start() {
        ScanerFileName scanerFileName = new ScanerFileName();
        //  scanerFileName.scannerFileNameAndCreateFile();
        scanerFileName.choiseWay(scanerFileName.getFileExtension(scanerFileName.inputFileName));
//        } catch (IOException e) {
//            System.out.println("Что то не так");
//


        ;


    }
}

