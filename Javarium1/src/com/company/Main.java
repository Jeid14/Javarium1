package com.company;


import com.google.gson.*;
import jdk.nashorn.internal.parser.JSONParser;
import sun.rmi.runtime.Log;


import java.io.*;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
      //  start();

        // write your code here
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
