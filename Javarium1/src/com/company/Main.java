package com.company;


import Executor.Executable;
import Executor.JsonExecutor;

public class Main extends Object {
    private Executable executor;

    public static void main(String[] args) {

        JsonExecutor jsonExecutor = new JsonExecutor();
        Person person = new Person(1,"ddd","aa",12,"ff");

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

