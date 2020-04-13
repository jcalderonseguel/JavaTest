package com.javaTest;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Formatter;
import java.util.List;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        System.out.println("hello test");
        // readClearSortSaveString();
        readClearSortCharArray();
    }

    public static void readClearSortSaveString() {
        try {
            String content = Helper.readFromFile("file.txt");
            System.out.println(String.format("String before: %s", content));
            Helper.writeToFile("artour.txt", Helper.sortString(content.replaceAll("[AEIOUaeiou]", "")));
            content = Helper.readFromFile("artour.txt");
            System.out.println(String.format("String after: %s", content));

        } catch (IOException e) {
            System.out.println(e.getClass().getSimpleName() + " - " + e.getMessage());
        }
    }

    public static void readClearSortCharArray() {
        char[] buff = new char[8];
        TreeSet<Character> tree = new TreeSet<>(new CharComparator()); // order by char
        try (Reader reader = Helper.openReader("file.txt");
             Writer writer = Helper.openWriter("artour.txt")) {

            while ((reader.read(buff)) >= 0) {
                for (Character character : buff) {
                    if (!Helper.isVocal(character))
                        tree.add(character);
                }
            }
            tree.forEach(System.out::print);

            for (Character character: tree)
                writer.write(character);

        } catch (IOException e) {
            System.out.println(e.getClass().getSimpleName() + " - " + e.getMessage());
        }
    }
}
