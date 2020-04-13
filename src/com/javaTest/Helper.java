package com.javaTest;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

class CharComparator implements Comparator<Character> {
    public int compare(Character x, Character y) {
        // return -1; // x<y
        //return 1; // x>y
        // return 0; // x=y
        return x.compareTo(y);
    }
}

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

    static public Reader openReader(String fileName) throws IOException {
        return Files.newBufferedReader(Paths.get(fileName));
    }

    static public Writer openWriter(String fileName) throws IOException {
        Path path = Paths.get(fileName);
        if(path.toFile().exists()){
            Writer writer = Files.newBufferedWriter(path, StandardOpenOption.APPEND);

            if (path.toFile().length()>0)
                writer.write("\r");
            return writer;
        }
        else
            return Files.newBufferedWriter(path, StandardOpenOption.CREATE_NEW);
    }

    public static boolean isVocal(char c) {
        return "AEIOUaeiou".indexOf(c) != -1;
    }
}
