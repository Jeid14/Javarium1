package com.company.utils;

import com.company.CRUD.Create;
import com.company.executor.ExecutorFactory;
import com.company.model.Person;
import com.company.utils.FileHelper;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ScanerFileName {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)); //
    public static String inputFileName;

    {
        inputFileName = scannerFileNameAndCreateFile();
    }


    public String scannerFileNameAndCreateFile() {
        String file = "";

        try {
            file = reader.readLine();
            FileReader reader = new FileReader(file);
//            reader.close();

        } catch (IOException e) {
            System.out.println("File are not found. Create new!");
            inputFileName = file;
            File yourFile = new File(inputFileName);
            try {
                yourFile.createNewFile();
            } catch (IOException ioException) {
                ioException.printStackTrace();
            }
            return file;

        }
        return file;

    }

    public static String getInputFileName() {
        return inputFileName;

    }

    public static String getFileExtension() {
        return getFileExtension(getInputFileName());

    }

    public static String getFileExtension(String inputFileName) {
        inputFileName = getInputFileName();
        // если в имени файла есть точка и она не является первым символом в названии файла
        if (inputFileName.lastIndexOf(".") != -1 && inputFileName.lastIndexOf(".") != 0)
            // то вырезаем все знаки после последней точки в названии файла, то есть ХХХХХ.txt -> txt
            return inputFileName.substring(inputFileName.lastIndexOf(".") + 1);
            // в противном случае возвращаем заглушку, то есть расширение не найдено
        else return " ";
    }




}


