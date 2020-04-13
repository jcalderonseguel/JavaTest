package com.javaTest;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.Scanner;

public class Helper {
    static public String readFromFile(String fileName) throws IOException {
        return Files.readString(Paths.get(fileName), StandardCharsets.US_ASCII);
    }

    static public void writeToFile(String fileName, String output) throws FileNotFoundException {
        PrintWriter out = new PrintWriter(fileName);
        out.println(output);
        out.close();
    }

    static public String sortString(String inputString){
        char charArray[] = inputString.toCharArray();
        Arrays.sort(charArray);
        return new String(charArray);
    }
}
