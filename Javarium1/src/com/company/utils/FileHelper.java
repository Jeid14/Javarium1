package com.company.utils;

import java.io.*;

public class FileHelper {


    public void saveToFile(String content, String fileName) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true));
        writer.write(content);
        writer.append('\n');
        writer.close();

    }

    public String readFromFile(String fileName) throws IOException {
        String line = " ";
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {

            while ((line = reader.readLine()) != null) {
                 line = line + "\n";
                return line;
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }

        return line;
    }
}
