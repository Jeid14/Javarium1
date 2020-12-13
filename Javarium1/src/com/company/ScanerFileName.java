package com.company;

import java.io.*;

public class ScanerFileName {

    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    String inputFileName;

    {
        try {
            inputFileName = reader.readLine();
        } catch (IOException e) {
            System.out.println("Проблема с названием или форматом");
        }
    }

    public void scannerFileNameAndCreateFile() throws IOException {
        try {

            InputStream is = new FileInputStream(inputFileName);
//            while (is.available() > 0) {
//                System.out.print((char) is.read());// напишите тут ваш код
//            }
            System.out.println(getFileExtension(inputFileName));
            is.close();
            reader.close();

        } catch (FileNotFoundException e) {
            System.out.println("Такого файла еще не существует!Мы создаем его");
            File yourFile = new File(inputFileName);
            yourFile.createNewFile(); // if file already exists will do nothing
            System.out.println(getFileExtension(inputFileName));
            FileOutputStream oFile = new FileOutputStream(inputFileName, false);

        }

    }
    public   String getFileExtension(String inputFileName) {
        // если в имени файла есть точка и она не является первым символом в названии файла
        if(inputFileName.lastIndexOf(".") != -1 && inputFileName.lastIndexOf(".") != 0)
            // то вырезаем все знаки после последней точки в названии файла, то есть ХХХХХ.txt -> txt
            return inputFileName.substring(inputFileName.lastIndexOf(".")+1);
            // в противном случае возвращаем заглушку, то есть расширение не найдено
        else return "";
    }
}

