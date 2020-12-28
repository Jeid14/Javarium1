package com.company;

import java.util.*;

import com.company.executor.Executable;
import com.company.converterstr.PersonConvertToXML;
import com.company.model.Person;
import com.company.utils.FileHelper;

public class Main extends Object {
    private Executable executor;

    public static void main(String[] args) {

        ScanerFileName scanerFileName = new ScanerFileName();
        FileHelper fileHelper = new FileHelper();
        PersonConvertToXML personConvertToXML = new PersonConvertToXML();


        Person person1 = new Person(11, "3ddd", "a22a", 12, "f2");
        Person person2 = new Person(10, "ff", "FF", 133, "Kiev");
        Person person3 = new Person(110, "f11f", "FF22", 03, "XZ");

        List<Person> personList = new ArrayList<>();


        personList.add(person1);
        personList.add(person2);
        personList.add(person3);
        personConvertToXML.convertPersonToStr(personList);


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

