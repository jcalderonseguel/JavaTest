package com.javaTest;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Formatter;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("hello test");
        readClearSortSaveString();
    }

    public static void readClearSortSaveString() {
        try {
            String content = Helper.readFromFile("file.txt");
            System.out.println(String.format("String before: %s", content));
            Helper.writeToFile("artour.txt",Helper.sortString(content.replaceAll("[AEIOUaeiou]", "")));
            content = Helper.readFromFile("artour.txt");
            System.out.println(String.format("String after: %s", content));

        } catch (IOException e) {
            System.out.println(e.getClass().getSimpleName() + " - " + e.getMessage());
        }
    }
}
