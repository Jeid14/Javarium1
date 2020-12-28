package com.company;

import java.io.*;

public class ScanerFileName {

    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)); //
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
//           while (is.available() > 0) {
//               System.out.print((char) is.read());// напишите тут ваш код
//            }
            System.out.println(getFileExtension(inputFileName));
            is.close();
            reader.close();

        } catch (FileNotFoundException e) {
            System.out.println("Такого файла еще не существует!Мы создаем его");
            File yourFile = new File(inputFileName);
            yourFile.createNewFile();
            System.out.println(getFileExtension(inputFileName));
            FileOutputStream oFile = new FileOutputStream(inputFileName, false);

        }

    }
    public  final String getInputFileName(){
        this.inputFileName = inputFileName;
        return inputFileName;

    }
    public   String getFileExtension(String inputFileName) {
        // если в имени файла есть точка и она не является первым символом в названии файла
        if(inputFileName.lastIndexOf(".") != -1 && inputFileName.lastIndexOf(".") != 0)
            // то вырезаем все знаки после последней точки в названии файла, то есть ХХХХХ.txt -> txt
            return inputFileName.substring(inputFileName.lastIndexOf(".")+1);
            // в противном случае возвращаем заглушку, то есть расширение не найдено
        else return "";
    }
    public void choiseWay(String getFileExtension){
        switch (getFileExtension){
            case  "YAML": System.out.println("Работаем с ямл");break;
            case  "json": System.out.println("Работаем с жсон");break;
            case "XML":
                System.out.println("Работаем с ХМЛ");break;
            case "BINARY":
                System.out.println("Работаем с бинари");
            default:
                System.out.println("Huina");

        }
    }
}

