package com.company.utils;

import com.company.ConvertStringToFormat.PersonConverterJson;
import com.company.ScanerFileName;
import sun.misc.IOUtils;

import java.io.*;

public class FileHelper {

    public void saveToFile(String content,String fileName) throws IOException {
       BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));
       writer.write(content);

    }
    public  String readFromFile(String fileName) throws FileNotFoundException {

        return " ";
    }
}
