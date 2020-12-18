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
        start();
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

