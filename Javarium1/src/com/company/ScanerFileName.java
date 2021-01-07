package com.company;

import com.company.CRUD.Create;
import com.company.executor.ExecutorFactory;
import com.company.model.Person;
import com.company.utils.FileHelper;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ScanerFileName {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)); //
    public String inputFileName;

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
            System.out.println("Такого файла еще не существует!Мы создаем его");
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

    public String getInputFileName() {
        return inputFileName;

    }

    public String getFileExtension() {
        return getFileExtension(getInputFileName());

    }

    public void setInputFileName(String fileName) {
        inputFileName = fileName;
    }

    public String getFileExtension(String inputFileName) {
        inputFileName = getInputFileName();
        // если в имени файла есть точка и она не является первым символом в названии файла
        if (inputFileName.lastIndexOf(".") != -1 && inputFileName.lastIndexOf(".") != 0)
            // то вырезаем все знаки после последней точки в названии файла, то есть ХХХХХ.txt -> txt
            return inputFileName.substring(inputFileName.lastIndexOf(".") + 1);
            // в противном случае возвращаем заглушку, то есть расширение не найдено
        else return "Неверно";
    }
    public void isEmpty(String inputFileName) throws IOException {
        File yourFile = new File(inputFileName);
       if(yourFile.length()==0){
           Person person = new Person(0," "," ",0," ");
           List<Person> personList = new ArrayList<>();
           personList.add(person);
           FileHelper fileHelper = new FileHelper();
           new ExecutorFactory().getInstanceByFormat(getFileExtension()).write(getInputFileName(),personList);
       }

    }


}


